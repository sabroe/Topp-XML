package com.yelstream.topp.xml.io;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author Morten Sabroe Mortensen
 * @version 1.0
 * @since 2022-10-30
 */
@AllArgsConstructor
@Getter
public class IndentSpecification {
    private final Boolean indent;
    private final Integer indentAmount;

    public static IndentSpecification of(boolean indent,
                                         int indentAmount) {
        return new IndentSpecification(indent,indentAmount);
    }

    public static IndentSpecification of(int indentAmount) {
        if (indentAmount<=0) {
            return new IndentSpecification(false,0);
        } else {
            return new IndentSpecification(true,indentAmount);
        }
    }
}
