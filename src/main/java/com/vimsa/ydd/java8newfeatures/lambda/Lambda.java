/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vimsa.ydd.java8newfeatures.lambda;

import java.util.Arrays;

/**
 *
 * @author adrian.popa
 */
public class Lambda {

    public void lambdaExpressions() {
        // simple lambda expretions

        // the type of n is being inferred by the compiler to type Integer
        Arrays.asList(1, 2, 3, 4).forEach(n -> System.out.print("[" + n + "] "));
        // explicitly declaring n to be of type Integer
        Arrays.asList(1, 2, 3, 4).forEach((Integer n) -> System.out.print("[" + n + "] "));
        // adding multiple statements to the lambda body inside curly brackets
        Arrays.asList(1, 2, 3, 4).forEach((Integer n) -> {
            System.out.print("[" + n + "]");
            System.out.print(", ");
        });

        // multiple parameters with infered type
        // the return statement is not required if the lambda body is a single statement
        Arrays.asList(3, 2, 1, 4).sort((n1, n2) -> n1.compareTo(n2));
    }
}
