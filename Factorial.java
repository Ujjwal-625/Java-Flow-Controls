import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter any postive non zero number");

        int n=sc.nextInt();

        int fact=1;
        
        int temp=n;
        while(n>=1){
            fact*=n;
            n--;
        }
        System.out.println("Factorial of "+temp +" is : "+fact);
        sc.close();
    }
}