package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        grades obj1 = new grades();
        identicalArrays obj2 = new identicalArrays();
        Scanner input = new Scanner(System.in);

        //task2
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        //assuming array length =5 and enter the values
        System.out.println("Enter 5 values for first array");
        for (int i = 0; i < 5; i++) {
            array1[i] = input.nextInt();
        }

        System.out.println("Enter 5 values for second array");
        for (int i = 0; i < 5; i++) {
            array2[i] = input.nextInt();
        }
        //call the function
        boolean result = obj2.checkOfIdentical(array1,array2);
        if(result){
            System.out.println("The two arrays are identical");

        }else{
            System.out.println("The two arrays are not identical");

        }

        int[] array = new int[5];
        System.out.println("Enter 5 grades");
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();
        }
        double average = obj1.averageOfArray(array);
        if ((int) average <= 100 && (int) average >= 80) {
            System.out.println("the average: " + average + "and the grade is: A");

        } else if ((int) average <= 79 && (int) average >= 70) {
            System.out.println("the average: " + average + "and the grade is: B");

        } else if ((int) average <= 69 && (int) average >= 60) {
            System.out.println("the average: " + average + "and the grade is: C");

        } else if ((int) average <= 59 && (int) average >= 50) {
            System.out.println("the average: " + average + "and the grade is: D");

        } else if ((int) average <= 49) {
            System.out.println("the average: " + average + "and the grade is: F");

        }
        System.out.println("the average: " + average);

    }
}
