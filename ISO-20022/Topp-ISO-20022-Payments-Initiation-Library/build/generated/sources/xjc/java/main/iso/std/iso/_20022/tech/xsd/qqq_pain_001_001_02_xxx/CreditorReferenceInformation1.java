
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CreditorReferenceInformation1 complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CreditorReferenceInformation1"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CdtrRefTp" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CreditorReferenceType1" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CdtrRef" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max35Text" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorReferenceInformation1", propOrder = {
    "cdtrRefTp",
    "cdtrRef"
})
public class CreditorReferenceInformation1 {

    @XmlElement(name = "CdtrRefTp")
    protected CreditorReferenceType1 cdtrRefTp;
    @XmlElement(name = "CdtrRef")
    protected String cdtrRef;

    /**
     * Gets the value of the cdtrRefTp property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceType1 }
     *     
     */
    public CreditorReferenceType1 getCdtrRefTp() {
        return cdtrRefTp;
    }

    /**
     * Sets the value of the cdtrRefTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceType1 }
     *     
     */
    public void setCdtrRefTp(CreditorReferenceType1 value) {
        this.cdtrRefTp = value;
    }

    /**
     * Gets the value of the cdtrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrRef() {
        return cdtrRef;
    }

    /**
     * Sets the value of the cdtrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtrRef(String value) {
        this.cdtrRef = value;
    }

}
