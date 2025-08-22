package Core_Java;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operations
        System.out.println("Arithmetic_Operations");
        int a=10;
        int b=6;
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtract: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Modulus: "+(a%b));
        System.out.println();

        //Assignment Operators
        System.out.println("Assignment_Operators");
        int x=12;
        System.out.println(x);
        System.out.println(x+=3);
        System.out.println(x-=4);
        System.out.println(x*=2);
        System.out.println(x/=3);
        System.out.println(x%=5);
        System.out.println();

        //Comparison Operators
        System.out.println("Comparison_Operators");
        int p=14;
        int q=18;
        System.out.println(p==q);
        System.out.println(p!=q);
        System.out.println(p<q);
        System.out.println(p>q);
        System.out.println(p<=q);
        System.out.println(p>=q);
        System.out.println();

        //Logical Operators
        System.out.println("Logical_Operators");
        int y=15;
        int z=23;
        System.out.println(y>5 && z<12);
        System.out.println(y>0 || z<10);
        System.out.println(!(y>z));
        System.out.println();

        //Bitwise Operators
        System.out.println("Bitwise_Operators");
        int m=6;
        int n=4;
        System.out.println(m&n);
        System.out.println(m|n);
        System.out.println(m^n);
        System.out.println(~m);
        System.out.println(m>>2);
        System.out.println(n<<3);
        System.out.println();

        //Unary Operators
        System.out.println("Unary_Operators");
        int l=26;
        System.out.println(+l);
        System.out.println(-l);
        System.out.println(++l);
        System.out.println(--l);
        System.out.println();

        //Ternary Operators
        System.out.println("Ternary_Operators");
        int age=20;
        String result=(age>18) ?"Eligible":"Not Eligible";
        System.out.println(result);
    }
}

