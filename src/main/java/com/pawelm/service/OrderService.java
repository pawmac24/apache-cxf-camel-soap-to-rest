package com.pawelm.service;

import com.pluralsight.schema.order.OrderInquiryResponseType;
import com.pluralsight.schema.order.OrderInquiryType;

public interface OrderService {

	OrderInquiryResponseType processOrder(OrderInquiryType inquiry);
}
