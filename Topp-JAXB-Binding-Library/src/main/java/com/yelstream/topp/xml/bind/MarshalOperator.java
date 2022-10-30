package com.yelstream.topp.xml.bind;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Marshal operator.
 * @author Morten Sabroe Mortensen
 * @version 1.0
 * @since 2022-04-20
 */
@FunctionalInterface
public interface MarshalOperator {
    /**
     * Applies marshalling.
     * @param marshaller Marshaller.
     * @param element JAXB element.
     * @throws JAXBException Thrown in case of JAXB error.
     */
    void marshal(Marshaller marshaller,
                 Object element) throws JAXBException;
}
