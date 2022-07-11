package com.yelstream.topp.xml.validation;

import lombok.experimental.UtilityClass;
import org.xml.sax.SAXException;

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
    /**
     * Creates a schema.
     * @param schemaFactory Schema factory.
     * @param schemaResourceName Resource name for a schema.
     * @return Schema.
     * @throws IOException Thrown in case of I/O error.
     * @throws SAXException Thrown in case of SAX error.
     */
    public static Schema createSchema(SchemaFactory schemaFactory,
                                      String schemaResourceName) throws IOException, SAXException {
        Schema schema;
        try (InputStream resource=Schemas.class.getClassLoader().getResourceAsStream(schemaResourceName)) {
            schema=schemaFactory.newSchema(new StreamSource(resource));
        }
        return schema;
    }

    /**
     * Creates a schema.
     * @param schemaResourceName Resource name for a schema.
     * @return Schema.
     * @throws IOException Thrown in case of I/O error.
     * @throws SAXException Thrown in case of SAX error.
     */
    public static Schema createSchema(String schemaResourceName) throws IOException, SAXException {
        SchemaFactory schemaFactory=SchemaFactories.createSchemaFactory();
        return createSchema(schemaFactory,schemaResourceName);
    }

    /**
     * Creates a schema.
     * @param schemaFactory Schema factory.
     * @param schemaInputStream Input stream to a schema.
     * @return Schema.
     * @throws SAXException Thrown in case of SAX error.
     */
    public static Schema createSchema(SchemaFactory schemaFactory,
                                      InputStream schemaInputStream) throws SAXException {
        Source source=new StreamSource(schemaInputStream);
        return schemaFactory.newSchema(source);
    }

    /**
     * Creates a schema.
     * @param schemaInputStream Input stream to a schema.
     * @return Schema.
     * @throws SAXException Thrown in case of SAX error.
     */
    public static Schema createSchema(InputStream schemaInputStream) throws SAXException {
        SchemaFactory schemaFactory=SchemaFactories.createSchemaFactory();
        return createSchema(schemaFactory,schemaInputStream);
    }
}
