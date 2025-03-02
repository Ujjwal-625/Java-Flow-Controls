import java.util.*;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here

        System.out.println("Enter the number ");
        int num=sc.nextInt();
        
        System.out.println("All multiples of "+num +" below 100 are");

        int temp=num;
        int i=1;
        while(temp<=100){
            temp=num*i;
            if(temp<=100)
            System.out.println(temp);
            i++;
        }
        
        sc.close();
    }
}