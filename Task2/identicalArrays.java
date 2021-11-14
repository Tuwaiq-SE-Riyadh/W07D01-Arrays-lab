package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class identicalArrays {

        public static void main(String[] args) {
                int arr1[] = new int [4];
                int arr2[] = new int [4];
                Scanner in = new Scanner(System.in);


                for(int i = 0 ; i < 4 ; i++){
                        System.out.println("Enter Number:"+(i+1)+" in array [1]");
                        int num = in.nextInt();
                        arr1[i] = num;
                }

                for(int i = 0 ; i < 4 ; i++){
                        System.out.println("Enter Number:"+(i+1)+" in array [2]");
                        int num = in.nextInt();
                        arr2[i] = num;

                }

                if(Arrays.equals(arr1, arr2)){
                        System.out.println("The two arrays are identical");
                }else {
                        System.out.println("The two arrays are not identical");
                }

}}
