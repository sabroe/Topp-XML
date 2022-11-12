
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ReferredDocumentAmount1Choice complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ReferredDocumentAmount1Choice"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="DuePyblAmt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CurrencyAndAmount"/&amp;gt;
 *           &amp;lt;element name="DscntApldAmt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CurrencyAndAmount"/&amp;gt;
 *           &amp;lt;element name="RmtdAmt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CurrencyAndAmount"/&amp;gt;
 *           &amp;lt;element name="CdtNoteAmt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CurrencyAndAmount"/&amp;gt;
 *           &amp;lt;element name="TaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CurrencyAndAmount"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferredDocumentAmount1Choice", propOrder = {
    "duePyblAmt",
    "dscntApldAmt",
    "rmtdAmt",
    "cdtNoteAmt",
    "taxAmt"
})
public class ReferredDocumentAmount1Choice {

    @XmlElement(name = "DuePyblAmt")
    protected CurrencyAndAmount duePyblAmt;
    @XmlElement(name = "DscntApldAmt")
    protected CurrencyAndAmount dscntApldAmt;
    @XmlElement(name = "RmtdAmt")
    protected CurrencyAndAmount rmtdAmt;
    @XmlElement(name = "CdtNoteAmt")
    protected CurrencyAndAmount cdtNoteAmt;
    @XmlElement(name = "TaxAmt")
    protected CurrencyAndAmount taxAmt;

    /**
     * Gets the value of the duePyblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getDuePyblAmt() {
        return duePyblAmt;
    }

    /**
     * Sets the value of the duePyblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setDuePyblAmt(CurrencyAndAmount value) {
        this.duePyblAmt = value;
    }

    /**
     * Gets the value of the dscntApldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getDscntApldAmt() {
        return dscntApldAmt;
    }

    /**
     * Sets the value of the dscntApldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setDscntApldAmt(CurrencyAndAmount value) {
        this.dscntApldAmt = value;
    }

    /**
     * Gets the value of the rmtdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getRmtdAmt() {
        return rmtdAmt;
    }

    /**
     * Sets the value of the rmtdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setRmtdAmt(CurrencyAndAmount value) {
        this.rmtdAmt = value;
    }

    /**
     * Gets the value of the cdtNoteAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getCdtNoteAmt() {
        return cdtNoteAmt;
    }

    /**
     * Sets the value of the cdtNoteAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setCdtNoteAmt(CurrencyAndAmount value) {
        this.cdtNoteAmt = value;
    }

    /**
     * Gets the value of the taxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTaxAmt() {
        return taxAmt;
    }

    /**
     * Sets the value of the taxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setTaxAmt(CurrencyAndAmount value) {
        this.taxAmt = value;
    }

}
