//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.22 at 10:01:12 AM PDT 
//


package com.sendori.testcenter.xsd;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AdRetrievalTime" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Auction" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="BudgetCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ClickTokenCreation" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Dedupe" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ImpressionLogging" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Qualification" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="SelectionSort" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PhaseDistribution")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
public class PhaseDistribution {

    @XmlAttribute(name = "AdRetrievalTime", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected BigInteger adRetrievalTime;
    @XmlAttribute(name = "Auction", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected BigInteger auction;
    @XmlAttribute(name = "BudgetCheck", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected BigInteger budgetCheck;
    @XmlAttribute(name = "ClickTokenCreation", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected BigInteger clickTokenCreation;
    @XmlAttribute(name = "Dedupe", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected BigInteger dedupe;
    @XmlAttribute(name = "ImpressionLogging", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected BigInteger impressionLogging;
    @XmlAttribute(name = "Qualification", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected BigInteger qualification;
    @XmlAttribute(name = "SelectionSort", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected BigInteger selectionSort;

    /**
     * Gets the value of the adRetrievalTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public BigInteger getAdRetrievalTime() {
        return adRetrievalTime;
    }

    /**
     * Sets the value of the adRetrievalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setAdRetrievalTime(BigInteger value) {
        this.adRetrievalTime = value;
    }

    /**
     * Gets the value of the auction property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public BigInteger getAuction() {
        return auction;
    }

    /**
     * Sets the value of the auction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setAuction(BigInteger value) {
        this.auction = value;
    }

    /**
     * Gets the value of the budgetCheck property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public BigInteger getBudgetCheck() {
        return budgetCheck;
    }

    /**
     * Sets the value of the budgetCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setBudgetCheck(BigInteger value) {
        this.budgetCheck = value;
    }

    /**
     * Gets the value of the clickTokenCreation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public BigInteger getClickTokenCreation() {
        return clickTokenCreation;
    }

    /**
     * Sets the value of the clickTokenCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setClickTokenCreation(BigInteger value) {
        this.clickTokenCreation = value;
    }

    /**
     * Gets the value of the dedupe property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public BigInteger getDedupe() {
        return dedupe;
    }

    /**
     * Sets the value of the dedupe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setDedupe(BigInteger value) {
        this.dedupe = value;
    }

    /**
     * Gets the value of the impressionLogging property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public BigInteger getImpressionLogging() {
        return impressionLogging;
    }

    /**
     * Sets the value of the impressionLogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setImpressionLogging(BigInteger value) {
        this.impressionLogging = value;
    }

    /**
     * Gets the value of the qualification property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public BigInteger getQualification() {
        return qualification;
    }

    /**
     * Sets the value of the qualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setQualification(BigInteger value) {
        this.qualification = value;
    }

    /**
     * Gets the value of the selectionSort property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public BigInteger getSelectionSort() {
        return selectionSort;
    }

    /**
     * Sets the value of the selectionSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setSelectionSort(BigInteger value) {
        this.selectionSort = value;
    }

}