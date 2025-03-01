import java.util.*;

public class NegativeOrPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter the number you want to examine");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Negative");
        }
        else if(n==0){
            System.out.println("Zero");
        }
        else {
            System.out.println("Positive");
        }
        sc.close();
    }
}