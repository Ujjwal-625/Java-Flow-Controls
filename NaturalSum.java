import java.util.*;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter any natural number");
        int n=sc.nextInt();

        int sum=n*(n+1)/2;

        int sum1=0;

        int i=1;
        while(i<=n){
            sum1+=i;
            i++;
        }
        System.out.println("the sum using formula is "+sum);
        System.out.println("the sum using While Loop is "+sum1);
        sc.close();
    }
}