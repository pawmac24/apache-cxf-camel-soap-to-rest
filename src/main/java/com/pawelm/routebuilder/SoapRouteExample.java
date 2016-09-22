package com.pawelm.routebuilder;

import com.company.pm.schema.pawelschema.FirstOperationRequestType;
import com.company.pm.schema.pawelschema.FirstOperationResponseType;
import com.company.rk.schema.robertschema.ObjectFactory;
import com.company.rk.schema.robertschema.SecondOperationRequestType;
import com.company.rk.schema.robertschema.SecondOperationResponseType;
import com.pawelm.service.OrderService;
import com.pawelm.service.PawelService;
import com.pawelm.service.RobertService;
import com.pluralsight.schema.order.OrderInquiryResponseType;
import com.pluralsight.schema.order.OrderInquiryType;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.cxf.message.MessageContentsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component("soapRouteExample")
@ImportResource(value = "classpath:META-INF/spring/camel-cxf.xml")
public class SoapRouteExample extends RouteBuilder {

	@Autowired
	private OrderService orderService;

	@Autowired
	private PawelService pawelService;

	@Autowired(required = true)
	private RobertService robertService;

	@Override
	public void configure() throws Exception {
		from("direct:start").routeId("wsClient").to("cxf:bean:orders");

		from("cxf:bean:orders").routeId("ordersRoute").log("orders before = ${body}").process(new Processor() {

			@Override
			public void process(Exchange exchange) throws Exception {
				MessageContentsList message = (MessageContentsList) exchange.getIn().getBody();
				OrderInquiryType orderInquiry = (OrderInquiryType) message.get(0);

				OrderInquiryResponseType response = orderService.processOrder(orderInquiry);

				exchange.getIn().setBody(response);
			}
		}).log("orders after = ${body}");


		from("direct:start2").routeId("wsClientPawel").to("cxf:bean:pawelEndpoint");

		from("cxf:bean:pawelEndpoint").log("pawelEndpoint before = ${body}").process(new Processor() {

			@Override
			public void process(Exchange exchange) throws Exception {

				MessageContentsList message = (MessageContentsList) exchange.getIn().getBody();
				FirstOperationRequestType request = (FirstOperationRequestType) message.get(0);
				FirstOperationResponseType response = pawelService.processRequest(request);
				exchange.getIn().setBody(response);
//				exchange.getIn().setHeader("operationName", "SecondOperation");
//				exchange.getIn().setHeader("operationNamespace", "http://www.rk.company.com/service/Robert/");
//				exchange.getIn().setHeader("SOAPAction", "http://www.rk.company.com/Robert/SecondOperation");
			}
		}).log("pawelEndpoint after = ${body}").process(new Processor() {
			@Override
			public void process(Exchange exchange) throws Exception {
				FirstOperationResponseType bodyContent = (FirstOperationResponseType) exchange.getIn().getBody();
				ObjectFactory objectFactory = new ObjectFactory();
				SecondOperationRequestType secondOperationRequestType = objectFactory.createSecondOperationRequestType();
				secondOperationRequestType.setInFirstParam(bodyContent.getOutFirstParam());
//				exchange.getIn().setBody(secondOperationRequestType);
			}
		});//.to("cxf:bean:robertEndpoint");

		from("cxf:bean:robertEndpoint").log("robertEndpoint before = ${body}").process(new Processor() {

			@Override
			public void process(Exchange exchange) throws Exception {

				MessageContentsList message = (MessageContentsList) exchange.getIn().getBody();
				SecondOperationRequestType request = (SecondOperationRequestType) message.get(0);
				SecondOperationResponseType response = robertService.processRequest(request);
				exchange.getIn().setBody(response);
			}
		}).log("robertEndpoint after = ${body}");

	}
}