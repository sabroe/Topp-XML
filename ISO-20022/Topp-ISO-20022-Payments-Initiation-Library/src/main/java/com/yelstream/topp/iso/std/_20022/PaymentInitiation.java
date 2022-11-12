package com.yelstream.topp.iso.std._20022;

import com.yelstream.topp.xml.bind.JAXBElements;
import com.yelstream.topp.xml.validation.NewSchemaOperator;
import com.yelstream.topp.xml.validation.Schemas;
import org.w3c.dom.Document;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

/**
 * .
 */
public final class PaymentInitiation {
    private PaymentInitiation() {
    }

    public static final String XML_SCHEMA_RESOURCE_NAME="xsd/EPC121-16_2019_V1.0_pain.001.001.03.xsd";

    public static final QName ROOT_ELEMENT_NAME=new QName("urn:iso:std:iso:20022:tech:xsd:pain.001.001.03","Document");

    public static final Class<Document> DECLARED_TYPE=Document.class;

    /**
     * Reads a document.
     * @param in Input stream.
     * @return Document.
     * @throws IOException Thrown in case of I/O exception.
     */
    public static Document readDocument(InputStream in) throws IOException {
        NewSchemaOperator newSchemaOperator=()->Schemas.createSchema(XML_SCHEMA_RESOURCE_NAME);
        try (Reader reader=new InputStreamReader(in,StandardCharsets.UTF_8)) {
            Source source=new StreamSource(reader);
            return JAXBElements.read(DECLARED_TYPE,newSchemaOperator,(u,d)->u.unmarshal(source,d));
        }
    }

    /**
     * Writes a document.
     * @param document Document.
     * @param out Output stream.
     * @throws IOException Thrown in case of I/O exception.
     */
    public static void writeDocument(Document document,
                                     OutputStream out) throws IOException {
        NewSchemaOperator newSchemaOperator=()->Schemas.createSchema(XML_SCHEMA_RESOURCE_NAME);
        JAXBElements.write(ROOT_ELEMENT_NAME,DECLARED_TYPE,document,newSchemaOperator,(m, e)->m.marshal(e,out));
    }
}
