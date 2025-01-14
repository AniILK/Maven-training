package org.example;

import com.google.common.collect.Range;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Range<Integer> range1 = Range.closed(1, 10);
        Range<Integer> range2 = Range.openClosed(5, 15);

        System.out.println("Enter TEST VALUE: ");
        int testValue = Integer.parseInt(sc.nextLine());
        System.out.println("Does range1 contain "+ range1 + "?" + range1.contains(testValue));
        System.out.println("Does range2 contain "+ range2 + "?" + range2.contains(testValue));

        Range<Integer> intersection = range1.intersection(range2);
        System.out.println("Intersection of range1 and range2 " + intersection);

    }
}