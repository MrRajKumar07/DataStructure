package Sample_Problems;
import java.util.*;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Department:");
        int dept=sc.nextInt();

        System.out.println("Enter role:");
        int role=sc.nextInt();

        switch (dept){
            case 1:
                System.out.println("IT");
                switch (role){
                    case 1:
                        System.out.println("Developer");
                        break;
                    case 2:
                        System.out.println("Tester");
                        break;
                    case 3:
                        System.out.println("Manager");
                        break;
                    default:
                        System.out.println("Invalid Job Roles...!");
                }
                break;
            case 2:
                System.out.println("Bank");
                switch (role){
                    case 1:
                        System.out.println("Manager");
                        break;
                    case 2:
                        System.out.println("Staff");
                        break;
                    default:
                        System.out.println("Invalid Role..!");
                }
                break;
            default:
                System.out.println("Invalid Department");
        }

    }
}
