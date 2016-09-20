package com.pawelm.routebuilder;

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
		from("cxf:bean:orders").log("${body}").process(new Processor() {

			@Override
			public void process(Exchange exchange) throws Exception {
				MessageContentsList message = (MessageContentsList) exchange.getIn().getBody();
				OrderInquiryType orderInquiry = (OrderInquiryType) message.get(0);

				OrderInquiryResponseType response = orderService.processOrder(orderInquiry);

				exchange.getIn().setBody(response);
			}
		}).log("Body after ${body}");

		from("cxf:bean:pawelEndpoint").log("${body}").process(new Processor() {

			@Override
			public void process(Exchange exchange) throws Exception {

				String message = exchange.getIn().getBody(String.class);
				String response = pawelService.processRequest(message);
				exchange.getIn().setBody(response);
				exchange.getIn().setHeader("operationName", "SecondOperation");
				exchange.getIn().setHeader("operationNamespace", "http://www.rk.company.com/Robert/");
				exchange.getIn().setHeader("SOAPAction", "http://www.rk.company.com/Robert/SecondOperation");
			}
		}).log("Body after ${body}").to("cxf:bean:robertEndpoint");

		from("cxf:bean:robertEndpoint").log("${body}").process(new Processor() {

			@Override
			public void process(Exchange exchange) throws Exception {

				String message = exchange.getIn().getBody(String.class);
				String response = robertService.processRequest(message);
				exchange.getIn().setBody(response);
			}
		}).log("Body after ${body}");

	}
}