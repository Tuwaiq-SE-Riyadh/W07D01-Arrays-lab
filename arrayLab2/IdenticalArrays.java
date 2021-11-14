package arrayLab2;

import java.util.Scanner;

public class IdenticalArrays 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String result = "";
		System.out.println("Enter the size of the first Array: ");
		int size1 = scanner.nextInt();
		int[] array1 = new int [size1];
		for(int i=0; i<array1.length; i++){
			System.out.println("Enter element number " + (i+1));
			array1[i] = scanner.nextInt();
		}
		System.out.println("-----------------------------------");
		System.out.println("Enter the size of the second Array: ");
		int size2 = scanner.nextInt();
		int[] array2 = new int [size1];
		for(int i=0; i<array2.length; i++){
			System.out.println("Enter element number " + (i+1));
			array2[i] = scanner.nextInt();
		}
		if(array1.length != array2.length){
			System.out.println("The two arrays are not identical");
		}
		else{
			for(int i=0; i<array1.length; i++){
				if(array1[i] != array2[i]){
					result = "The two arrays are not identical";
					break;
				}else {
					result = "The two arrays are identical";
				}
			}
			System.out.println(result);
		}

	}

}
