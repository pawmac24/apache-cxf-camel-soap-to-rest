
package com.company.pm.schema.pawelschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirstOperationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirstOperationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inFirstParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inSecondParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inThirdParam" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirstOperationRequestType", propOrder = {
    "inFirstParam",
    "inSecondParam",
    "inThirdParam"
})
public class FirstOperationRequestType {

    @XmlElement(required = true)
    protected String inFirstParam;
    @XmlElement(required = true)
    protected String inSecondParam;
    protected int inThirdParam;

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

    /**
     * Gets the value of the inSecondParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSecondParam() {
        return inSecondParam;
    }

    /**
     * Sets the value of the inSecondParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSecondParam(String value) {
        this.inSecondParam = value;
    }

    /**
     * Gets the value of the inThirdParam property.
     * 
     */
    public int getInThirdParam() {
        return inThirdParam;
    }

    /**
     * Sets the value of the inThirdParam property.
     * 
     */
    public void setInThirdParam(int value) {
        this.inThirdParam = value;
    }

}
