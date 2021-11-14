public class grades {
    public static void main(String[] args) {
        System.out.println("HI");
        int[] myTestResults = {40 , 60 , 80 , 80 , 85};

        int sum = 0;
        for (int value : myTestResults) {
            sum += value;
        }
        double Average = sum/5;

        System.out.println("Average: "+ Average);
        if(Average >= 80){
            System.out.println("A");
        }else if(Average>=70){
            System.out.println("B");
        }else if(Average>=60){
            System.out.println("C");
        }else if(Average>=50){
            System.out.println("D");
        }else{
            System.out.println("F");
        }


    }
}