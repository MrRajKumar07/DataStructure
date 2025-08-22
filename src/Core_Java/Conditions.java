package Core_Java;
import java.util.*;
public class Conditions {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        //if Statement
        System.out.println("Enter Age: ");
        int age = in.nextInt();
        if(age>18){
            System.out.println("You are Eligible for Voting...");
        }
        System.out.println();

        //if-else Statement
        System.out.println("Enter Number");
        int num= in.nextInt();

        if(num%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        System.out.println();

        //if-else-if statement
        System.out.println("Enter a Number");
        int n=in.nextInt();

        if(n>0){
            System.out.println("Positive Number");
        }
        else if (n<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Zero");
        }
        System.out.println();

        //Nested if Statement
        System.out.println("Enter marks");
        int marks=in.nextInt();

        if(marks>=0 && marks<=100){
            if(marks>90){
                System.out.println("Grade A");
            }
            else if (marks>80){
                System.out.println("Grade B");
            }
            else if(marks>60){
                System.out.println("Grade C");
            }
            else{
                System.out.println("Fail");
            }
        }
        else{
            System.out.println("Invalid marks!");
        }
        System.out.println();

        //Switch Case
        System.out.println("Enter Day(1-7)");
        int days= in.nextInt();

        switch (days){
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
        }
        System.out.println();
    }
}
