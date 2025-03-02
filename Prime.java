import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter the number ");

        int num =sc.nextInt();
        boolean isPrime=true;
        if (num==0 || num==1){
            isPrime=false;
            System.out.println(num+" is not a Prime Number");
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println(num +" is not a Prime Number");
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num +" is a Prime Number");
        }
        
        sc.close();
    }
}