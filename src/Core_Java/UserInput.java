package Core_Java;

import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Primitive DataType
        //Integer User Input
        System.out.println("Enter Integer value:");
        int x=sc.nextInt();
        System.out.println("Integer:"+x);

        //Float User Input
        System.out.println("Enter Float Value:");
        float f=sc.nextFloat();
        System.out.println("Float:"+f);

        //Double User Input
        System.out.println("Enter Double Value");
        double d=sc.nextDouble();
        System.out.println("Double:"+d);

        //Long User Input
        System.out.println("Enter Long Value");
        long l=sc.nextLong();
        System.out.println("Long:"+l);

        //String User Input(up to space)
        System.out.println("Enter String Value:");
        String s=sc.next();
        System.out.println("String:"+s);

        //String User Input (Full line)
        String st=sc.nextLine();
        System.out.println("String:"+st);

        //Boolean User Input
        System.out.println("Enter Boolean Value");
        boolean b=sc.nextBoolean();
        System.out.println("Boolean:"+b);

        //Array User Input
        System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        System.out.println("Enter Elements:");
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array:"+Arrays.toString(arr));

    }
}
