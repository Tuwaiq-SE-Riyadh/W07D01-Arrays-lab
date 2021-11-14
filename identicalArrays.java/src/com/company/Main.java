package com.company;

import java.util.Scanner;

public class Main {

    public static int  identicalArrays(){

        int [] array1 = new int[5];
        int [] array2 = new int[5];
        Scanner input = new Scanner(System.in);

        for(int i=0; i<array1.length; i++){

            System.out.print("array1 enter integer number");
            array1[i] = input.nextInt();
        }
        System.out.println();
        for(int i=0; i<array2.length; i++){

            System.out.print("array2 enter integer number");
            array2[i] = input.nextInt();
        }

        for(int i=0; i<array1.length; i++){

            if(array1[i] != array2[i]) {
                System.out.println("array1 NOT equal array2");
                return 0;
            }


        }


        System.out.println("array1 equal array2");

        return 0;

    }

    public static void main(String[] args) {
	// write your code here

        Main.identicalArrays();
    }
}
