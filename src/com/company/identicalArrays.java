package com.company;
import java.util.*;
public class identicalArrays {
    public static void main(String[] args) {
Scanner read=new Scanner (System.in);

int count=0;
int array [] =new int [5];
        System.out.println("Enter  " + 5 + " numbers now.");
for(int i=0;i<5;i++){
    array[i]= read.nextInt();
}


        int array2 [] =new int [5];
        System.out.println("Enter  " + 5 + " numbers now.");
        for(int i=0;i<5;i++){
            array2[i]= read.nextInt();
        }


for(int i=0;i<5;i++){
    if(array[i]!=(array2[i])){
        System.out.println("The Array is not identical");
        break;
    }else{
        count++;
       continue;
    }

}

if(count==5){
    System.out.println("The Array is identical");
}
    }
}
