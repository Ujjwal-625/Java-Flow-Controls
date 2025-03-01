import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter any number greater than 1 ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2==1)
            System.out.println(i +" is odd ");
            else 
            System.out.println(i +" is even ");
        }
        sc.close();
    }
}