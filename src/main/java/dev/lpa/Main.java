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
        printList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
        printList(lpaStudents);
//        Cathy S         Java            2020     44,2%
//        Bill K          C++             2022     95,0%
//        Bill C          C++             2020     27,5%
//        Bill W          Java            2018     33,6%
//        Bill P          Python          2021     79,2%
//        Tim D           Java            2019     98,6%
//        John R          C++             2018     20,8%
//        Cathy J         C++             2018     19,8%
//        Tim E           Java            2018     57,6%
//        Ann K           Python          2019     62,2%
    }

    public static void printList(List students) {
        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}
