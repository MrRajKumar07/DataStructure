package Sample_Problems;
import java.util.*;
public class PalindromeNumber {
    static boolean isPalindrome(int n){
        int Original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n /=10;
            sum=(sum*10)+rem;
        }
        return sum==Original;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        int n=sc.nextInt();
        if(isPalindrome(n)){
            System.out.println(n + " is Palindrome");
        }
        else{
            System.out.println(n + " is Not Palindrome");
        }
    }
}
