import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        int physics ,chemestry ,maths;
        System.out.println("Enter Physics Marks");
        physics=sc.nextInt();
        System.out.println("Enter Chemestry Marks");
        chemestry=sc.nextInt();
        System.out.println("Enter Maths Marks");
        maths=sc.nextInt();

        double result=(physics+chemestry+maths)/3;

        if(result>=80)
        System.out.println("Your grade is A");
        else if(result>=70)
        System.out.println("Your grade is B");
        else if(result>=60)        
        System.out.println("Your grade is C");
        else if(result>=50)        
        System.out.println("Your grade is D");
        else if(result>=40)        
        System.out.println("Your grade is E");
        else
        System.out.println("Your grade is R");

        sc.close();
    }
}