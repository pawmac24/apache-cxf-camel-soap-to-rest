
package com.company.pm.schema.pawelschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirstOperationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirstOperationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outFirstParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirstOperationResponseType", propOrder = {
    "outFirstParam"
})
public class FirstOperationResponseType {

    @XmlElement(required = true)
    protected String outFirstParam;

    /**
     * Gets the value of the outFirstParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstParam() {
        return outFirstParam;
    }

    /**
     * Sets the value of the outFirstParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstParam(String value) {
        this.outFirstParam = value;
    }

}
