package com.pluralsight.service.orders;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2016-09-12T16:43:19.894+02:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "http://www.pluralsight.com/service/Orders/", name = "Orders")
@XmlSeeAlso({com.pluralsight.schema.order.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Orders {

    @WebResult(name = "orderInquiryResponse", targetNamespace = "http://www.pluralsight.com/schema/Order", partName = "orderInquiryResponse")
    @WebMethod(operationName = "ProcessOrderPlacement", action = "http://www.pluralsight.com/service/Orders/ProcessOrderPlacement")
    public com.pluralsight.schema.order.OrderInquiryResponseType processOrderPlacement(
        @WebParam(partName = "orderInquiry", name = "orderInquiry", targetNamespace = "http://www.pluralsight.com/schema/Order")
        com.pluralsight.schema.order.OrderInquiryType orderInquiry
    );
}
