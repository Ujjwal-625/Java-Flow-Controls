import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number");
        a=sc.nextInt();    
        System.out.println("Enter second number");
        b=sc.nextInt();    
        System.out.println("Enter third number");
        c=sc.nextInt();
        
        System.out.println(" Is the first number the largest? "+(a>=b && a>=c));
        System.out.println(" Is the second number the largest? "+(b>=a && b>=c));
        System.out.println(" Is the third number the largest? "+(b<=c && a<=c));
   } 
}
