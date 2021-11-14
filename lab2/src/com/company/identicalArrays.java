package com.company;

import java.util.Scanner;

public class identicalArrays {
    public static void main(String[] args) {

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        Scanner input = new Scanner(System.in);

        System.out.println("Please fill the first array : ");

        for(int i = 0 ; i < arr1.length ; i++){
            arr1[i] = input.nextInt();
        }
        System.out.println("Please fill the second array : ");

        for(int i = 0 ; i < arr2.length ; i++){
            arr2[i] = input.nextInt();
        }

        for(int i = 0 ; i < arr1.length ; i++){
            if(arr1[i] == arr2[i]){
            System.out.println("The two arrays are identical");
            }
            else{
            System.out.println("The two arrays are not identical");
            break;
            }
        }
    }
    }
