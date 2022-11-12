
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for TaxInformation2 complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TaxInformation2"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CdtrTaxId" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max35Text" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CdtrTaxTp" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max35Text" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DbtrTaxId" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max35Text" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxRefNb" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max140Text" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TtlTaxblBaseAmt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CurrencyAndAmount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TtlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CurrencyAndAmount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxDt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}ISODate" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxTpInf" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}TaxDetails" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
public class TaxInformation2 {

    @XmlElement(name = "CdtrTaxId")
    protected String cdtrTaxId;
    @XmlElement(name = "CdtrTaxTp")
    protected String cdtrTaxTp;
    @XmlElement(name = "DbtrTaxId")
    protected String dbtrTaxId;
    @XmlElement(name = "TaxRefNb")
    protected String taxRefNb;
    @XmlElement(name = "TtlTaxblBaseAmt")
    protected CurrencyAndAmount ttlTaxblBaseAmt;
    @XmlElement(name = "TtlTaxAmt")
    protected CurrencyAndAmount ttlTaxAmt;
    @XmlElement(name = "TaxDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxDt;
    @XmlElement(name = "TaxTpInf")
    protected List<TaxDetails> taxTpInf;

    /**
     * Gets the value of the cdtrTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setTaxDt(XMLGregorianCalendar value) {
        this.taxDt = value;
    }

    /**
     * Gets the value of the taxTpInf property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the taxTpInf property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTaxTpInf().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetails }
     * 
     * 
     */
    public List<TaxDetails> getTaxTpInf() {
        if (taxTpInf == null) {
            taxTpInf = new ArrayList<TaxDetails>();
        }
        return this.taxTpInf;
    }

}
