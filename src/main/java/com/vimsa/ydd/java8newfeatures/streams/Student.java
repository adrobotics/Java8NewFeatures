/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vimsa.ydd.java8newfeatures.streams;

import java.util.List;

/**
 *
 * @author adrian.popa
 */
public class Student {

    /**
     * See unit test !!!
     */
    private boolean graduated;
    private double grade;

    public Student(boolean graduated, double grade) {
        this.graduated = graduated;
        this.grade = grade;
    }

    public static double averageGradeOfGraduatedStudents(List<Student> students) {
        return students.stream()
                .filter(s -> s.hasGraduated())
                .mapToDouble(Student::getGrade)
                .average()
                .getAsDouble();
    }

    public static double averageGradeOfGraduatedStudents_theOldWay(List<Student> students) {
        double sum = 0;
        int nr = 0;
        for (Student student : students) {
            if (student.hasGraduated()) {
                sum += student.getGrade();
                nr++;
            }
        }
        return sum / (double) nr;
    }

    public double getGrade() {
        return grade;
    }

    public boolean hasGraduated() {
        return graduated;
    }
}
