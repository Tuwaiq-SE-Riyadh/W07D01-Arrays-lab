import java.util.Scanner;

public class identicalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] FirstArray = new int[5];
        int [] SecondArray = new int[5];

        System.out.println("Enter first Array:");
        for( int value : FirstArray){
            FirstArray[value]=scanner.nextInt();
        }

        System.out.println("Enter second Array:");
        for( int value : SecondArray){
            SecondArray[value]=scanner.nextInt();
        }

        if (FirstArray == SecondArray) {
            System.out.println("Arrays are equal.");
        }else{
            System.out.println("Arrays are not equal.");
        }
    }

}


