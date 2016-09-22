
package com.company.rk.schema.robertschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.company.rk.schema.robertschema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SecondOperationResponse_QNAME = new QName("http://www.rk.company.com/schema/RobertSchema", "secondOperationResponse");
    private final static QName _SecondOperationRequest_QNAME = new QName("http://www.rk.company.com/schema/RobertSchema", "secondOperationRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.company.rk.schema.robertschema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SecondOperationResponseType }
     * 
     */
    public SecondOperationResponseType createSecondOperationResponseType() {
        return new SecondOperationResponseType();
    }

    /**
     * Create an instance of {@link SecondOperationRequestType }
     * 
     */
    public SecondOperationRequestType createSecondOperationRequestType() {
        return new SecondOperationRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecondOperationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.rk.company.com/schema/RobertSchema", name = "secondOperationResponse")
    public JAXBElement<SecondOperationResponseType> createSecondOperationResponse(SecondOperationResponseType value) {
        return new JAXBElement<SecondOperationResponseType>(_SecondOperationResponse_QNAME, SecondOperationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecondOperationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.rk.company.com/schema/RobertSchema", name = "secondOperationRequest")
    public JAXBElement<SecondOperationRequestType> createSecondOperationRequest(SecondOperationRequestType value) {
        return new JAXBElement<SecondOperationRequestType>(_SecondOperationRequest_QNAME, SecondOperationRequestType.class, null, value);
    }

}
