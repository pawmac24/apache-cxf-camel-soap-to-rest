package com.pawelm.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.pluralsight.schema.order.OrderStatusType;
import org.springframework.stereotype.Service;

import com.pluralsight.schema.order.AccountType;
import com.pluralsight.schema.order.BookType;
import com.pluralsight.schema.order.ObjectFactory;
import com.pluralsight.schema.order.OrderInquiryResponseType;
import com.pluralsight.schema.order.OrderInquiryType;
import com.pluralsight.schema.order.OrderItemType;
import com.pluralsight.schema.order.OrderType;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Override
	public OrderInquiryResponseType processOrder(OrderInquiryType inquiry) {
		ObjectFactory factory = new ObjectFactory();
		OrderInquiryResponseType response = factory.createOrderInquiryResponseType();
		AccountType account = factory.createAccountType();
		account.setAccountId(inquiry.getAccountId());
		response.setAccount(account);

		OrderItemType orderItem = factory.createOrderItemType();
		BookType book = factory.createBookType();
		book.setEan13(inquiry.getEan13());
		book.setTitle("My favourite book");
		orderItem.setBook(book);
		try {
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(new Date(System.currentTimeMillis()));
			XMLGregorianCalendar estimatedShippingDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			orderItem.setExpectedShippingDate(estimatedShippingDate);
		} catch (Exception localException) {
		}
		orderItem.setLineNumber(Integer.valueOf(1).intValue());
		orderItem.setPrice(new BigDecimal(5));
		orderItem.setQuantityShipped(inquiry.getOrderQuantity());

		OrderType order = factory.createOrderType();
		order.setOrderStatus(OrderStatusType.READY);
		order.getOrderItems().add(orderItem);
		response.setOrder(order);
		return response;
	}
}
