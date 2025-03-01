import java.util.*;

public class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter a number");

        int n=sc.nextInt();

        if(n>0){
            for(int i=1;i<=n;i++) {
                if(i%3==0 && i%5==0)
                System.out.println("FIZZBUZZ");
                else if(i%3==0){
                    System.out.println("FIZZ");
                }
                else if(i%5==0){
                    System.out.println("BUZZ");
                }
                else 
                System.out.println(i);
            }
        }
        else {
            System.out.println("Negative number was entered");
        }
        sc.close();
    }
}