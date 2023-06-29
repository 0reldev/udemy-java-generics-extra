package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        students.add(new LPAStudent());
//        printList(students);
        printMoreList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
//        printList(lpaStudents);
        printMoreList(lpaStudents);
//                2021: Tim E           C++             2021     35,2%
//                2018: Tim P           Python          2018     50,0%
//                2022: Tim X           Python          2022     97,1%
//                2022: Tim K           C++             2022      9,2%
//                2022: John B          Java            2022     86,6%
//                2020: Tim B           Python          2020     51,7%
//                2019: Ann L           C++             2019     46,6%
//                2020: Ann K           C++             2020     83,6%
//                2020: Cathy W         Java            2020     70,6%
//                2021: John W          Java            2021     13,1%

        testList(new ArrayList<String>(List.of("Able", "Berry", "Charlie")));
//        String: ABLE
//        String: BERRY
//        String: CHARLIE
        testList(new ArrayList<Integer>(List.of(1, 2, 3)));
//        Integer: 1.0
//        Integer: 2.0
//        Integer: 3.0
    }

    public static void printMoreList(List<? extends Student> students) {


        for (var student : students) {
            System.out.println(student + ": " + student);
        }
        System.out.println();
    }

//    public static <T extends Student> void printList(List<T> students) {
//        for (var student : students) {
//            System.out.println(student.getYearStarted() + ": " + student);
//        }
//        System.out.println();
//    }


    // Those two method below have the same type erasure at the compilation

//    public static void testList(List<String> list) {
//
//        for (var element : list) {
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }
//
//    public static void testList(List<Integer> list) {
//
//        for (var element : list) {
//            System.out.println("Integer: " + element.floatValue());
//        }
//    }


    public static void testList(List<?> list) {

        for (var element : list) {
            if (element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }






}