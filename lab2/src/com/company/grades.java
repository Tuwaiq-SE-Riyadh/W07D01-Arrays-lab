package com.company;

public class grades {

    public static void main(String[] args) {

        int[] grades = {40 , 60 , 80 , 80 , 85};
        int count=0;
        char letter='a';
        for (int i=0; i<grades.length; i++)
            count+=grades[i];
        int avg = count/grades.length;
        if(avg>=80)
            letter='A';
        else if(avg<80 && avg>=70)
            letter='B';
        else if(avg<70 && avg>=60)
            letter='C';
        else if(avg<60 && avg>=50)
            letter='D';
        else if(avg<=49)
            letter='F';
        System.out.println(letter);

    }
}
