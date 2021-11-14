import java.util.Arrays;

class Grades{
    public static void main (String[] args){
        int[] myTestResults = {(int)(Math.random() * 100),(int)(Math.random() * 100),(int)(Math.random() * 100),(int)(Math.random() * 100),(int)(Math.random() * 100)};
        System.out.println(Arrays.toString(myTestResults));
        int totalResults = 0;
        for (int i=0;i<myTestResults.length ;i++){
            totalResults = totalResults + myTestResults[i];
        }
        float average = (float) totalResults/(float) myTestResults.length;
        System.out.println(average);
        if (average>=80){
            System.out.println("Your Grade is: A");
        }
        else if (average>=70){
            System.out.println("Your Grade is: B");
        }
        else if (average>=60){
            System.out.println("Your Grade is: C");
        }
        else if (average>=50){
            System.out.println("Your Grade is: D");
        }
        else {
            System.out.println("Your Grade is: F");
        }
    }
}