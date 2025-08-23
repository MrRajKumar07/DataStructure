package Sample_Problems;
import java.util.*;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Character");
        char ch=sc.next().trim().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println("UpperCase");
        }
        else{
            System.out.println("LowerCase");
        }
    }
}
