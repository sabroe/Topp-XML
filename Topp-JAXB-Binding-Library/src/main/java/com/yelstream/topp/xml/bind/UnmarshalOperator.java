package com.yelstream.topp.xml.bind;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Unmarshal operator.
 * @param <T> Class representing XML element.
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
