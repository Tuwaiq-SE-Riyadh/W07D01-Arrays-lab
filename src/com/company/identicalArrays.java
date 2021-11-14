package com.company;

import java.util.Scanner;

public class identicalArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array 1 & 2 :");
        int theLength = sc.nextInt();
        int  array1 [] = new int[theLength];
        int  array2 [] = new int[theLength];

        for(int i = 0 ; i < array1.length ; i++)
        {
            System.out.print("Array1 , index "+ i +" :");
            array1[i] = sc.nextInt();
        }
        System.out.println("------");
        for(int j = 0 ; j < array2.length ; j++)
        {
            System.out.print("Array2 , index "+ j +" :");
            array2[j] = sc.nextInt();
        }
        System.out.println("==========");
        checkIfIdentical(array1,array2);
    }

    private static void checkIfIdentical(int arr1 [], int arr2 [])
    {
        for(int i = 0 ; i < arr1.length-1 ; i++)
        {
            if(arr1[i] != arr2[i])
            {
                System.out.println("The two arrays are not identical");
                return;
            }
        }
        System.out.println("The two arrays are identical");
    }
}
