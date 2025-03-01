import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        boolean flag =true;
        int sum=0;
        while(flag){
            System.out.println("Enter the value and to stop enter 0 ");
            int a=sc.nextInt();
            sum+=a;
            if(a==0){
                flag=false;
            }
        }
        System.out.println("The sum of the values you provided "+sum);
        sc.close();
    }
}