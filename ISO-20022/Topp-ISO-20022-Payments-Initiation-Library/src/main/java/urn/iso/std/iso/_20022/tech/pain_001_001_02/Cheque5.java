//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package urn.iso.std.iso._20022.tech.pain_001_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cheque5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Cheque5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ChqTp" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}ChequeType2Code" minOccurs="0"/>
 *         <element name="ChqNb" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max35Text" minOccurs="0"/>
 *         <element name="ChqFr" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}NameAndAddress3" minOccurs="0"/>
 *         <element name="DlvryMtd" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}ChequeDeliveryMethod1Choice" minOccurs="0"/>
 *         <element name="DlvrTo" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}NameAndAddress3" minOccurs="0"/>
 *         <element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Priority2Code" minOccurs="0"/>
 *         <element name="ChqMtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}ISODate" minOccurs="0"/>
 *         <element name="FrmsCd" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max35Text" minOccurs="0"/>
 *         <element name="MemoFld" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max35Text" minOccurs="0"/>
 *         <element name="RgnlClrZone" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max35Text" minOccurs="0"/>
 *         <element name="PrtLctn" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cheque5", propOrder = {
    "chqTp",
    "chqNb",
    "chqFr",
    "dlvryMtd",
    "dlvrTo",
    "instrPrty",
    "chqMtrtyDt",
    "frmsCd",
    "memoFld",
    "rgnlClrZone",
    "prtLctn"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
public class Cheque5 {

    @XmlElement(name = "ChqTp")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected ChequeType2Code chqTp;
    @XmlElement(name = "ChqNb")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected String chqNb;
    @XmlElement(name = "ChqFr")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected NameAndAddress3 chqFr;
    @XmlElement(name = "DlvryMtd")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected ChequeDeliveryMethod1Choice dlvryMtd;
    @XmlElement(name = "DlvrTo")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected NameAndAddress3 dlvrTo;
    @XmlElement(name = "InstrPrty")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected Priority2Code instrPrty;
    @XmlElement(name = "ChqMtrtyDt")
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected XMLGregorianCalendar chqMtrtyDt;
    @XmlElement(name = "FrmsCd")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected String frmsCd;
    @XmlElement(name = "MemoFld")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected String memoFld;
    @XmlElement(name = "RgnlClrZone")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected String rgnlClrZone;
    @XmlElement(name = "PrtLctn")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected String prtLctn;

    /**
     * Gets the value of the chqTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeType2Code }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public ChequeType2Code getChqTp() {
        return chqTp;
    }

    /**
     * Sets the value of the chqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeType2Code }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setChqTp(ChequeType2Code value) {
        this.chqTp = value;
    }

    /**
     * Gets the value of the chqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public String getChqNb() {
        return chqNb;
    }

    /**
     * Sets the value of the chqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setChqNb(String value) {
        this.chqNb = value;
    }

    /**
     * Gets the value of the chqFr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress3 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public NameAndAddress3 getChqFr() {
        return chqFr;
    }

    /**
     * Sets the value of the chqFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress3 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setChqFr(NameAndAddress3 value) {
        this.chqFr = value;
    }

    /**
     * Gets the value of the dlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeDeliveryMethod1Choice }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public ChequeDeliveryMethod1Choice getDlvryMtd() {
        return dlvryMtd;
    }

    /**
     * Sets the value of the dlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeDeliveryMethod1Choice }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setDlvryMtd(ChequeDeliveryMethod1Choice value) {
        this.dlvryMtd = value;
    }

    /**
     * Gets the value of the dlvrTo property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress3 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public NameAndAddress3 getDlvrTo() {
        return dlvrTo;
    }

    /**
     * Sets the value of the dlvrTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress3 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setDlvrTo(NameAndAddress3 value) {
        this.dlvrTo = value;
    }

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
     * Gets the value of the chqMtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public XMLGregorianCalendar getChqMtrtyDt() {
        return chqMtrtyDt;
    }

    /**
     * Sets the value of the chqMtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setChqMtrtyDt(XMLGregorianCalendar value) {
        this.chqMtrtyDt = value;
    }

    /**
     * Gets the value of the frmsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public String getFrmsCd() {
        return frmsCd;
    }

    /**
     * Sets the value of the frmsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setFrmsCd(String value) {
        this.frmsCd = value;
    }

    /**
     * Gets the value of the memoFld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public String getMemoFld() {
        return memoFld;
    }

    /**
     * Sets the value of the memoFld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setMemoFld(String value) {
        this.memoFld = value;
    }

    /**
     * Gets the value of the rgnlClrZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public String getRgnlClrZone() {
        return rgnlClrZone;
    }

    /**
     * Sets the value of the rgnlClrZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setRgnlClrZone(String value) {
        this.rgnlClrZone = value;
    }

    /**
     * Gets the value of the prtLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public String getPrtLctn() {
        return prtLctn;
    }

    /**
     * Sets the value of the prtLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setPrtLctn(String value) {
        this.prtLctn = value;
    }

}