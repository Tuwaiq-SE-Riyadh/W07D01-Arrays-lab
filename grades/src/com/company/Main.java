package com.company;

public class Main {

    public static void main(String[] args) {
        int[] myTestResults = {100, 100, 100, 100, 100};
        int gradeNumber = 0;
        for (int i = 0; i < myTestResults.length; i++) {
            gradeNumber += myTestResults[i];
        }
        gradeNumber = gradeNumber / myTestResults.length;
        if(gradeNumber<=100 && gradeNumber>=80){
            System.out.println("Your garde "+gradeNumber+"=> A");
        }else{
            if(gradeNumber<=79 && gradeNumber>=70){
                System.out.println("Your garde "+gradeNumber+"=> B");
            }else{
                if(gradeNumber<=69 && gradeNumber>=60){
                    System.out.println("Your garde "+gradeNumber+"=> C");
                }
                else{
                    if(gradeNumber<=59 && gradeNumber>=50){
                        System.out.println("Your garde "+gradeNumber+"=> D");
                    }
                    else{
                        if(gradeNumber<=49){
                            System.out.println("Your garde "+gradeNumber+"=> F");
                        }
                    }
                }
            }
        }
    }
}
