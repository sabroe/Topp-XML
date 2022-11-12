package com.yelstream.topp.xml.io;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Specification of indentation.
 * @author Morten Sabroe Mortensen
 * @version 1.0
 * @since 2022-10-30
 */
@AllArgsConstructor
@Getter
public class IndentSpecification {
    private final Boolean indent;
    private final Integer indentAmount;

    /**
     * Creates a specification of indentation.
     * @param indent Indicates, if indentation is to be performed.
     * @param indentAmount Length of indentation in characters.
     * @return Specification of indentation.
     */
    public static IndentSpecification of(boolean indent,
                                         int indentAmount) {
        return new IndentSpecification(indent,indentAmount);
    }

    /**
     * Creates a specification of indentation.
     * @param indentAmount Length of indentation in characters.
     * @return Specification of indentation.
     */
    public static IndentSpecification of(int indentAmount) {
        if (indentAmount<=0) {
            return new IndentSpecification(false,0);
        } else {
            return new IndentSpecification(true,indentAmount);
        }
    }
}
