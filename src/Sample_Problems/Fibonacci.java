package Sample_Problems;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Terms");
        int count=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");

        for (int i = 2; i < count; i++) {
            int temp=a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
        }

        System.out.println("Enter nth Term");
        int n=sc.nextInt();
        System.out.println(b);
    }
}
