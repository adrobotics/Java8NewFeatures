/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vimsa.ydd.java8newfeatures.parallelProcessing;

import com.vimsa.ydd.java8newfeatures.sort.Sort;
import java.util.Random;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author adrian.popa
 */
public class SortTest {

    private final static int arraySize = 10_000_000;
    private final static int[] doubleArray = new int[arraySize];
    private int[] testArray;
    private final Runtime runtime = Runtime.getRuntime();
    private final static Random rand = new Random();

    @BeforeClass
    public static void init() {
        System.out.println("\n###################################");
        System.out.println("          parallelSort Test");
        System.out.println("###################################");
        System.out.println("Sorting " + arraySize + " integers.\n");
        System.out.println("Method\t\ttime(ms)\tmemory(bytes)");

        for (int i = 0; i < arraySize; i++) {
            doubleArray[i] = rand.nextInt();
        }
    }

    @Before
    public void initArray() {
        testArray = new int[arraySize];
        System.arraycopy(doubleArray, 0, testArray, 0, arraySize);
    }

    @After
    public void garbage() {
        runtime.gc();
    }

    @Test
    public void testSerialSort() {
        long memoryStart = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.currentTimeMillis();
        Sort.sort(testArray);
        System.out.println("Serial\t\t" + (System.currentTimeMillis() - startTime) + "\t\t" + (runtime.totalMemory() - runtime.freeMemory() - memoryStart));
    }

    @Test
    public void testParallelSort() {
        long memoryStart = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.currentTimeMillis();
        Sort.parallelSort(testArray);
        System.out.println("Parallel\t" + (System.currentTimeMillis() - startTime) + "\t\t" + (runtime.totalMemory() - runtime.freeMemory() - memoryStart));
    }

}
