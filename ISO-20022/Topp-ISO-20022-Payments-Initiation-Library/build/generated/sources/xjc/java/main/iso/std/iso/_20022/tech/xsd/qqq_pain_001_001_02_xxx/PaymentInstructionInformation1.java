
package iso.std.iso._20022.tech.xsd.qqq_pain_001_001_02_xxx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for PaymentInstructionInformation1 complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PaymentInstructionInformation1"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="PmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}Max35Text" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PmtMtd" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}PaymentMethod3Code"/&amp;gt;
 *         &amp;lt;element name="PmtTpInf" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}PaymentTypeInformation1" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}ISODate"/&amp;gt;
 *         &amp;lt;element name="PoolgAdjstmntDt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}ISODate" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}PartyIdentification8"/&amp;gt;
 *         &amp;lt;element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CashAccount7"/&amp;gt;
 *         &amp;lt;element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}BranchAndFinancialInstitutionIdentification3"/&amp;gt;
 *         &amp;lt;element name="DbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CashAccount7" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}PartyIdentification8" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}ChargeBearerType1Code" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ChrgsAcct" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CashAccount7" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ChrgsAcctAgt" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}BranchAndFinancialInstitutionIdentification3" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CdtTrfTxInf" type="{urn:iso:std:iso:20022:tech:xsd:qqq.pain.001.001.02.xxx.yyy}CreditTransferTransactionInformation1" maxOccurs="unbounded"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstructionInformation1", propOrder = {
    "pmtInfId",
    "pmtMtd",
    "pmtTpInf",
    "reqdExctnDt",
    "poolgAdjstmntDt",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "dbtrAgtAcct",
    "ultmtDbtr",
    "chrgBr",
    "chrgsAcct",
    "chrgsAcctAgt",
    "cdtTrfTxInf"
})
public class PaymentInstructionInformation1 {

    @XmlElement(name = "PmtInfId")
    protected String pmtInfId;
    @XmlElement(name = "PmtMtd", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentMethod3Code pmtMtd;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation1 pmtTpInf;
    @XmlElement(name = "ReqdExctnDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "PoolgAdjstmntDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar poolgAdjstmntDt;
    @XmlElement(name = "Dbtr", required = true)
    protected PartyIdentification8 dbtr;
    @XmlElement(name = "DbtrAcct", required = true)
    protected CashAccount7 dbtrAcct;
    @XmlElement(name = "DbtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification3 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected CashAccount7 dbtrAgtAcct;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification8 ultmtDbtr;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerType1Code chrgBr;
    @XmlElement(name = "ChrgsAcct")
    protected CashAccount7 chrgsAcct;
    @XmlElement(name = "ChrgsAcctAgt")
    protected BranchAndFinancialInstitutionIdentification3 chrgsAcctAgt;
    @XmlElement(name = "CdtTrfTxInf", required = true)
    protected List<CreditTransferTransactionInformation1> cdtTrfTxInf;

    /**
     * Gets the value of the pmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtInfId() {
        return pmtInfId;
    }

    /**
     * Sets the value of the pmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtInfId(String value) {
        this.pmtInfId = value;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod3Code }
     *     
     */
    public PaymentMethod3Code getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod3Code }
     *     
     */
    public void setPmtMtd(PaymentMethod3Code value) {
        this.pmtMtd = value;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation1 }
     *     
     */
    public PaymentTypeInformation1 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation1 }
     *     
     */
    public void setPmtTpInf(PaymentTypeInformation1 value) {
        this.pmtTpInf = value;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
    }

    /**
     * Gets the value of the poolgAdjstmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPoolgAdjstmntDt() {
        return poolgAdjstmntDt;
    }

    /**
     * Sets the value of the poolgAdjstmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPoolgAdjstmntDt(XMLGregorianCalendar value) {
        this.poolgAdjstmntDt = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public void setDbtr(PartyIdentification8 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public void setDbtrAcct(CashAccount7 value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public void setDbtrAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.dbtrAgt = value;
    }

    /**
     * Gets the value of the dbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Sets the value of the dbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public void setDbtrAgtAcct(CashAccount7 value) {
        this.dbtrAgtAcct = value;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public void setUltmtDbtr(PartyIdentification8 value) {
        this.ultmtDbtr = value;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public ChargeBearerType1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public void setChrgBr(ChargeBearerType1Code value) {
        this.chrgBr = value;
    }

    /**
     * Gets the value of the chrgsAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getChrgsAcct() {
        return chrgsAcct;
    }

    /**
     * Sets the value of the chrgsAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public void setChrgsAcct(CashAccount7 value) {
        this.chrgsAcct = value;
    }

    /**
     * Gets the value of the chrgsAcctAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getChrgsAcctAgt() {
        return chrgsAcctAgt;
    }

    /**
     * Sets the value of the chrgsAcctAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public void setChrgsAcctAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.chrgsAcctAgt = value;
    }

    /**
     * Gets the value of the cdtTrfTxInf property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the cdtTrfTxInf property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCdtTrfTxInf().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link CreditTransferTransactionInformation1 }
     * 
     * 
     */
    public List<CreditTransferTransactionInformation1> getCdtTrfTxInf() {
        if (cdtTrfTxInf == null) {
            cdtTrfTxInf = new ArrayList<CreditTransferTransactionInformation1>();
        }
        return this.cdtTrfTxInf;
    }

}
