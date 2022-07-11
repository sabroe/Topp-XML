package com.yelstream.topp.xml.validation;

import org.xml.sax.SAXException;

import javax.xml.validation.Schema;
import java.io.IOException;

@FunctionalInterface
public interface NewSchemaOperator {
    Schema newSchema() throws IOException, SAXException;
}
