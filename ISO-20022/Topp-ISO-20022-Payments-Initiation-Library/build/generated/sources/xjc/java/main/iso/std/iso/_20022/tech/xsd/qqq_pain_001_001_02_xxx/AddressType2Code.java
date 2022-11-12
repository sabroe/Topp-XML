
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AddressType2Code.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AddressType2Code"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ADDR"/&amp;gt;
 *     &amp;lt;enumeration value="PBOX"/&amp;gt;
 *     &amp;lt;enumeration value="HOME"/&amp;gt;
 *     &amp;lt;enumeration value="BIZZ"/&amp;gt;
 *     &amp;lt;enumeration value="MLTO"/&amp;gt;
 *     &amp;lt;enumeration value="DLVY"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AddressType2Code")
@XmlEnum
public enum AddressType2Code {

    ADDR,
    PBOX,
    HOME,
    BIZZ,
    MLTO,
    DLVY;

    public String value() {
        return name();
    }

    public static AddressType2Code fromValue(String v) {
        return valueOf(v);
    }

}
