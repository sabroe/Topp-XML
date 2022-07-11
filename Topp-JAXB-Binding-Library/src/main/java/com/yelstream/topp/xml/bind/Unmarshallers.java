package com.yelstream.topp.xml.bind;

import lombok.experimental.UtilityClass;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;

/**
 * Utility addressing instances of {@link Unmarshaller}.
 */
@UtilityClass
public class Unmarshallers {

    public static Unmarshaller createUnmarshaller(JAXBContext context) throws JAXBException {
        return createUnmarshaller(context,null);
    }

    public static Unmarshaller createUnmarshaller(JAXBContext context, Schema schema) throws JAXBException {
        Unmarshaller unmarshaller=context.createUnmarshaller();
        if (schema!=null) {
            unmarshaller.setSchema(schema);
        }
        return unmarshaller;
    }
}
