package com.yelstream.topp.xml.bind;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import lombok.experimental.UtilityClass;

import javax.xml.validation.Schema;

/**
 * Utility addressing instances of {@link Unmarshaller}.
 * @author Morten Sabroe Mortensen
 * @version 1.0
 * @since 2022-04-20
 */
@UtilityClass
public class Unmarshallers {
    /**
     * Creates an unmarshaller.
     * @param context JAXB context.
     * @return Unmarshaller.
     * @throws JAXBException Thrown in case of JAXB error.
     */
    public static Unmarshaller createUnmarshaller(JAXBContext context) throws JAXBException {
        return createUnmarshaller(context,null);
    }

    /**
     * Creates an unmarshaller.
     * @param context JAXB context.
     * @param schema Schema.
     * @return Unmarshaller.
     * @throws JAXBException Thrown in case of JAXB error.
     */
    public static Unmarshaller createUnmarshaller(JAXBContext context, Schema schema) throws JAXBException {
        Unmarshaller unmarshaller=context.createUnmarshaller();
        if (schema!=null) {
            unmarshaller.setSchema(schema);
        }
        return unmarshaller;
    }
}
