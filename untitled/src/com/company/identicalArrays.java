package com.company;
import java.util.*;

class Arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("enter size");
//        int n = in.nextInt();
//        int m = in.nextInt();
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
//        if (m != n) {
//            System.out.println("not equal");
//        }


        for (int i = 0; i < arr1.length; i++) {

            arr1[i] = in.nextInt();
        }
        for (int j = 0; j < arr2.length; j++){
            arr2[j] = in.nextInt();
        }
        for(int i=0; i< arr1.length; i++)

        {
            if (arr1[i] == arr2[i]) {
                System.out.println("equal");
            } else {
                System.out.println("not equal");
                break;
            }

        }
    }



}





