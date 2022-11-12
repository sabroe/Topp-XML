
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TaxType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TaxType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CtgyDesc" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max35Text" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}PercentageRate" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxblBaseAmt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CurrencyAndAmount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CurrencyAndAmount" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxType", propOrder = {
    "ctgyDesc",
    "rate",
    "taxblBaseAmt",
    "amt"
})
public class TaxType {

    @XmlElement(name = "CtgyDesc")
    protected String ctgyDesc;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "TaxblBaseAmt")
    protected CurrencyAndAmount taxblBaseAmt;
    @XmlElement(name = "Amt")
    protected CurrencyAndAmount amt;

    /**
     * Gets the value of the ctgyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgyDesc() {
        return ctgyDesc;
    }

    /**
     * Sets the value of the ctgyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtgyDesc(String value) {
        this.ctgyDesc = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the taxblBaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTaxblBaseAmt() {
        return taxblBaseAmt;
    }

    /**
     * Sets the value of the taxblBaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setTaxblBaseAmt(CurrencyAndAmount value) {
        this.taxblBaseAmt = value;
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

}
