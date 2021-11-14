package com.company;

import java.util.Scanner;

public class identicalArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter how many numbers you want in each array");
        int num = scan.nextInt();
        int fArray[] = new int[num];
        int sArray[] = new int[num];
        System.out.println("enter the first array numbers");
        for(int i=0; i<fArray.length ; i++)
            fArray[i]= scan.nextInt();
        System.out.println("enter the Second array numbers");
        for(int i=0; i<sArray.length ; i++)
            sArray[i]= scan.nextInt();
        int x=0;
        for(int i=0; i<sArray.length ; i++){
            if(sArray[i] != fArray[i]) {
                x=1;
                break;
            }
        }
        if(x == 1)
            System.out.println("The two arrays are not identical");
        else
            System.out.println("The two arrays are identical");
    }
}
