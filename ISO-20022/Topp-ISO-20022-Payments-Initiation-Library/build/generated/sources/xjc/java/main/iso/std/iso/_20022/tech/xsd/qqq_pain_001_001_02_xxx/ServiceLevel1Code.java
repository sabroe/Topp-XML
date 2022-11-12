
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ServiceLevel1Code.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ServiceLevel1Code"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="SEPA"/&amp;gt;
 *     &amp;lt;enumeration value="SDVA"/&amp;gt;
 *     &amp;lt;enumeration value="PRPT"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ServiceLevel1Code")
@XmlEnum
public enum ServiceLevel1Code {

    SEPA,
    SDVA,
    PRPT;

    public String value() {
        return name();
    }

    public static ServiceLevel1Code fromValue(String v) {
        return valueOf(v);
    }

}
