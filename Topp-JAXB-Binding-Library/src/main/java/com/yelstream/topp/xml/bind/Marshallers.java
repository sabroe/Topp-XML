package com.yelstream.topp.xml.bind;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import lombok.experimental.UtilityClass;

import javax.xml.validation.Schema;

/**
 * Utility addressing instances of {@link Marshaller}.
 * @author Morten Sabroe Mortensen
 * @version 1.0
 * @since 2022-04-20
 */
@UtilityClass
public class Marshallers {
    /**
     * Creates a marshaller.
     * @param context JAXB context.
     * @return Marshaller.
     * @throws JAXBException Thrown in case of JAXB error.
     */
    public static Marshaller createMarshaller(JAXBContext context) throws JAXBException {
        return createMarshaller(context, null);
    }

    /**
     * Creates a marshaller.
     * @param context JAXB context.
     * @param schema Schema.
     * @return Marshaller.
     * @throws JAXBException Thrown in case of JAXB error.
     */
    public static Marshaller createMarshaller(JAXBContext context,
                                              Schema schema) throws JAXBException {
        Marshaller marshaller=context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        if (schema!=null) {
            marshaller.setSchema(schema);
        }
        return marshaller;
    }
}
