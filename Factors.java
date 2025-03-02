import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter the number of which you want you want Factors of ");
        int num=sc.nextInt();

        System.out.println("The Prime Factors of "+num +" are ");

        int i=2;
        for(;num!=1 && i<=num;i++){
            if(num%i==0){
                while(num%i==0){
                    System.out.print(i+" ");
                    num=num/i;
                }
            }
        }
        sc.close();
    }
}