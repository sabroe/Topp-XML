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

public final class PaymentInitiation {
    private PaymentInitiation() {
    }

    public static final String XML_SCHEMA_RESOURCE_NAME="xsd/EPC121-16_2019_V1.0_pain.001.001.03.xsd";

    public static final QName ROOT_ELEMENT_NAME=new QName("urn:iso:std:iso:20022:tech:xsd:pain.001.001.03","Document");

    public static final Class<Document> DECLARED_TYPE=Document.class;

    public static Document readDocument(final InputStream in) throws IOException {
        NewSchemaOperator newSchemaOperator=()->Schemas.createSchema(XML_SCHEMA_RESOURCE_NAME);
        newSchemaOperator=null;
        try (Reader reader=new InputStreamReader(in,StandardCharsets.UTF_8)) {
            Source source=new StreamSource(reader);
            return JAXBElements.read(DECLARED_TYPE,newSchemaOperator,(u,d)->u.unmarshal(source,d));
        }
    }

    public static void writeDocument(final Document value, final OutputStream out) throws IOException {
        NewSchemaOperator newSchemaOperator=()->Schemas.createSchema(XML_SCHEMA_RESOURCE_NAME);
        newSchemaOperator=null;
        JAXBElements.write(ROOT_ELEMENT_NAME,DECLARED_TYPE,value,newSchemaOperator,(m, e)->m.marshal(e,out));
    }
}
