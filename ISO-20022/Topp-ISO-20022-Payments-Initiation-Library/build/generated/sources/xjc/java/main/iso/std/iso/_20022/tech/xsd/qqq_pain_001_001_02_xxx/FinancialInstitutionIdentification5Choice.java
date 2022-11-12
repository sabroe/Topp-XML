
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FinancialInstitutionIdentification5Choice complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FinancialInstitutionIdentification5Choice"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="BIC" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}BICIdentifier"/&amp;gt;
 *           &amp;lt;element name="ClrSysMmbId" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}ClearingSystemMemberIdentification3Choice"/&amp;gt;
 *           &amp;lt;element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}NameAndAddress7"/&amp;gt;
 *           &amp;lt;element name="PrtryId" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}GenericIdentification3"/&amp;gt;
 *           &amp;lt;element name="CmbndId" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}FinancialInstitutionIdentification3"/&amp;gt;
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
@XmlType(name = "FinancialInstitutionIdentification5Choice", propOrder = {
    "bic",
    "clrSysMmbId",
    "nmAndAdr",
    "prtryId",
    "cmbndId"
})
public class FinancialInstitutionIdentification5Choice {

    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "ClrSysMmbId")
    protected ClearingSystemMemberIdentification3Choice clrSysMmbId;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress7 nmAndAdr;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification3 prtryId;
    @XmlElement(name = "CmbndId")
    protected FinancialInstitutionIdentification3 cmbndId;

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the clrSysMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemMemberIdentification3Choice }
     *     
     */
    public ClearingSystemMemberIdentification3Choice getClrSysMmbId() {
        return clrSysMmbId;
    }

    /**
     * Sets the value of the clrSysMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemMemberIdentification3Choice }
     *     
     */
    public void setClrSysMmbId(ClearingSystemMemberIdentification3Choice value) {
        this.clrSysMmbId = value;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress7 }
     *     
     */
    public NameAndAddress7 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress7 }
     *     
     */
    public void setNmAndAdr(NameAndAddress7 value) {
        this.nmAndAdr = value;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification3 }
     *     
     */
    public GenericIdentification3 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification3 }
     *     
     */
    public void setPrtryId(GenericIdentification3 value) {
        this.prtryId = value;
    }

    /**
     * Gets the value of the cmbndId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification3 }
     *     
     */
    public FinancialInstitutionIdentification3 getCmbndId() {
        return cmbndId;
    }

    /**
     * Sets the value of the cmbndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification3 }
     *     
     */
    public void setCmbndId(FinancialInstitutionIdentification3 value) {
        this.cmbndId = value;
    }

}
