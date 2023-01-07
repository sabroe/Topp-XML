package com.yelstream.topp.xml.validation;

import lombok.experimental.UtilityClass;

import javax.xml.XMLConstants;
import javax.xml.validation.SchemaFactory;

/**
 * Utility addressiong instances of {@link SchemaFactory}.
 * @author Morten Sabroe Mortensen
 * @version 1.0
 * @since 2022-04-20
 */
@UtilityClass
public class SchemaFactories {
    /**
     * Creates a schema factory.
     * @return Schema factory.
     */
    public static SchemaFactory createSchemaFactory() {
        return SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
    }
}
