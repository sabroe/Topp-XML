package com.yelstream.topp.xml.validation;

import org.xml.sax.SAXException;

import javax.xml.validation.Schema;
import java.io.IOException;

/**
 * Factory of schema instances.
 */
@FunctionalInterface
public interface NewSchemaOperator {
    /**
     * Creates a new schema.
     * @return Schema.
     * @throws IOException Thrown in case of I/O error.
     * @throws SAXException Thrown in case of SAX error.
     */
    Schema newSchema() throws IOException, SAXException;
}
