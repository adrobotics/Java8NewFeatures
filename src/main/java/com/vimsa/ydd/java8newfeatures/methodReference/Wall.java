/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vimsa.ydd.java8newfeatures.methodReference;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 *
 * @author adrian.popa
 */
public class Wall {

    public static Wall create(Supplier<Wall> supplier) {
        return supplier.get();
    }

    public static void paint(Wall wall) {
        System.out.println("Painting wall: " + wall.toString());
    }

    public void whoAmI() {
        System.out.println("I am: " + this.toString());
    }

    public void operateOnParameter(Wall w) {
        System.out.println("Parameter is: " + w.toString());
    }

    public static void main(String[] args) {
        // echivalent to new Wall();
        Wall wallInstance = Wall.create(Wall::new);
        //invoking static method paint, parameter is implicitly taken from .forEach
        Arrays.asList(wallInstance, new Wall(), Wall.create(Wall::new)).forEach(Wall::paint);
        //invoking instance method, may not have any parameter because invoking throu class name
        Arrays.asList(wallInstance, new Wall(), Wall.create(Wall::new)).forEach(Wall::whoAmI);
        //invoking instance method, may have one parameter of type Wall
        Arrays.asList(wallInstance, new Wall(), Wall.create(Wall::new)).forEach(wallInstance::operateOnParameter);
    }
}
