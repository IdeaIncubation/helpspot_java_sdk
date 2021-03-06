//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.11 at 01:59:27 PM CDT 
//


package com.github.stinkbird.helpspot.private_api.response_for.request.get_custom_fields;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}xCustomField"/>
 *         &lt;element ref="{}fieldName"/>
 *         &lt;element ref="{}isRequired"/>
 *         &lt;element ref="{}isPublic"/>
 *         &lt;element ref="{}fieldType"/>
 *         &lt;element ref="{}iOrder"/>
 *         &lt;element ref="{}sTxtSize"/>
 *         &lt;element ref="{}lrgTextRows"/>
 *         &lt;element ref="{}listItems"/>
 *         &lt;element ref="{}iDecimalPlaces"/>
 *         &lt;element ref="{}sRegex"/>
 *         &lt;element ref="{}sAjaxUrl"/>
 *         &lt;element ref="{}isAlwaysVisible"/>
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
    "xCustomField",
    "fieldName",
    "isRequired",
    "isPublic",
    "fieldType",
    "iOrder",
    "sTxtSize",
    "lrgTextRows",
    "listItems",
    "iDecimalPlaces",
    "sRegex",
    "sAjaxUrl",
    "isAlwaysVisible"
})
@XmlRootElement(name = "field")
public class Field implements Serializable {

	private static final long serialVersionUID = -8942297056167162468L;
	
	@XmlElement(required = false)
    protected BigInteger xCustomField;
    @XmlElement(required = false)
    protected String fieldName;
    @XmlElement(required = false)
    protected BigInteger isRequired;
    @XmlElement(required = false)
    protected BigInteger isPublic;
    @XmlElement(required = false)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String fieldType;
    @XmlElement(required = false)
    protected BigInteger iOrder;
    @XmlElement(required = false)
    protected STxtSize sTxtSize;
    @XmlElement(required = false)
    protected LrgTextRows lrgTextRows;
    @XmlElement(required = false)
    protected ListItems listItems;
    @XmlElement(required = false)
    protected BigInteger iDecimalPlaces;
    @XmlElement(required = false)
    protected SRegex sRegex;
    @XmlElement(required = false)
    @XmlSchemaType(name = "anyURI")
    protected String sAjaxUrl;
    @XmlElement(required = false)
    protected BigInteger isAlwaysVisible;

    /**
     * Gets the value of the xCustomField property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXCustomField() {
        return xCustomField;
    }

    /**
     * Sets the value of the xCustomField property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXCustomField(BigInteger value) {
        this.xCustomField = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the isRequired property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsRequired(BigInteger value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the isPublic property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsPublic() {
        return isPublic;
    }

    /**
     * Sets the value of the isPublic property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsPublic(BigInteger value) {
        this.isPublic = value;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldType(String value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the iOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIOrder() {
        return iOrder;
    }

    /**
     * Sets the value of the iOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIOrder(BigInteger value) {
        this.iOrder = value;
    }

    /**
     * Gets the value of the sTxtSize property.
     * 
     * @return
     *     possible object is
     *     {@link STxtSize }
     *     
     */
    public STxtSize getSTxtSize() {
        return sTxtSize;
    }

    /**
     * Sets the value of the sTxtSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link STxtSize }
     *     
     */
    public void setSTxtSize(STxtSize value) {
        this.sTxtSize = value;
    }

    /**
     * Gets the value of the lrgTextRows property.
     * 
     * @return
     *     possible object is
     *     {@link LrgTextRows }
     *     
     */
    public LrgTextRows getLrgTextRows() {
        return lrgTextRows;
    }

    /**
     * Sets the value of the lrgTextRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link LrgTextRows }
     *     
     */
    public void setLrgTextRows(LrgTextRows value) {
        this.lrgTextRows = value;
    }

    /**
     * Gets the value of the listItems property.
     * 
     * @return
     *     possible object is
     *     {@link ListItems }
     *     
     */
    public ListItems getListItems() {
        return listItems;
    }

    /**
     * Sets the value of the listItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListItems }
     *     
     */
    public void setListItems(ListItems value) {
        this.listItems = value;
    }

    /**
     * Gets the value of the iDecimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDecimalPlaces() {
        return iDecimalPlaces;
    }

    /**
     * Sets the value of the iDecimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDecimalPlaces(BigInteger value) {
        this.iDecimalPlaces = value;
    }

    /**
     * Gets the value of the sRegex property.
     * 
     * @return
     *     possible object is
     *     {@link SRegex }
     *     
     */
    public SRegex getSRegex() {
        return sRegex;
    }

    /**
     * Sets the value of the sRegex property.
     * 
     * @param value
     *     allowed object is
     *     {@link SRegex }
     *     
     */
    public void setSRegex(SRegex value) {
        this.sRegex = value;
    }

    /**
     * Gets the value of the sAjaxUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAjaxUrl() {
        return sAjaxUrl;
    }

    /**
     * Sets the value of the sAjaxUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAjaxUrl(String value) {
        this.sAjaxUrl = value;
    }

    /**
     * Gets the value of the isAlwaysVisible property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsAlwaysVisible() {
        return isAlwaysVisible;
    }

    /**
     * Sets the value of the isAlwaysVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsAlwaysVisible(BigInteger value) {
        this.isAlwaysVisible = value;
    }

}
