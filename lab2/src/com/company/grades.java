package com.company;

import javax.swing.*;

public class grades {
    public static void main(String[] args) {
        int [] arr = {15,10,10,10,11};
        int total = 0;
        for(int i=0 ;i<arr.length ;i++){
            total+=arr[i];

        }
        System.out.println(total);
        if(total<=100&&total>=80){
            System.out.println('A');
        } else if (total<=79&&total>=70){
            System.out.println('B');
        } else if (total<=69&&total>=60){
            System.out.println('C');
        } else if (total<=59&&total>=50){
            System.out.println('C');
        }else {
            System.out.println('F');
        }

    }
}
