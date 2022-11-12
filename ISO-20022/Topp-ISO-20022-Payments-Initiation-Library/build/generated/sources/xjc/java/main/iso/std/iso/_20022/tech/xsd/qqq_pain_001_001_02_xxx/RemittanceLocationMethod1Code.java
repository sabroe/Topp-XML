
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RemittanceLocationMethod1Code.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="RemittanceLocationMethod1Code"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="FAXI"/&amp;gt;
 *     &amp;lt;enumeration value="EDIC"/&amp;gt;
 *     &amp;lt;enumeration value="URID"/&amp;gt;
 *     &amp;lt;enumeration value="EMAL"/&amp;gt;
 *     &amp;lt;enumeration value="POST"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "RemittanceLocationMethod1Code")
@XmlEnum
public enum RemittanceLocationMethod1Code {

    FAXI,
    EDIC,
    URID,
    EMAL,
    POST;

    public String value() {
        return name();
    }

    public static RemittanceLocationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
