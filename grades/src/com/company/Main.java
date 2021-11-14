package com.company;

public class Main {

    public static void main(String[] args) {

        int[] myTestResults = {50, 60, 70, 80, 90, 100};

        for(int i = 0 ; i < myTestResults.length ; i++){
            if(myTestResults[i] >= 80){
                System.out.println("80-100 : A");}
            else if(myTestResults[i] >= 70 && myTestResults[i] <= 79){
                System.out.println("70-79 : B");}
            else if(myTestResults[i] >= 60 && myTestResults[i] <= 69){
                System.out.println("60-69 : C");}
            else if(myTestResults[i] >= 50 && myTestResults[i] <= 59){
                System.out.println("50-59 : D");}
            else{
                System.out.println("49 or less : F");}
        }
    }
}
