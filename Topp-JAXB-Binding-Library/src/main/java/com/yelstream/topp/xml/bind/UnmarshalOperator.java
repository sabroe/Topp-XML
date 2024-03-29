package com.yelstream.topp.xml.bind;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

/**
 * Unmarshal operator.
 * @param <T> Class representing XML element.
 * @author Morten Sabroe Mortensen
 * @version 1.0
 * @since 2022-04-20
 */
@FunctionalInterface
public interface UnmarshalOperator<T> {
    /**
     * Applies unmarshalling.
     * @param unmarshaller Unmarshaller.
     * @param declaredType Binding of XML element declaration's type.
     * @return JAXB element.
     * @throws JAXBException Thrown in case of JAXB error.
     */
    JAXBElement<T> unmarshal(Unmarshaller unmarshaller,
                             Class<T> declaredType) throws JAXBException;
}
