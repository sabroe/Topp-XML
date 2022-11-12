
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AmountType2Choice complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AmountType2Choice"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="InstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CurrencyAndAmount"/&amp;gt;
 *           &amp;lt;element name="EqvtAmt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}EquivalentAmount"/&amp;gt;
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
@XmlType(name = "AmountType2Choice", propOrder = {
    "instdAmt",
    "eqvtAmt"
})
public class AmountType2Choice {

    @XmlElement(name = "InstdAmt")
    protected CurrencyAndAmount instdAmt;
    @XmlElement(name = "EqvtAmt")
    protected EquivalentAmount eqvtAmt;

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setInstdAmt(CurrencyAndAmount value) {
        this.instdAmt = value;
    }

    /**
     * Gets the value of the eqvtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EquivalentAmount }
     *     
     */
    public EquivalentAmount getEqvtAmt() {
        return eqvtAmt;
    }

    /**
     * Sets the value of the eqvtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquivalentAmount }
     *     
     */
    public void setEqvtAmt(EquivalentAmount value) {
        this.eqvtAmt = value;
    }

}
