package Sample_Problems;
import java.util.*;
public class ArmstrongNumber {
    static boolean isArmstrong(int n){
        int Original=n;
        int sum=0;
        while (n>0){
            int rem=n%10;
            n /=10;
            sum=sum+rem*rem*rem;
        }
        return sum==Original;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println(n + " is Armstrong");
        } else {
            System.out.println(n + " is Not Armstrong");
        }

        //Find all the 3 digit Armstrong Number
        for (int i = 100; i <1000 ; i++) {
            if(isArmstrong(i)){
                System.out.println(i+" ");
            }

        }
    }
}
