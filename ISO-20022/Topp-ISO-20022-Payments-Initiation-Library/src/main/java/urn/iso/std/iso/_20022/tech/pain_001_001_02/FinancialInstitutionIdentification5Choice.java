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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstitutionIdentification5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstitutionIdentification5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="BIC" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.02}BICIdentifier"/>
 *           <element name="ClrSysMmbId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.02}ClearingSystemMemberIdentification3Choice"/>
 *           <element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.02}NameAndAddress7"/>
 *           <element name="PrtryId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.02}GenericIdentification3"/>
 *           <element name="CmbndId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.02}FinancialInstitutionIdentification3"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
public class FinancialInstitutionIdentification5Choice {

    @XmlElement(name = "BIC")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
    protected String bic;
    @XmlElement(name = "ClrSysMmbId")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
    protected ClearingSystemMemberIdentification3Choice clrSysMmbId;
    @XmlElement(name = "NmAndAdr")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
    protected NameAndAddress7 nmAndAdr;
    @XmlElement(name = "PrtryId")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
    protected GenericIdentification3 prtryId;
    @XmlElement(name = "CmbndId")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
    protected FinancialInstitutionIdentification3 cmbndId;

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2023-01-08T20:53:23+01:00")
    public void setCmbndId(FinancialInstitutionIdentification3 value) {
        this.cmbndId = value;
    }

}
