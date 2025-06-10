//write a java program to create a calculator class with overloaded methods named calculate() that perform 1)addition 2)subtraction 3)multiplication 4)division
import java.util.*;
class Calculator{
    public void calculate(int a,int b){
        int c = a+b;
        
        System.out.println("the additon of a and b is " + c);
    }
    public void calculate(float a,float b){
        float c = a * b;
        System.out.println("multiplication of a and b is "+ c);
    }
    public void calculate(double a , double b){
        double c = a-b;
        System.out.println("the subtraction of a and b is " + c);

    }
    public void calculate(long a , long b){
        if(b == 0){
            System.out.println("null");
        }
        else{
            long c = a/b;
            System.out.println("the division of and b is " + c);
        }
    }
}
public class main2{
    public static void main(String[] args){
        Calculator cal = new Calculator();
        System.out.println("enter numbers for operation a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b  = sc.nextFloat();
        double c = sc.nextDouble();
        long d = sc.nextLong();
        System.out.println("enter the value for second operand");
        int e = sc.nextInt();
        float f = sc.nextFloat();
        double g = sc.nextDouble();
        long h = sc.nextLong();
        cal.calculate(a, e);
        cal.calculate(d,h);
        cal.calculate(b, f);
        cal.calculate(c, g);


    }
}