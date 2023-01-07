package com.yelstream.topp.xml.bind;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import lombok.experimental.UtilityClass;

/**
 * Utility addressing instances of {@link JAXBContext}.
 * @author Morten Sabroe Mortensen
 * @version 1.0
 * @since 2022-04-20
 */
@UtilityClass
public class JAXBContexts {
    /**
     * Create a new JAXB context.
     * @param declaredType Class to be recognized by JAXB context.
     * @return JAXB context.
     * @throws JAXBException Thrown in case of JAXB error.
     */
    public static JAXBContext createJAXBContext(Class<?> declaredType) throws JAXBException {
        return JAXBContext.newInstance(declaredType);
    }
}
