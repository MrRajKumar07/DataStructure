package Core_Java;
import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //for Loop
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println();

        //while Loop
        System.out.println("Enter Number");
        int num=sc.nextInt();
        int k=1;
        while(k<=num){
            if(k%2==0){
                System.out.println(k);
            }
            k++;
        }
        System.out.println();

        //do-while loop
        System.out.println("Enter Number");
        int number=sc.nextInt();
        int m=1;
        do{
            if(m%2!=0){
                System.out.println(m);
            }
            m++;
        }
        while(m<=number);
        System.out.println();

        //for-each Loop
        String[] branches={"CSE","CTMA","ME","ECE","EEE","CE"};
        for(String branch:branches){
            System.out.println(branch);
        }
        System.out.println();

        //Nested Loop
        System.out.println("Enter a Number");
        int p=sc.nextInt();
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= p; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

    }
}
