
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RegulatoryAuthority complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RegulatoryAuthority"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AuthrtyNm" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max70Text" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AuthrtyCtry" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CountryCode" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryAuthority", propOrder = {
    "authrtyNm",
    "authrtyCtry"
})
public class RegulatoryAuthority {

    @XmlElement(name = "AuthrtyNm")
    protected String authrtyNm;
    @XmlElement(name = "AuthrtyCtry")
    protected String authrtyCtry;

    /**
     * Gets the value of the authrtyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrtyNm() {
        return authrtyNm;
    }

    /**
     * Sets the value of the authrtyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthrtyNm(String value) {
        this.authrtyNm = value;
    }

    /**
     * Gets the value of the authrtyCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrtyCtry() {
        return authrtyCtry;
    }

    /**
     * Sets the value of the authrtyCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthrtyCtry(String value) {
        this.authrtyCtry = value;
    }

}
