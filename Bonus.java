import java.util.*;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter years of service of employee");
        int years=sc.nextInt();
        System.out.println("Enter the salary of the employee");
        int salary=sc.nextInt();
        double bonus=salary*0.05;
        if(years>=5){
            System.out.println("The bonus for the employee is "+bonus);
        }
        else {
            System.out.println("there is no bonus for the employee whose years of service are less than 5 years");
        }

        sc.close();
    }
}