
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ChequeDelivery1Code.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ChequeDelivery1Code"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="MLDB"/&amp;gt;
 *     &amp;lt;enumeration value="MLCD"/&amp;gt;
 *     &amp;lt;enumeration value="MLFA"/&amp;gt;
 *     &amp;lt;enumeration value="CRDB"/&amp;gt;
 *     &amp;lt;enumeration value="CRCD"/&amp;gt;
 *     &amp;lt;enumeration value="CRFA"/&amp;gt;
 *     &amp;lt;enumeration value="PUDB"/&amp;gt;
 *     &amp;lt;enumeration value="PUCD"/&amp;gt;
 *     &amp;lt;enumeration value="PUFA"/&amp;gt;
 *     &amp;lt;enumeration value="RGDB"/&amp;gt;
 *     &amp;lt;enumeration value="RGCD"/&amp;gt;
 *     &amp;lt;enumeration value="RGFA"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ChequeDelivery1Code")
@XmlEnum
public enum ChequeDelivery1Code {

    MLDB,
    MLCD,
    MLFA,
    CRDB,
    CRCD,
    CRFA,
    PUDB,
    PUCD,
    PUFA,
    RGDB,
    RGCD,
    RGFA;

    public String value() {
        return name();
    }

    public static ChequeDelivery1Code fromValue(String v) {
        return valueOf(v);
    }

}
