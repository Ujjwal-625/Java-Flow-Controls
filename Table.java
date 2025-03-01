import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter any number from 6 to 9");

        int number =sc.nextInt();

        int i=1;
        while(i<=10){
            System.out.println(number +" * "+ i +" = "+i*number);
            i++;
        }
        sc.close();
    }
}