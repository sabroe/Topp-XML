package com.yelstream.topp.xml.bind;

import lombok.experimental.UtilityClass;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.validation.Schema;

/**
 * Utility addressing instances of {@link Marshaller}.
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
