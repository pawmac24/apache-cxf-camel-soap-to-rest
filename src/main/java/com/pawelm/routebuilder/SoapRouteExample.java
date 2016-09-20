package com.pawelm.routebuilder;

import com.pawelm.service.OrderService;
import com.pawelm.service.PawelService;
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
	OrderService orderService;

	@Autowired
	PawelService pawelService;

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
			}
		}).log("Body after ${body}");

	}
}