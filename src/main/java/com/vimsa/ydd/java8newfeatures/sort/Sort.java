/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vimsa.ydd.java8newfeatures.sort;

import java.util.Arrays;

/**
 *
 * @author adrian.popa
 */
public class Sort {

    /**
     * See unit test !!!
     */
    public static int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static int[] parallelSort(int[] array) {
        Arrays.parallelSort(array);
        return array;
    }
}
