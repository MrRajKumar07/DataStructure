package Sample_Problems;
import java.util.*;
public class EvenNumber {
    static boolean isEven(int n){
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        if(isEven(n)){
            System.out.println(n + " is Even");
        }
        else{
            System.out.println(n + " is Odd");
        }

    }
}
