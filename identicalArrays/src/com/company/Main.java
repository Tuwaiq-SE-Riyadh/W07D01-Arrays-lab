package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter length of first array");
        Scanner input = new Scanner(System.in);
        int firstArrayLength=input.nextInt();
        System.out.println("Enter integers of array");
        int[] firstArray=new int[firstArrayLength];
        int i=0;
        while (i<firstArray.length) {
            Scanner input2 = new Scanner(System.in);
            int userInput=input.nextInt();
            firstArray[i] = userInput;
            i=i+1;
            }

        System.out.println("Enter length of second array");
        Scanner input3 = new Scanner(System.in);
        int secondArrayLength=input3.nextInt();
        System.out.println("Enter integers of array");
        int s=0;
        int[] secondArray=new int[secondArrayLength];
        while (s<secondArray.length) {
            Scanner input4 = new Scanner(System.in);
            int userInput2=input4.nextInt();
            secondArray[s] = userInput2;
            s=s+1;
        }

        System.out.println("finish fill");
        boolean flag=true;
        if(firstArrayLength==secondArrayLength){
            for (int r=0;r<firstArray.length;r++){
                if(firstArray[r]!=secondArray[r]){
                    flag=false;
                    break;
                }
            }
            if (flag==true){
                System.out.println("identical arrays");
            }else{
                System.out.println("not identical");
            }
        }else{
            System.out.println("Not identical arrays");
        }
        }

        }
