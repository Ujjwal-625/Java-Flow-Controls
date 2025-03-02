import java.util.*;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter the number");
        int num =sc.nextInt();
        int ans=0;
        if(num<0 ){
            System.out.println(0); 
        }
        else if(num==0){
            System.out.println(1);
        }
        else{
            while(num!=0){
            num/=10;
            ans++;
        }
        System.out.println(ans);
    } 
        sc.close();
    }
}