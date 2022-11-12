
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DocumentType2Code.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="DocumentType2Code"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="MSIN"/&amp;gt;
 *     &amp;lt;enumeration value="CNFA"/&amp;gt;
 *     &amp;lt;enumeration value="DNFA"/&amp;gt;
 *     &amp;lt;enumeration value="CINV"/&amp;gt;
 *     &amp;lt;enumeration value="CREN"/&amp;gt;
 *     &amp;lt;enumeration value="DEBN"/&amp;gt;
 *     &amp;lt;enumeration value="HIRI"/&amp;gt;
 *     &amp;lt;enumeration value="SBIN"/&amp;gt;
 *     &amp;lt;enumeration value="CMCN"/&amp;gt;
 *     &amp;lt;enumeration value="SOAC"/&amp;gt;
 *     &amp;lt;enumeration value="DISP"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "DocumentType2Code")
@XmlEnum
public enum DocumentType2Code {

    MSIN,
    CNFA,
    DNFA,
    CINV,
    CREN,
    DEBN,
    HIRI,
    SBIN,
    CMCN,
    SOAC,
    DISP;

    public String value() {
        return name();
    }

    public static DocumentType2Code fromValue(String v) {
        return valueOf(v);
    }

}
