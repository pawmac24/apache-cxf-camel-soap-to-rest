
package com.company.pm.schema.pawel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.company.pm.schema.pawel package. 
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

    private final static QName _FirstOperation_QNAME = new QName("http://www.pm.company.com/schema/Pawel", "FirstOperation");
    private final static QName _FirstOperationResponse_QNAME = new QName("http://www.pm.company.com/schema/Pawel", "FirstOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.company.pm.schema.pawel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FirstOperationType }
     * 
     */
    public FirstOperationType createFirstOperationType() {
        return new FirstOperationType();
    }

    /**
     * Create an instance of {@link FirstOperationResponseType }
     * 
     */
    public FirstOperationResponseType createFirstOperationResponseType() {
        return new FirstOperationResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstOperationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pm.company.com/schema/Pawel", name = "FirstOperation")
    public JAXBElement<FirstOperationType> createFirstOperation(FirstOperationType value) {
        return new JAXBElement<FirstOperationType>(_FirstOperation_QNAME, FirstOperationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstOperationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pm.company.com/schema/Pawel", name = "FirstOperationResponse")
    public JAXBElement<FirstOperationResponseType> createFirstOperationResponse(FirstOperationResponseType value) {
        return new JAXBElement<FirstOperationResponseType>(_FirstOperationResponse_QNAME, FirstOperationResponseType.class, null, value);
    }

}
