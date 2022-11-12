
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DocumentType3Code.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="DocumentType3Code"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="RADM"/&amp;gt;
 *     &amp;lt;enumeration value="RPIN"/&amp;gt;
 *     &amp;lt;enumeration value="FXDR"/&amp;gt;
 *     &amp;lt;enumeration value="DISP"/&amp;gt;
 *     &amp;lt;enumeration value="PUOR"/&amp;gt;
 *     &amp;lt;enumeration value="SCOR"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "DocumentType3Code")
@XmlEnum
public enum DocumentType3Code {

    RADM,
    RPIN,
    FXDR,
    DISP,
    PUOR,
    SCOR;

    public String value() {
        return name();
    }

    public static DocumentType3Code fromValue(String v) {
        return valueOf(v);
    }

}
