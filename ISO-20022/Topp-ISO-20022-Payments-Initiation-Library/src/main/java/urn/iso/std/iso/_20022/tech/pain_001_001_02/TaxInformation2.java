//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package urn.iso.std.iso._20022.tech.pain_001_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxInformation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TaxInformation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdtrTaxId" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max35Text" minOccurs="0"/>
 *         <element name="CdtrTaxTp" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max35Text" minOccurs="0"/>
 *         <element name="DbtrTaxId" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max35Text" minOccurs="0"/>
 *         <element name="TaxRefNb" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max140Text" minOccurs="0"/>
 *         <element name="TtlTaxblBaseAmt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxDt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}ISODate" minOccurs="0"/>
 *         <element name="TaxTpInf" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}TaxDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInformation2", propOrder = {
    "cdtrTaxId",
    "cdtrTaxTp",
    "dbtrTaxId",
    "taxRefNb",
    "ttlTaxblBaseAmt",
    "ttlTaxAmt",
    "taxDt",
    "taxTpInf"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
public class TaxInformation2 {

    @XmlElement(name = "CdtrTaxId")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected String cdtrTaxId;
    @XmlElement(name = "CdtrTaxTp")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected String cdtrTaxTp;
    @XmlElement(name = "DbtrTaxId")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected String dbtrTaxId;
    @XmlElement(name = "TaxRefNb")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected String taxRefNb;
    @XmlElement(name = "TtlTaxblBaseAmt")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected CurrencyAndAmount ttlTaxblBaseAmt;
    @XmlElement(name = "TtlTaxAmt")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected CurrencyAndAmount ttlTaxAmt;
    @XmlElement(name = "TaxDt")
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected XMLGregorianCalendar taxDt;
    @XmlElement(name = "TaxTpInf")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    protected List<TaxDetails> taxTpInf;

    /**
     * Gets the value of the cdtrTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public String getCdtrTaxId() {
        return cdtrTaxId;
    }

    /**
     * Sets the value of the cdtrTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setCdtrTaxId(String value) {
        this.cdtrTaxId = value;
    }

    /**
     * Gets the value of the cdtrTaxTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public String getCdtrTaxTp() {
        return cdtrTaxTp;
    }

    /**
     * Sets the value of the cdtrTaxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setCdtrTaxTp(String value) {
        this.cdtrTaxTp = value;
    }

    /**
     * Gets the value of the dbtrTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public String getDbtrTaxId() {
        return dbtrTaxId;
    }

    /**
     * Sets the value of the dbtrTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setDbtrTaxId(String value) {
        this.dbtrTaxId = value;
    }

    /**
     * Gets the value of the taxRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public String getTaxRefNb() {
        return taxRefNb;
    }

    /**
     * Sets the value of the taxRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setTaxRefNb(String value) {
        this.taxRefNb = value;
    }

    /**
     * Gets the value of the ttlTaxblBaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public CurrencyAndAmount getTtlTaxblBaseAmt() {
        return ttlTaxblBaseAmt;
    }

    /**
     * Sets the value of the ttlTaxblBaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setTtlTaxblBaseAmt(CurrencyAndAmount value) {
        this.ttlTaxblBaseAmt = value;
    }

    /**
     * Gets the value of the ttlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public CurrencyAndAmount getTtlTaxAmt() {
        return ttlTaxAmt;
    }

    /**
     * Sets the value of the ttlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setTtlTaxAmt(CurrencyAndAmount value) {
        this.ttlTaxAmt = value;
    }

    /**
     * Gets the value of the taxDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public XMLGregorianCalendar getTaxDt() {
        return taxDt;
    }

    /**
     * Sets the value of the taxDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public void setTaxDt(XMLGregorianCalendar value) {
        this.taxDt = value;
    }

    /**
     * Gets the value of the taxTpInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxTpInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTpInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetails }
     * 
     * 
     * @return
     *     The value of the taxTpInf property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-07T21:58:34+01:00")
    public List<TaxDetails> getTaxTpInf() {
        if (taxTpInf == null) {
            taxTpInf = new ArrayList<>();
        }
        return this.taxTpInf;
    }

}
