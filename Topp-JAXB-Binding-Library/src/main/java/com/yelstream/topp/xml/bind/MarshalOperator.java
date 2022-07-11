package com.yelstream.topp.xml.bind;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

@FunctionalInterface
public interface MarshalOperator {
    void marshal(Marshaller marshaller, Object element) throws JAXBException;
}
