package com.yelstream.topp.xml.io;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.nio.charset.StandardCharsets;

/**
 *
 * @author Morten Sabroe Mortensen
 * @version 1.0
 * @since 2022-10-30
 */
@AllArgsConstructor
@Getter
public class TransformerSpecification {
    private final String encoding;
    private final Boolean omitXMLDeclaration;

    public static TransformerSpecification of(String encoding,
                                              boolean omitXMLDeclaration) {
        return new TransformerSpecification(encoding,omitXMLDeclaration);
    }

    public static TransformerSpecification of(boolean omitXMLDeclaration) {
        return new TransformerSpecification(StandardCharsets.UTF_8.name(),omitXMLDeclaration);
    }
}
