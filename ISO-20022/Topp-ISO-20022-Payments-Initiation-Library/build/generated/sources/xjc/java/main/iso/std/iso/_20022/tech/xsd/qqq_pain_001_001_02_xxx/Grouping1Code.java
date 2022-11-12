
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Grouping1Code.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="Grouping1Code"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="SNGL"/&amp;gt;
 *     &amp;lt;enumeration value="GRPD"/&amp;gt;
 *     &amp;lt;enumeration value="MIXD"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "Grouping1Code")
@XmlEnum
public enum Grouping1Code {

    SNGL,
    GRPD,
    MIXD;

    public String value() {
        return name();
    }

    public static Grouping1Code fromValue(String v) {
        return valueOf(v);
    }

}
