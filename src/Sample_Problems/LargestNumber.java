package Sample_Problems;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Using Conditions
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);
        System.out.println();

        //Using Math Function
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        int largest=Math.max(r,(Math.max(p,q)));
        System.out.println(largest);
    }
}
