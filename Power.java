import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here

        System.out.println("Enter the base ");
        int base=sc.nextInt();
        System.out.println("Enter the exponent ");
        int exponent=sc.nextInt();

        long ans=1;
        for(int i=1;i<=exponent;i++){
            ans*=base;
        }
        System.out.println(base+"^"+exponent+" = "+ans);
        sc.close();
    }
}