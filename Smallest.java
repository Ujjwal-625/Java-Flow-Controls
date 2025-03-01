import java.util.*;

public class Smallest {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number");
        a=sc.nextInt();    
        System.out.println("Enter second number");
        b=sc.nextInt();    
        System.out.println("Enter third number");
        c=sc.nextInt();
        
        System.out.println(" Is the first number the smallest? "+(a<=b && a<=c));
   } 
}
