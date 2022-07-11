package com.yelstream.topp.xml.bind;

import lombok.experimental.UtilityClass;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 * Utility addressing instances of {@link JAXBContext}.
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
