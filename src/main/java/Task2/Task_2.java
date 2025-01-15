package Task2;

import com.google.common.primitives.Ints;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = {23,4,54,765,656,4,56,776,232,12313,536,78768,5345,12321,5345,654};

        int maxValue = Ints.max(num);
        int minValue = Ints.min(num);

        System.out.println("Max value: " + maxValue);
        System.out.println("Min value: " + Ints.min(num));

        System.out.println("Enter TEST VALUE: ");
        int testValue = Integer.parseInt(sc.nextLine());
        System.out.println("Does list NUM contain "+ testValue + "?" + Ints.contains(num, testValue));

        Integer[] integerArray = Ints.asList(num).toArray(new Integer[0]);
        for (Integer integer: integerArray) {
            System.out.print(" [" + integer + "] ");
        }



    }
}
