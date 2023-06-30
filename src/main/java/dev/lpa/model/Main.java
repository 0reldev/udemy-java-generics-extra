package dev.lpa.model;

import dev.lpa.util.QueryList;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        QueryList<LPAStudent> queryList = new QueryList<>();
        for (int i = 0; i < 25; i++) {
            queryList.add(new LPAStudent());
        }

        System.out.println("Order");
        queryList.sort(Comparator.naturalOrder());
        printList(queryList);
//        Order
//        10000 Tim A           Python          2021     36,3%
//        10001 Bill S          Java            2019     86,9%
//        10002 Ann R           C++             2022      3,3%
//        10003 Tim C           C++             2022     56,4%
//        10004 John B          Python          2022      5,2%

        System.out.println("Matches");
        var matches = queryList
                .getMatches("PercentComplete", "50")
                .getMatches("Course", "Python");

        matches.sort(new LPAStudentComparator());
        printList(matches);
//        Matches
//        10012 Cathy P         Python          2020     21,9%
//        10014 Ann P           Python          2019     28,3%
//        10022 John M          Python          2021     28,4%
//        10002 Ann Z           Python          2018     32,8%

        System.out.println("Ordered");
        matches.sort(null);
        printList(matches);
//        Ordered
//        10004 Tim W           Python          2021     34,9%
//        10005 Cathy G         Python          2020     19,2%
//        10007 Ann X           Python          2020     28,3%
//        10014 Ann C           Python          2022     26,5%
//        10022 Ann X           Python          2022      0,9%
    }

    public static void printList(List<?> students) {
        for (var student : students) {
            System.out.println(student);
        }
    }
}