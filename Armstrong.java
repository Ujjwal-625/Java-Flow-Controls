import java.util.*;

public class Armstrong {
    static int digits(int num){
        int ans=0;
        if(num<0 ){
            return 0;
        }
        if(num==0){
            return 1;
        }
        while(num!=0){
            num/=10;
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here

        System.out.println("Enter the number ");

        int n=sc.nextInt();

        int power=digits(n);
        // System.out.println(power);

        int sum=0;
        int temp=n;

        while(temp!=0){
            sum+= Math.pow(temp%10,power);
            temp/=10;
        }
         
        System.out.println(sum);

        if(sum==n){
            System.out.println(n +" is an armstrong number");
        }
        else 
        System.out.println(n +" is not an armstrong number");
        
        sc.close();
    }
}