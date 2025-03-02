import java.util.*;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here

        System.out.println("Enter the number whose greatest factor you want to find ");

        int num=sc.nextInt();


        int ans=1;
        int fac=1;

        int i=2;
        int temp=num;
        System.out.println("Factors of "+ num+" are ");
        while(num!=1 && i<=num){
            if(num%i==0){
                while(num%i==0){
                    System.out.print(i+" ");
                    ans=Math.max(i,ans);
                    num=num/i;
                    fac =Math.max(num,fac);

                }
            }
            i++;
        }

        System.out.println("\nThe greatest prime factor of "+temp+" is "+ans);
        System.out.println("The greatest factor of "+temp+" is "+fac);

        sc.close();
    }
}