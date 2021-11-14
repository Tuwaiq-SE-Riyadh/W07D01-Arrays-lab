package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] array1 = new int[4];
        int[] array2 = new int[4];
        String message="";

        System.out.println("Fill the first array: ");

        for(int i = 0 ; i < array1.length ; i++){
            array1[i] = in.nextInt();
        }
        System.out.println("Fill the second array: ");

        for(int i = 0 ; i < array2.length ; i++){
            array2[i] = in.nextInt();
        }

        for(int i = 0 ; i < array1.length ; i++){
            if(array1[i] == array2[i]){
                message = "The two arrays are identical";}
            else{
                message = "The two arrays are not identical";
                break;}
        }
        System.out.println(message);
    }
}
