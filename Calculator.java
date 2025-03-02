import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter first number ");
        double num1=sc.nextDouble();

        System.out.println("Enter any of the following operators +,-,*,/,%");

        char ch=sc.next().charAt(0);

        System.out.println("Enter second number");
        double num2=sc.nextDouble();

        double result=0;

        switch (ch) {
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num1/num2;
                break;
            case '%':
                result=num1%num2;
                break;
        
            default:
                break;
        }

        System.out.println(num1+" "+ch+" "+num2 +" = "+result);
        sc.close();
    }
}