
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RegulatoryReporting2 complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RegulatoryReporting2"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="DbtCdtRptgInd" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}RegulatoryReportingType1Code" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Authrty" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}RegulatoryAuthority" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RgltryDtls" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}StructuredRegulatoryReporting2" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryReporting2", propOrder = {
    "dbtCdtRptgInd",
    "authrty",
    "rgltryDtls"
})
public class RegulatoryReporting2 {

    @XmlElement(name = "DbtCdtRptgInd")
    @XmlSchemaType(name = "string")
    protected RegulatoryReportingType1Code dbtCdtRptgInd;
    @XmlElement(name = "Authrty")
    protected RegulatoryAuthority authrty;
    @XmlElement(name = "RgltryDtls")
    protected StructuredRegulatoryReporting2 rgltryDtls;

    /**
     * Gets the value of the dbtCdtRptgInd property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryReportingType1Code }
     *     
     */
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
    public void setRgltryDtls(StructuredRegulatoryReporting2 value) {
        this.rgltryDtls = value;
    }

}
