//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.22 at 10:01:12 AM PDT 
//


package com.sendori.testcenter.xsd;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{}Header" maxOccurs="unbounded"/>
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
    "header"
})
@XmlRootElement(name = "RequestHeaders")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
public class RequestHeaders {

    @XmlElement(name = "Header", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected List<Header> header;

    /**
     * Gets the value of the header property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the header property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Header }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public List<Header> getHeader() {
        if (header == null) {
            header = new ArrayList<Header>();
        }
        return this.header;
    }

}
