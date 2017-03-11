package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] intArray = new int[10];
//
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = i;
//            System.out.println(i);
//
//        }

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);

        }

        System.out.println("The average is " + getAverage(myIntegers));

        // write your code here
    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;

    }

    private  static  double getAverage(int[] array){
        int sum =0;
        for(int i=0; i< array.length; i++) {
            sum += array[i];
        }

        return (double) sum/array.length;

    }

}
