import java.util.*;

public class NaturalSumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter any natural number");

        int n=sc.nextInt();

        int sum =0;

        for(int i=1;i<=n;i++){
            sum+=i;
        }

        System.out.println("The sum of "+ n +" natural numbers is "+sum);
        sc.close();
    }
}