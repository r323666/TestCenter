//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.22 at 10:01:12 AM PDT 
//


package com.sendori.testcenter.xsd;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;
import com.sendori.testcenter.xsd.PhaseDistribution;


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
 *         &lt;element ref="{}TimeDistribution"/>
 *         &lt;element ref="{}PhaseDistribution"/>
 *         &lt;element ref="{}BackfillDistributionTime"/>
 *         &lt;element ref="{}DirectAdDistributionTime"/>
 *         &lt;element ref="{}RunofNetworkDistributionTime"/>
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
    "timeDistribution",
    "phaseDistribution",
    "backfillDistributionTime",
    "directAdDistributionTime",
    "runofNetworkDistributionTime"
})
@XmlRootElement(name = "ResponseTimeDebug")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
public class ResponseTimeDebug {

    @XmlElement(name = "TimeDistribution", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected TimeDistribution timeDistribution;
    @XmlElement(name = "PhaseDistribution", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected PhaseDistribution phaseDistribution;
    @XmlElement(name = "BackfillDistributionTime", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected BackfillDistributionTime backfillDistributionTime;
    @XmlElement(name = "DirectAdDistributionTime", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected DirectAdDistributionTime directAdDistributionTime;
    @XmlElement(name = "RunofNetworkDistributionTime", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected RunofNetworkDistributionTime runofNetworkDistributionTime;

    /**
     * Gets the value of the timeDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDistribution }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public TimeDistribution getTimeDistribution() {
        return timeDistribution;
    }

    /**
     * Sets the value of the timeDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDistribution }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setTimeDistribution(TimeDistribution value) {
        this.timeDistribution = value;
    }

    /**
     * Gets the value of the phaseDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseDistribution }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public PhaseDistribution getPhaseDistribution() {
        return phaseDistribution;
    }

    /**
     * Sets the value of the phaseDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseDistribution }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setPhaseDistribution(PhaseDistribution value) {
        this.phaseDistribution = value;
    }

    /**
     * Gets the value of the backfillDistributionTime property.
     * 
     * @return
     *     possible object is
     *     {@link BackfillDistributionTime }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public BackfillDistributionTime getBackfillDistributionTime() {
        return backfillDistributionTime;
    }

    /**
     * Sets the value of the backfillDistributionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackfillDistributionTime }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setBackfillDistributionTime(BackfillDistributionTime value) {
        this.backfillDistributionTime = value;
    }

    /**
     * Gets the value of the directAdDistributionTime property.
     * 
     * @return
     *     possible object is
     *     {@link DirectAdDistributionTime }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public DirectAdDistributionTime getDirectAdDistributionTime() {
        return directAdDistributionTime;
    }

    /**
     * Sets the value of the directAdDistributionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectAdDistributionTime }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setDirectAdDistributionTime(DirectAdDistributionTime value) {
        this.directAdDistributionTime = value;
    }

    /**
     * Gets the value of the runofNetworkDistributionTime property.
     * 
     * @return
     *     possible object is
     *     {@link RunofNetworkDistributionTime }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public RunofNetworkDistributionTime getRunofNetworkDistributionTime() {
        return runofNetworkDistributionTime;
    }

    @Override
    public String toString() {
        return "ResponseTimeDebug{" +
                "timeDistribution=" + timeDistribution +
                ", phaseDistribution=" + phaseDistribution +
                ", backfillDistributionTime=" + backfillDistributionTime +
                ", directAdDistributionTime=" + directAdDistributionTime +
                ", runofNetworkDistributionTime=" + runofNetworkDistributionTime +
                '}';
    }

    /**
     * Sets the value of the runofNetworkDistributionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunofNetworkDistributionTime }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-22T10:01:12-07:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setRunofNetworkDistributionTime(RunofNetworkDistributionTime value) {
        this.runofNetworkDistributionTime = value;
    }

}