package com.yelstream.topp.xml.bind;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

@FunctionalInterface
public interface UnmarshalOperator<T> {
    JAXBElement<T> unmarshal(Unmarshaller unmarshaller, Class<T> declaredType) throws JAXBException;
}
