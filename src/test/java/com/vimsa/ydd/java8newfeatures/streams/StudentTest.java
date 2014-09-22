/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vimsa.ydd.java8newfeatures.streams;

import static com.vimsa.ydd.java8newfeatures.streams.Student.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.After;
import org.junit.Test;
import org.junit.BeforeClass;

/**
 *
 * @author adrian.popa
 */
public class StudentTest {

    private final static List<Student> students = new ArrayList<>();
    private final static int nrOfStudents = 10_000_000;
    private final Runtime runtime = Runtime.getRuntime();
    private final static Random rand = new Random();

    @BeforeClass
    public static void init() {
        System.out.println("\n###################################");
        System.out.println("          Stream Test");
        System.out.println("###################################");
        System.out.println("Sorting " + nrOfStudents + " students.\n");
        System.out.println("Method\t\t\tTime(ms)\tAvg. grade\t\t\tMemory(bytes)");

        for (int i = 0; i < nrOfStudents; i++) {
            students.add(new Student(rand.nextBoolean(), rand.nextDouble() * 10));
        }
    }

    @After
    public void garbage() {
        runtime.gc();
    }

    @Test
    public void testAverageGradeOfGraduatedStudents() {
        long memoryStart = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.currentTimeMillis();
        double avg = averageGradeOfGraduatedStudents(students);
        System.out.println("With stream\t\t" + (System.currentTimeMillis() - startTime) + "\t\t" + avg + "\t\t" + (runtime.totalMemory() - runtime.freeMemory() - memoryStart));
    }

    @Test
    public void testAverageGradeOfGraduatedStudents_theOldWay() {
        long memoryStart = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.currentTimeMillis();
        double avg = averageGradeOfGraduatedStudents_theOldWay(students);
        System.out.println("Without stream\t\t" + (System.currentTimeMillis() - startTime) + "\t\t" + avg + "\t\t" + (runtime.totalMemory() - runtime.freeMemory() - memoryStart));
    }
}
