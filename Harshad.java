import java.util.*;

public class Harshad {

    static int sum(int n){
        int ans=0;
        while(n!=0){
            ans+=n%10;
            n/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here

        System.out.println("Enter the number ");

        int n=sc.nextInt();

        int s=sum(n);

        if(n%s==0){
            System.out.println(n+" is a Harshad number");
        }
        else {
            System.out.println(n+" is not a Harshad number");
        }
        
        sc.close();
    }
}