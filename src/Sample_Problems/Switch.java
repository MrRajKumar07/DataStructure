package Sample_Problems;
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Branches: ");
        String branch=sc.nextLine();

        switch (branch){
            case "CSE":
                System.out.println("Computer Science and Engineering");
                break;
            case "SE":
                System.out.println("Software Engineering");
                break;
            case "ME":
                System.out.println("Mechanical Engineering");
                break;
            case "CE":
                System.out.println("Civil Engineering");
                break;
            case "AI":
                System.out.println("Artificial Intelligence");
                break;
            case "DS":
                System.out.println("Data Science");
                break;
            case "ML":
                System.out.println("Machine Learning");
                break;
            default:
                System.out.println("Invalid Branch....!");

        }
    }
}
