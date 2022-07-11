package com.yelstream.topp.xml.validation;

import lombok.experimental.UtilityClass;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.IOException;
import java.io.InputStream;

/**
 * Utility addressing instances of {@link Schema}.
 */
@UtilityClass
public class Schemas {

    public static SchemaFactory createSchemaFactory() {
        return SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
    }

    public static Schema createSchema(SchemaFactory schemaFactory,
                                      String schemaResourceName) throws IOException, SAXException {
        Schema schema;
        try (InputStream resource=Schemas.class.getClassLoader().getResourceAsStream(schemaResourceName)) {
            schema=schemaFactory.newSchema(new StreamSource(resource));
        }
        return schema;
    }

    public static Schema createSchema(String schemaResourceName) throws IOException, SAXException {
        SchemaFactory schemaFactory=createSchemaFactory();
        return createSchema(schemaFactory,schemaResourceName);
    }

    public static Schema createSchema(SchemaFactory schemaFactory,
                                      InputStream schemaInputStream) throws SAXException {
        Source source=new StreamSource(schemaInputStream);
        return schemaFactory.newSchema(source);
    }

    public static Schema createSchema(InputStream schemaInputStream) throws SAXException {
        SchemaFactory schemaFactory=createSchemaFactory();
        return createSchema(schemaFactory,schemaInputStream);
    }
}
