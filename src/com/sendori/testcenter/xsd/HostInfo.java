//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.22 at 10:01:12 AM PDT 
//


package com.sendori.testcenter.xsd;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;
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
 *       &lt;attribute name="Hostname" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "HostInfo")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
public class HostInfo {

    @XmlAttribute(name = "Hostname", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected String hostname;

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setHostname(String value) {
        this.hostname = value;
    }

}
