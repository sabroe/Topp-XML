
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Document complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Document"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="pain.001.001.02" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}pain.001.001.02"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pain00100102"
})
public class Document {

    @XmlElement(name = "pain.001.001.02", required = true)
    protected Pain00100102 pain00100102;

    /**
     * Gets the value of the pain00100102 property.
     * 
     * @return
     *     possible object is
     *     {@link Pain00100102 }
     *     
     */
    public Pain00100102 getPain00100102() {
        return pain00100102;
    }

    /**
     * Sets the value of the pain00100102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pain00100102 }
     *     
     */
    public void setPain00100102(Pain00100102 value) {
        this.pain00100102 = value;
    }

}
