package Sample_Problems;
import java.util.*;
public class PrimeNumber {
    static boolean isPrime(int n){
        if(n<=0){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }

    }
}
