/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vimsa.ydd.java8newfeatures.interfaces;

/**
 *
 * @author adrian.popa
 */
// this annotation says that this interface has only one method
// default and static methods are an exception to the annotations rule
@FunctionalInterface
public interface Functional {

    public void method();

    // static and default methods can be declared directly in the interface
    static void staticMethod() {
        System.out.println("static");
    }

    // a default method is not required to be implemented by a class that implements this interface
    default int defaultMethod() {
        return 42;
    }
}
