package com.company.pm.service.pawel;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2016-09-22T15:14:23.817+02:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "http://www.pm.company.com/service/Pawel/", name = "Pawel")
@XmlSeeAlso({com.company.pm.schema.pawelschema.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Pawel {

    @WebResult(name = "firstOperationResponse", targetNamespace = "http://www.pm.company.com/schema/PawelSchema", partName = "firstOperationResponse")
    @WebMethod(operationName = "FirstOperation", action = "http://www.pm.company.com/service/Pawel/FirstOperation")
    public com.company.pm.schema.pawelschema.FirstOperationResponseType firstOperation(
        @WebParam(partName = "firstOperationRequest", name = "firstOperationRequest", targetNamespace = "http://www.pm.company.com/schema/PawelSchema")
        com.company.pm.schema.pawelschema.FirstOperationRequestType firstOperationRequest
    );
}
