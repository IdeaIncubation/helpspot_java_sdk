//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.11 at 01:55:52 PM CDT 
//


package com.github.stinkbird.helpspot.private_api.response_for.filter.get_stream;

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
 *         &lt;element ref="{}xRequestHistory"/>
 *         &lt;element ref="{}xRequest"/>
 *         &lt;element ref="{}xPerson"/>
 *         &lt;element ref="{}dtGMTChange"/>
 *         &lt;element ref="{}fPublic"/>
 *         &lt;element ref="{}fInitial"/>
 *         &lt;element ref="{}tNote"/>
 *         &lt;element ref="{}fNoteIsHTML"/>
 *         &lt;element ref="{}fMergedFromRequest"/>
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
    "xRequestHistory",
    "xRequest",
    "xPerson",
    "dtGMTChange",
    "fPublic",
    "fInitial",
    "tNote",
    "fNoteIsHTML",
    "fMergedFromRequest"
})
@XmlRootElement(name = "history_note")
public class HistoryNote {

    @XmlElement(required = true)
    protected BigInteger xRequestHistory;
    @XmlElement(required = true)
    protected BigInteger xRequest;
    @XmlElement(required = true)
    protected BigInteger xPerson;
    @XmlElement(required = true)
    protected BigInteger dtGMTChange;
    @XmlElement(required = true)
    protected BigInteger fPublic;
    @XmlElement(required = true)
    protected BigInteger fInitial;
    @XmlElement(required = true)
    protected String tNote;
    @XmlElement(required = true)
    protected BigInteger fNoteIsHTML;
    @XmlElement(required = true)
    protected BigInteger fMergedFromRequest;

    /**
     * Gets the value of the xRequestHistory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXRequestHistory() {
        return xRequestHistory;
    }

    /**
     * Sets the value of the xRequestHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXRequestHistory(BigInteger value) {
        this.xRequestHistory = value;
    }

    /**
     * Gets the value of the xRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXRequest() {
        return xRequest;
    }

    /**
     * Sets the value of the xRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXRequest(BigInteger value) {
        this.xRequest = value;
    }

    /**
     * Gets the value of the xPerson property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXPerson() {
        return xPerson;
    }

    /**
     * Sets the value of the xPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXPerson(BigInteger value) {
        this.xPerson = value;
    }

    /**
     * Gets the value of the dtGMTChange property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDtGMTChange() {
        return dtGMTChange;
    }

    /**
     * Sets the value of the dtGMTChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDtGMTChange(BigInteger value) {
        this.dtGMTChange = value;
    }

    /**
     * Gets the value of the fPublic property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFPublic() {
        return fPublic;
    }

    /**
     * Sets the value of the fPublic property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFPublic(BigInteger value) {
        this.fPublic = value;
    }

    /**
     * Gets the value of the fInitial property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFInitial() {
        return fInitial;
    }

    /**
     * Sets the value of the fInitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFInitial(BigInteger value) {
        this.fInitial = value;
    }

    /**
     * Gets the value of the tNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNote() {
        return tNote;
    }

    /**
     * Sets the value of the tNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNote(String value) {
        this.tNote = value;
    }

    /**
     * Gets the value of the fNoteIsHTML property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFNoteIsHTML() {
        return fNoteIsHTML;
    }

    /**
     * Sets the value of the fNoteIsHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFNoteIsHTML(BigInteger value) {
        this.fNoteIsHTML = value;
    }

    /**
     * Gets the value of the fMergedFromRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFMergedFromRequest() {
        return fMergedFromRequest;
    }

    /**
     * Sets the value of the fMergedFromRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFMergedFromRequest(BigInteger value) {
        this.fMergedFromRequest = value;
    }

}
