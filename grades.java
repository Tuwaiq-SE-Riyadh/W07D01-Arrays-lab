package com.company;

public class grades {

    public static void main(String[] args) {
        int [] myTestResults ={40,60,70,80,90};
        int total = 0 ;
        for(int i=0; i<myTestResults.length; i++){

            total = total + myTestResults[i];
        }
        int average = total / 5;
        System.out.println(average);

        if (average <= 100 && average > 79){
            System.out.println("A");
        }
        else if (average <= 79 && average > 69){
            System.out.println("B");
        }
        else if (average <= 69 && average > 59){
            System.out.println("C");
        }
        else if (average <= 59 && average > 49){
            System.out.println("D");
        }
        else if (average < 50){
            System.out.println("F");
        }
    }
}
