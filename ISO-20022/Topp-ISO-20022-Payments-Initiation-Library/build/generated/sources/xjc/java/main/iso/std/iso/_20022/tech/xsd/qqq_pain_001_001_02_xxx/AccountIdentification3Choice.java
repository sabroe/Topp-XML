
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AccountIdentification3Choice complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AccountIdentification3Choice"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="IBAN" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}IBANIdentifier"/&amp;gt;
 *           &amp;lt;element name="BBAN" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}BBANIdentifier"/&amp;gt;
 *           &amp;lt;element name="UPIC" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}UPICIdentifier"/&amp;gt;
 *           &amp;lt;element name="PrtryAcct" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}SimpleIdentificationInformation2"/&amp;gt;
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
@XmlType(name = "AccountIdentification3Choice", propOrder = {
    "iban",
    "bban",
    "upic",
    "prtryAcct"
})
public class AccountIdentification3Choice {

    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "BBAN")
    protected String bban;
    @XmlElement(name = "UPIC")
    protected String upic;
    @XmlElement(name = "PrtryAcct")
    protected SimpleIdentificationInformation2 prtryAcct;

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the bban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBAN() {
        return bban;
    }

    /**
     * Sets the value of the bban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBAN(String value) {
        this.bban = value;
    }

    /**
     * Gets the value of the upic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPIC() {
        return upic;
    }

    /**
     * Sets the value of the upic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPIC(String value) {
        this.upic = value;
    }

    /**
     * Gets the value of the prtryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation2 }
     *     
     */
    public SimpleIdentificationInformation2 getPrtryAcct() {
        return prtryAcct;
    }

    /**
     * Sets the value of the prtryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation2 }
     *     
     */
    public void setPrtryAcct(SimpleIdentificationInformation2 value) {
        this.prtryAcct = value;
    }

}
