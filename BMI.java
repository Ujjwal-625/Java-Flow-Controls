import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter your weight in kg");

        int weight=sc.nextInt();

        System.out.println("Enter your height in meters");

        double height=sc.nextDouble();

        double BMI=weight/(height*height);
        System.out.println(BMI);

        if(BMI <=18.4){
            System.out.println("You are underweight");
        }
        else if(18.4<BMI && 24.9>=BMI){
            System.out.println("Your weight is normal");
        }
        else if(BMI>=25 && BMI<40){
            System.out.println("You are overWeight");
        }
        else {
            System.out.println("You are obese");
        }
        sc.close();
    }
}