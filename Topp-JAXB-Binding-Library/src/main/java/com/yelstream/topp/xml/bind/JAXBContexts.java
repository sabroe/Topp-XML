package com.yelstream.topp.xml.bind;

import lombok.experimental.UtilityClass;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 * Utility addressing instances of {@link JAXBContext}.
 */
@UtilityClass
public class JAXBContexts {

    public static JAXBContext createJAXBContext(
            Class<?> declaredType) throws JAXBException {
        return JAXBContext.newInstance(declaredType);
    }
}
