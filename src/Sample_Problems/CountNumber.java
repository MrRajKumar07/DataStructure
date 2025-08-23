package Sample_Problems;
import java.util.*;
public class CountNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        int n=sc.nextInt();
        int count=0;

        while(n>0){
            int rem=n%10;
            if(rem==4){
                count++;
            }
            n /=10;
        }
        System.out.println(count);
    }
}
