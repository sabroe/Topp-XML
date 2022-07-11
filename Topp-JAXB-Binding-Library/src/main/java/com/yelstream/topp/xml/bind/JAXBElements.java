package com.yelstream.topp.xml.bind;

import com.yelstream.topp.xml.validation.NewSchemaOperator;
import lombok.experimental.UtilityClass;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.validation.Schema;
import java.io.IOException;

/**
 * Utility addressing instances of {@link JAXBElement}.
 */
@UtilityClass
public class JAXBElements {
    public static <T> JAXBElement<T> createJAXBElement(QName name, Class<T> declaredType, T value) {
        return new JAXBElement<>(name,declaredType,value);
    }

    public static <T> JAXBElement<T> readJAXBElement(Class<T> declaredType,  Schema schema, UnmarshalOperator<T> unmarshalOperator) throws JAXBException {
        JAXBContext context=JAXBContexts.createJAXBContext(declaredType);
        Unmarshaller unmarshaller=Unmarshallers.createUnmarshaller(context,schema);
        return unmarshalOperator.unmarshal(unmarshaller,declaredType);
    }

    public static <T> void writeJAXBElement(JAXBElement<T> element, Schema schema, MarshalOperator marshalOperator) throws JAXBException {
        Class<T> declaredType=element.getDeclaredType();
        JAXBContext context=JAXBContexts.createJAXBContext(declaredType);
        Marshaller marshaller=Marshallers.createMarshaller(context,schema);
        marshalOperator.marshal(marshaller,element);
    }

    public static <T> T readValue(Class<T> declaredType, Schema schema, UnmarshalOperator<T> unmarshalOperator) throws JAXBException {
        JAXBElement<T> element=readJAXBElement(declaredType,schema,unmarshalOperator);
        return element.getValue();
    }

    public static <T> void writeValue(QName name, Class<T> declaredType, T value, Schema schema, MarshalOperator marshalOperator) throws JAXBException {
        JAXBElement<T> element=JAXBElements.createJAXBElement(name,declaredType,value);
        writeJAXBElement(element,schema,marshalOperator);
    }

    public static <T> T read(Class<T> declaredType, NewSchemaOperator newSchemaOperator, UnmarshalOperator<T> unmarshalOperator) throws IOException {
        try {
            Schema schema=newSchemaOperator==null?null:newSchemaOperator.newSchema();
            return JAXBElements.readValue(declaredType,schema,unmarshalOperator);
        } catch (JAXBException|SAXException ex) {
            throw new IOException("Failure to read document!",ex);
        }
    }

    public static <T> void write(QName name, Class<T> declaredType, T value, NewSchemaOperator newSchemaOperator, MarshalOperator marshalOperator) throws IOException {
        try {
            Schema schema=newSchemaOperator==null?null:newSchemaOperator.newSchema();
            JAXBElement<T> element=JAXBElements.createJAXBElement(name,declaredType,value);
            JAXBElements.writeJAXBElement(element,schema,marshalOperator);
        } catch (JAXBException|SAXException ex) {
            throw new IOException("Failure to write document!",ex);
        }
    }
}
