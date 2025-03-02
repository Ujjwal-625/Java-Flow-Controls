import java.util.*;

public class Power1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base , base should be positive and less than 100");
        int base=sc.nextInt();

        if(base>0){
        System.out.println("Enter the exponent ");
        int exponent=sc.nextInt();

        long result=1;;
        int counter=0;
        while(counter<exponent){
            result*=base;
            counter++;
        }
        System.out.println(base+"^"+exponent+" = "+result);
    }
        
        sc.close();
    }
}