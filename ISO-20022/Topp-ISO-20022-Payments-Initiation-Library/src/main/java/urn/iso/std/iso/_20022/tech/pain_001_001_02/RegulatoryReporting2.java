//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package urn.iso.std.iso._20022.tech.pain_001_001_02;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulatoryReporting2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RegulatoryReporting2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DbtCdtRptgInd" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}RegulatoryReportingType1Code" minOccurs="0"/>
 *         <element name="Authrty" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}RegulatoryAuthority" minOccurs="0"/>
 *         <element name="RgltryDtls" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}StructuredRegulatoryReporting2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryReporting2", propOrder = {
    "dbtCdtRptgInd",
    "authrty",
    "rgltryDtls"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
public class RegulatoryReporting2 {

    @XmlElement(name = "DbtCdtRptgInd")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected RegulatoryReportingType1Code dbtCdtRptgInd;
    @XmlElement(name = "Authrty")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected RegulatoryAuthority authrty;
    @XmlElement(name = "RgltryDtls")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected StructuredRegulatoryReporting2 rgltryDtls;

    /**
     * Gets the value of the dbtCdtRptgInd property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryReportingType1Code }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public RegulatoryReportingType1Code getDbtCdtRptgInd() {
        return dbtCdtRptgInd;
    }

    /**
     * Sets the value of the dbtCdtRptgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryReportingType1Code }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setDbtCdtRptgInd(RegulatoryReportingType1Code value) {
        this.dbtCdtRptgInd = value;
    }

    /**
     * Gets the value of the authrty property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryAuthority }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public RegulatoryAuthority getAuthrty() {
        return authrty;
    }

    /**
     * Sets the value of the authrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryAuthority }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setAuthrty(RegulatoryAuthority value) {
        this.authrty = value;
    }

    /**
     * Gets the value of the rgltryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredRegulatoryReporting2 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public StructuredRegulatoryReporting2 getRgltryDtls() {
        return rgltryDtls;
    }

    /**
     * Sets the value of the rgltryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredRegulatoryReporting2 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setRgltryDtls(StructuredRegulatoryReporting2 value) {
        this.rgltryDtls = value;
    }

}