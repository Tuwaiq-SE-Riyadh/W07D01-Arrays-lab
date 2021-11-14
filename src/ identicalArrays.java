import java.util.Arrays;
import java.util.Scanner;

class IdenticalArrays{
    public static void main(String[] args){
        int[] Array1 = new int[3];
        int[] Array2 = new int[3];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers for First array: ");
        for (int i=0;i<Array1.length;i++){
            int num = input.nextInt();
            Array1[i] = num;
        }
        System.out.println("Enter three numbers for Second array: ");
        for (int i=0;i<Array2.length;i++){

            int num = input.nextInt();
            Array2[i] = num;
        }
        if (Arrays.equals(Array1,Array2)){
            System.out.println("The two arrays are identical");
        }
        else {
            System.out.println("The two arrays are NOT identical");
        }

    }
}