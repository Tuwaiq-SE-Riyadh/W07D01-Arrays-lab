package com.company;

public class Main {

    public static void Task1(){

        int average = 0;
        int countNumberValue = 0;
        int total = 0;
        int myTestResults [] = {100,95,92,90,90};

        for(int i=0; i< myTestResults.length; i++){

            total = total + myTestResults[i];
            countNumberValue++;

        }

        average = total/countNumberValue ;
        System.out.println("average grade => " + average);

        if(average >= 80){
            System.out.println("grade => A");
        }
        else if(average >= 70){
            System.out.println("grade => B");
        }
        else if(average >= 60){
            System.out.println("grade => C");
        }
        else if(average >= 50){
            System.out.println("grade => D");
        }
        else {
            System.out.println("grade => F");
        }





    }
    public static void main(String[] args) {
	// write your code here

        Main.Task1();
    }
}
