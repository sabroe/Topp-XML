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
 * <p>Java class for PaymentTypeInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentTypeInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Priority2Code" minOccurs="0"/>
 *         <choice>
 *           <element name="SvcLvl" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}ServiceLevel2Choice" minOccurs="0"/>
 *           <element name="ClrChanl" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}ClearingChannel2Code" minOccurs="0"/>
 *         </choice>
 *         <element name="LclInstrm" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}LocalInstrument1Choice" minOccurs="0"/>
 *         <element name="CtgyPurp" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}PaymentCategoryPurpose1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
public class PaymentTypeInformation1 {

    @XmlElement(name = "InstrPrty")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected Priority2Code instrPrty;
    @XmlElement(name = "SvcLvl")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected ServiceLevel2Choice svcLvl;
    @XmlElement(name = "ClrChanl")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected ClearingChannel2Code clrChanl;
    @XmlElement(name = "LclInstrm")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected LocalInstrument1Choice lclInstrm;
    @XmlElement(name = "CtgyPurp")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected PaymentCategoryPurpose1Code ctgyPurp;

    /**
     * Gets the value of the instrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setCtgyPurp(PaymentCategoryPurpose1Code value) {
        this.ctgyPurp = value;
    }

}