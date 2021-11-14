package com.company;

import java.util.Arrays;

public class grades {

    public static void main(String[] args) {
        double[] myTestResults = {40 , 60 , 80 , 80 , 85};
        double avg = Arrays.stream(myTestResults).sum()/5;
        System.out.println("Avg ="+avg);
        if(avg >= 80){
            System.out.println("A");
        }else if (avg >= 70){
            System.out.println("B");
        }else if(avg >= 60){
            System.out.println("C");
        }else if(avg >= 50){
            System.out.println("D");
        }else if(avg <= 49){
            System.out.println("F");
        }

 }}

