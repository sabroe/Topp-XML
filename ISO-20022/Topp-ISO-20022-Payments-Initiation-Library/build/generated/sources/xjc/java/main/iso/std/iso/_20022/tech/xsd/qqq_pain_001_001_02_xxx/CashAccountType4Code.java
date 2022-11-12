
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CashAccountType4Code.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="CashAccountType4Code"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="CASH"/&amp;gt;
 *     &amp;lt;enumeration value="CHAR"/&amp;gt;
 *     &amp;lt;enumeration value="COMM"/&amp;gt;
 *     &amp;lt;enumeration value="TAXE"/&amp;gt;
 *     &amp;lt;enumeration value="CISH"/&amp;gt;
 *     &amp;lt;enumeration value="TRAS"/&amp;gt;
 *     &amp;lt;enumeration value="SACC"/&amp;gt;
 *     &amp;lt;enumeration value="CACC"/&amp;gt;
 *     &amp;lt;enumeration value="SVGS"/&amp;gt;
 *     &amp;lt;enumeration value="ONDP"/&amp;gt;
 *     &amp;lt;enumeration value="MGLD"/&amp;gt;
 *     &amp;lt;enumeration value="NREX"/&amp;gt;
 *     &amp;lt;enumeration value="MOMA"/&amp;gt;
 *     &amp;lt;enumeration value="LOAN"/&amp;gt;
 *     &amp;lt;enumeration value="SLRY"/&amp;gt;
 *     &amp;lt;enumeration value="ODFT"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "CashAccountType4Code")
@XmlEnum
public enum CashAccountType4Code {

    CASH,
    CHAR,
    COMM,
    TAXE,
    CISH,
    TRAS,
    SACC,
    CACC,
    SVGS,
    ONDP,
    MGLD,
    NREX,
    MOMA,
    LOAN,
    SLRY,
    ODFT;

    public String value() {
        return name();
    }

    public static CashAccountType4Code fromValue(String v) {
        return valueOf(v);
    }

}
