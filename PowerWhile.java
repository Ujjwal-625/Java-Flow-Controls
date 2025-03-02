import java.util.*;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter the base , base should be positive and less than 100");
        int base=sc.nextInt();

        if(base>0){
        System.out.println("Enter the exponent ");
        int exponent=sc.nextInt();

        long ans=1;
        int i=1;
        while(i<=exponent){
            ans*=base;
            i++;
        }
        System.out.println(base+"^"+exponent+" = "+ans);
    }
        sc.close();
    }
}