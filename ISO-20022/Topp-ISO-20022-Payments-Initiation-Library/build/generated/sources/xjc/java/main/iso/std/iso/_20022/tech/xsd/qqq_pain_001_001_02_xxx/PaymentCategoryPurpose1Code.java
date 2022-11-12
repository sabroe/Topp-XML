
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PaymentCategoryPurpose1Code.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="PaymentCategoryPurpose1Code"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="CORT"/&amp;gt;
 *     &amp;lt;enumeration value="SALA"/&amp;gt;
 *     &amp;lt;enumeration value="TREA"/&amp;gt;
 *     &amp;lt;enumeration value="CASH"/&amp;gt;
 *     &amp;lt;enumeration value="DIVI"/&amp;gt;
 *     &amp;lt;enumeration value="GOVT"/&amp;gt;
 *     &amp;lt;enumeration value="INTE"/&amp;gt;
 *     &amp;lt;enumeration value="LOAN"/&amp;gt;
 *     &amp;lt;enumeration value="PENS"/&amp;gt;
 *     &amp;lt;enumeration value="SECU"/&amp;gt;
 *     &amp;lt;enumeration value="SSBE"/&amp;gt;
 *     &amp;lt;enumeration value="SUPP"/&amp;gt;
 *     &amp;lt;enumeration value="TAXS"/&amp;gt;
 *     &amp;lt;enumeration value="TRAD"/&amp;gt;
 *     &amp;lt;enumeration value="VATX"/&amp;gt;
 *     &amp;lt;enumeration value="HEDG"/&amp;gt;
 *     &amp;lt;enumeration value="INTC"/&amp;gt;
 *     &amp;lt;enumeration value="WHLD"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "PaymentCategoryPurpose1Code")
@XmlEnum
public enum PaymentCategoryPurpose1Code {

    CORT,
    SALA,
    TREA,
    CASH,
    DIVI,
    GOVT,
    INTE,
    LOAN,
    PENS,
    SECU,
    SSBE,
    SUPP,
    TAXS,
    TRAD,
    VATX,
    HEDG,
    INTC,
    WHLD;

    public String value() {
        return name();
    }

    public static PaymentCategoryPurpose1Code fromValue(String v) {
        return valueOf(v);
    }

}
