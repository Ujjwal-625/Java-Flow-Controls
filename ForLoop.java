import java.util.*;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter the number from which you want to count down");
        int a=sc.nextInt();
        for(int i=a;i>0;i--){
            System.out.println(i);
        }
        sc.close();
    }
}