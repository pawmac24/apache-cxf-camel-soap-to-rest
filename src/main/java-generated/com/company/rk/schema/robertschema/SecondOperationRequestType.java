
package com.company.rk.schema.robertschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecondOperationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondOperationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inFirstParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondOperationRequestType", propOrder = {
    "inFirstParam"
})
public class SecondOperationRequestType {

    @XmlElement(required = true)
    protected String inFirstParam;

    /**
     * Gets the value of the inFirstParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFirstParam() {
        return inFirstParam;
    }

    /**
     * Sets the value of the inFirstParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFirstParam(String value) {
        this.inFirstParam = value;
    }

}
