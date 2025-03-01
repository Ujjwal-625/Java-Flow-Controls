import java.util.*;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter any positive and non zero number ");

        int n=sc.nextInt();

        int fact =1;

        for(int i=1;i<=n;i++){
            fact*=i;
        }

        System.out.println("The factorial of "+ n+ " is "+fact);


        sc.close();
    }
}