package Core_Java;
import java.util.*;
public class Methods {
    //Method without Parameters and without Return Type
    //Calling Methods With Object
    void greet(){
        System.out.println("Hello ! Welcome");
    }

    //Method without Parameters but with Return Type
    //Calling Without Object
    static int getNumber(){
        return 100;
    }

    //Method with Parameters but without Return Type
    static void greeting(String name){
        System.out.println("Hello! " + name+ " Welcome to our coding World..");
    }

    //Method with Parameters and with Return Type
    static int sum(int a,int b){
        int ans=a+b;
        return ans;
    }

    //Single Variable arguments
    static void varArgs(int ...v){
        System.out.println(Arrays.toString(v));

    }

    //Multiple Variable Arguments
    static void VarArgs(int a,int b, int c,String ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Methods m=new Methods();
        m.greet();

        int num= getNumber();
        System.out.println("Number: "+num);

        System.out.println("Enter Name: ");
        String name=sc.next();
        greeting(name);

        System.out.println("Enter First Number:");
        int a=sc.nextInt();
        System.out.println("Enter Second Number:");
        int b=sc.nextInt();
        int result=sum(a,b);
        System.out.println("Sum = "+result);

        varArgs(20,10,66,54,32,98,30);

        VarArgs(10,20,30,"CSE","EEE","ME","ECE");
    }
}
