//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.11 at 01:59:42 PM CDT 
//


package com.github.stinkbird.helpspot.private_api.response_for.request.get_mailboxes;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.github.stinkbird.helpspot.private_api.response_for.request.get_mailboxes package. 
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

    private final static QName _XMailbox_QNAME = new QName("", "xMailbox");
    private final static QName _SReplyEmail_QNAME = new QName("", "sReplyEmail");
    private final static QName _SReplyName_QNAME = new QName("", "sReplyName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.github.stinkbird.helpspot.private_api.response_for.request.get_mailboxes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Mailbox }
     * 
     */
    public Mailbox createMailbox() {
        return new Mailbox();
    }

    /**
     * Create an instance of {@link Results }
     * 
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xMailbox")
    public JAXBElement<BigInteger> createXMailbox(BigInteger value) {
        return new JAXBElement<BigInteger>(_XMailbox_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sReplyEmail")
    public JAXBElement<String> createSReplyEmail(String value) {
        return new JAXBElement<String>(_SReplyEmail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sReplyName")
    public JAXBElement<String> createSReplyName(String value) {
        return new JAXBElement<String>(_SReplyName_QNAME, String.class, null, value);
    }

}
