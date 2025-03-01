import java.util.*;

public class Sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        int sum=0;
        boolean flag=true;
        while(flag){
            System.out.println("Enter the value enter 0 or negative to stop");
            int a=sc.nextInt();
            if(a==0 || a<0)
            break;

            sum+=a;
        }
        System.out.println("The sum of the values you provided "+sum);
        sc.close();
    }
}