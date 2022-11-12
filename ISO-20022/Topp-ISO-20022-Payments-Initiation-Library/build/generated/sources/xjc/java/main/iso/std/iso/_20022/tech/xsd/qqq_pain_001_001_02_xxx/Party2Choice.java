
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Party2Choice complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Party2Choice"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}OrganisationIdentification2"/&amp;gt;
 *           &amp;lt;element name="PrvtId" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}PersonIdentification3" maxOccurs="4"/&amp;gt;
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
@XmlType(name = "Party2Choice", propOrder = {
    "orgId",
    "prvtId"
})
public class Party2Choice {

    @XmlElement(name = "OrgId")
    protected OrganisationIdentification2 orgId;
    @XmlElement(name = "PrvtId")
    protected List<PersonIdentification3> prvtId;

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification2 }
     *     
     */
    public OrganisationIdentification2 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification2 }
     *     
     */
    public void setOrgId(OrganisationIdentification2 value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the prvtId property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the prvtId property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPrvtId().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link PersonIdentification3 }
     * 
     * 
     */
    public List<PersonIdentification3> getPrvtId() {
        if (prvtId == null) {
            prvtId = new ArrayList<PersonIdentification3>();
        }
        return this.prvtId;
    }

}
