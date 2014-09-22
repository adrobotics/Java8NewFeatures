/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vimsa.ydd.java8newfeatures.optional;

import java.util.Optional;

/**
 *
 * @author adrian.popa
 */
public class OptionalValue {

    /**
     * See unit test !!!
     */
    public static void optionalMethod(Optional<String> city) {
        System.out.println("city is set:\t\t\t\t" + city.isPresent());
        System.out.println("(city != null) ? city : \"is null\":\t" + city.orElse("is null"));
    }
}
