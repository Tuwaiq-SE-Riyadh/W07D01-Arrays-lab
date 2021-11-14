package com.company;

public class Grades {
    public static void main(String[] args) {
       int myTestResults[]={60,80,90,100};
       int average=0;
       int sum=0;
       char grade=' ';
       for(int i=0;i<myTestResults.length;i++){
           sum+= myTestResults[i];
       }
        average=sum/myTestResults.length;
       System.out.println("average: "+average);

       if(average>80 &&average<100)
           grade='A';
       else {
           if(average>70 &&average<79)
               grade='B';
           else
               if(average>60 &&average<69)
                   grade='C';
               else if(average>50 &&average<59)
                   grade='D';
               else
                   if (average<49)
                       grade='F';
       }
        System.out.println("The Grade is:"+grade);
    }
}
