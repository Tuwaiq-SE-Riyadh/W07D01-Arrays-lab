package arrayLab2;

public class Grades 
{

	public static void main(String[] args) 
	{
		int [] myTestResults = {70 , 65 , 89 , 97 , 59};
		int avarage = 0, total = 0;;
		
		for(int i=0; i<myTestResults.length; i++)
		{
			total += myTestResults[i];
		}
		avarage = total / myTestResults.length;
		System.out.println("Avarage = " + avarage);
			switch (avarage / 10) {
			case 10:
			case 9:
			case 8:
				System.out.println("A");
				break;
				
			case 7: 
				System.out.println("B");
				break;
				
			case 6 : 
				System.out.println("C");
				break;
			
			case 5: 
				System.out.println("D");
				break;
			
			case 4: 
				System.out.println("F");
				break;
			
			default:
				break;
			}
	}
}

