
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for StructuredRegulatoryReporting2 complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="StructuredRegulatoryReporting2"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max3Text" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CurrencyAndAmount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Inf" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max35Text" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRegulatoryReporting2", propOrder = {
    "cd",
    "amt",
    "inf"
})
public class StructuredRegulatoryReporting2 {

    @XmlElement(name = "Cd")
    protected String cd;
    @XmlElement(name = "Amt")
    protected CurrencyAndAmount amt;
    @XmlElement(name = "Inf")
    protected String inf;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCd(String value) {
        this.cd = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setAmt(CurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the inf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInf() {
        return inf;
    }

    /**
     * Sets the value of the inf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInf(String value) {
        this.inf = value;
    }

}
