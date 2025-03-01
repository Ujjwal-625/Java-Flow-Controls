import java.util.*;

public class AgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        int a1,a2,a3,h1,h2,h3;
        System.out.println("enter age of amar");
        a1=sc.nextInt();
        System.out.println("enter age of akbar");
        a2=sc.nextInt();
        System.out.println("enter age of anthony");
        a3=sc.nextInt();

        int maxAge=Math.max(a1, Math.max(a2,a3));

        System.out.println("enter height of amar");
        h1=sc.nextInt();
        System.out.println("enter height of akbar");
        h2=sc.nextInt();
        System.out.println("enter height of anthony");
        h3=sc.nextInt();

        int maxHeight=Math.max(h1, Math.max(h2,h3));

        System.out.println("Max Age from the three of them is "+maxAge+" Maxheight from the three of them is "+maxHeight);
        sc.close();
    }
}