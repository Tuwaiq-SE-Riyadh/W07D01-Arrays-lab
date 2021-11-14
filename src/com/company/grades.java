package com.company;

public class grades {

    public static void main(String[] args) {

        int [] myTestResults  = {40,60,80,80,85};
        int total = 0;
        int average ;
        for( int index : myTestResults)
        {
            total = total+index;
        }
        average = total/myTestResults.length;
        System.out.println("Average=" + average);
        if(average >= 80)
        {
            System.out.println("Letter symbol: A" );
        }
        else if(average >= 70)
        {
            System.out.println("Letter symbol: B" );
        }
        else if(average >= 60)
        {
            System.out.println("Letter symbol: C" );
        }
        else if(average >= 50)
        {
            System.out.println("Letter symbol: D" );
        }
        else {
            System.out.println("Letter symbol: F" );
        }
    }
}
