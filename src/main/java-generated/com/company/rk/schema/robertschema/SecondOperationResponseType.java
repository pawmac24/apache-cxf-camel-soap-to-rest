
package com.company.rk.schema.robertschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecondOperationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondOperationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outFirstParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outSecondParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outThirdParam" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondOperationResponseType", propOrder = {
    "outFirstParam",
    "outSecondParam",
    "outThirdParam"
})
public class SecondOperationResponseType {

    @XmlElement(required = true)
    protected String outFirstParam;
    @XmlElement(required = true)
    protected String outSecondParam;
    protected int outThirdParam;

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

    /**
     * Gets the value of the outSecondParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondParam() {
        return outSecondParam;
    }

    /**
     * Sets the value of the outSecondParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondParam(String value) {
        this.outSecondParam = value;
    }

    /**
     * Gets the value of the outThirdParam property.
     * 
     */
    public int getOutThirdParam() {
        return outThirdParam;
    }

    /**
     * Sets the value of the outThirdParam property.
     * 
     */
    public void setOutThirdParam(int value) {
        this.outThirdParam = value;
    }

}
