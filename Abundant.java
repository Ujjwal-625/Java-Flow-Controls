import java.util.*;

public class Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter the number");

        int n=sc.nextInt();

        int i=1;
        int sum=0;
        while(i<=n/2){
            if(n%i==0){
            sum+=i;
            System.out.println("divisor : "+i);
            }
            i++;
        }
        System.out.println(sum);

        if(sum>n){
            System.out.println(n +" is an Abundant number");
        }
        else 
        System.out.println(n+" is not an Abandant number");
        sc.close();
    }
}