package com.company;

import java.util.Scanner;

public class identicalArrays {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter The Second Number :");
        //int input2 = input.nextInt();
        int size = 3;
        int [] array1 =new int [size];
        int [] array2 = new int [size];
        boolean comare = true;
        System.out.println("Enter The Numbers of First Array:");
        for(int i=0; i<size; i++){

            array1[i] = input.nextInt();
        }
        System.out.println("Enter The Numbers of Second Array:");
        for(int i=0; i<size; i++){

            array2[i] = input.nextInt();
        }
        for(int i=0; i<size; i++){

            if(array1[i]==array2[i]){
                comare = true;
            }
            else{
                comare = false;
            }
        }
    if(comare==true){
        System.out.println("The two arrays are identical");
    }else{
        System.out.println("The two arrays are not identical");
    }
    }
}
