import java.util.*;

public class WhileLopp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter the number from which you want to count down");

        int a=sc.nextInt();

        while(a>0){
            System.out.println(a--);
        }
        sc.close();
    }
}