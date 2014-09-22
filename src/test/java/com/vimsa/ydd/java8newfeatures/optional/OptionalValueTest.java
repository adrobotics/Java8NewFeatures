/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vimsa.ydd.java8newfeatures.optional;

import java.util.Optional;
import org.junit.Test;

/**
 *
 * @author adrian.popa
 */
public class OptionalValueTest {

    public OptionalValueTest() {
        System.out.println("\n###################################");
        System.out.println("          OptionalValue Test");
        System.out.println("###################################\n");
    }

    @Test
    public void testOptionalMethod() {
        OptionalValue.optionalMethod(Optional.empty());
        OptionalValue.optionalMethod(Optional.of("Sibiu"));
    }

}
