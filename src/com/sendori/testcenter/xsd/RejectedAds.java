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
 *         &lt;element ref="{}Ad" maxOccurs="unbounded"/>
 *         &lt;element ref="{}DedupedAds"/>
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
    "ad",
    "dedupedAds"
})
@XmlRootElement(name = "RejectedAds")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
public class RejectedAds {

    @XmlElement(name = "Ad", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected List<Ad> ad;
    @XmlElement(name = "DedupedAds", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected DedupedAds dedupedAds;

    /**
     * Gets the value of the ad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ad }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public List<Ad> getAd() {
        if (ad == null) {
            ad = new ArrayList<Ad>();
        }
        return this.ad;
    }

    /**
     * Gets the value of the dedupedAds property.
     * 
     * @return
     *     possible object is
     *     {@link DedupedAds }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public DedupedAds getDedupedAds() {
        return dedupedAds;
    }

    /**
     * Sets the value of the dedupedAds property.
     * 
     * @param value
     *     allowed object is
     *     {@link DedupedAds }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setDedupedAds(DedupedAds value) {
        this.dedupedAds = value;
    }

}
