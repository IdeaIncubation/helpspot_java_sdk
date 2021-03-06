//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.11 at 01:59:42 PM CDT 
//


package com.github.stinkbird.helpspot.private_api.response_for.request.get_mailboxes;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}xMailbox"/>
 *         &lt;element ref="{}sReplyName"/>
 *         &lt;element ref="{}sReplyEmail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xMailbox",
    "sReplyName",
    "sReplyEmail"
})
@XmlRootElement(name = "mailbox")
public class Mailbox implements Serializable {

	private static final long serialVersionUID = 2344868684616105704L;
	
	@XmlElement(required = false)
    protected BigInteger xMailbox;
    @XmlElement(required = false)
    protected String sReplyName;
    @XmlElement(required = false)
    protected String sReplyEmail;

    /**
     * Gets the value of the xMailbox property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXMailbox() {
        return xMailbox;
    }

    /**
     * Sets the value of the xMailbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXMailbox(BigInteger value) {
        this.xMailbox = value;
    }

    /**
     * Gets the value of the sReplyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSReplyName() {
        return sReplyName;
    }

    /**
     * Sets the value of the sReplyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSReplyName(String value) {
        this.sReplyName = value;
    }

    /**
     * Gets the value of the sReplyEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSReplyEmail() {
        return sReplyEmail;
    }

    /**
     * Sets the value of the sReplyEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSReplyEmail(String value) {
        this.sReplyEmail = value;
    }

}
