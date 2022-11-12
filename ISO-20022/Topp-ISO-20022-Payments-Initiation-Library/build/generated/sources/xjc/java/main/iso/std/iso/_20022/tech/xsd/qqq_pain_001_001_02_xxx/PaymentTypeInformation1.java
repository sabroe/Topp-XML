
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PaymentTypeInformation1 complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PaymentTypeInformation1"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Priority2Code" minOccurs="0"/&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="SvcLvl" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}ServiceLevel2Choice" minOccurs="0"/&amp;gt;
 *           &amp;lt;element name="ClrChanl" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}ClearingChannel2Code" minOccurs="0"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="LclInstrm" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}LocalInstrument1Choice" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CtgyPurp" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}PaymentCategoryPurpose1Code" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeInformation1", propOrder = {
    "instrPrty",
    "svcLvl",
    "clrChanl",
    "lclInstrm",
    "ctgyPurp"
})
public class PaymentTypeInformation1 {

    @XmlElement(name = "InstrPrty")
    @XmlSchemaType(name = "string")
    protected Priority2Code instrPrty;
    @XmlElement(name = "SvcLvl")
    protected ServiceLevel2Choice svcLvl;
    @XmlElement(name = "ClrChanl")
    @XmlSchemaType(name = "string")
    protected ClearingChannel2Code clrChanl;
    @XmlElement(name = "LclInstrm")
    protected LocalInstrument1Choice lclInstrm;
    @XmlElement(name = "CtgyPurp")
    @XmlSchemaType(name = "string")
    protected PaymentCategoryPurpose1Code ctgyPurp;

    /**
     * Gets the value of the instrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    public Priority2Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Sets the value of the instrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority2Code }
     *     
     */
    public void setInstrPrty(Priority2Code value) {
        this.instrPrty = value;
    }

    /**
     * Gets the value of the svcLvl property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevel2Choice }
     *     
     */
    public ServiceLevel2Choice getSvcLvl() {
        return svcLvl;
    }

    /**
     * Sets the value of the svcLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevel2Choice }
     *     
     */
    public void setSvcLvl(ServiceLevel2Choice value) {
        this.svcLvl = value;
    }

    /**
     * Gets the value of the clrChanl property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingChannel2Code }
     *     
     */
    public ClearingChannel2Code getClrChanl() {
        return clrChanl;
    }

    /**
     * Sets the value of the clrChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingChannel2Code }
     *     
     */
    public void setClrChanl(ClearingChannel2Code value) {
        this.clrChanl = value;
    }

    /**
     * Gets the value of the lclInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link LocalInstrument1Choice }
     *     
     */
    public LocalInstrument1Choice getLclInstrm() {
        return lclInstrm;
    }

    /**
     * Sets the value of the lclInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalInstrument1Choice }
     *     
     */
    public void setLclInstrm(LocalInstrument1Choice value) {
        this.lclInstrm = value;
    }

    /**
     * Gets the value of the ctgyPurp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCategoryPurpose1Code }
     *     
     */
    public PaymentCategoryPurpose1Code getCtgyPurp() {
        return ctgyPurp;
    }

    /**
     * Sets the value of the ctgyPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCategoryPurpose1Code }
     *     
     */
    public void setCtgyPurp(PaymentCategoryPurpose1Code value) {
        this.ctgyPurp = value;
    }

}
