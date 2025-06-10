//write a program to implement single inheritance where the parents class defines a method calculate() and the child class overrides it to perform a specific arithematic operation
class Calculator{
    public void display(int a,int b){
        System.out.println(a+ "and" + b );
    }
}
class addition extends Calculator{
    public int add(int a,int b){
        int c = a+b;
        return c;
    }
    @Override
    public void display(int a,int b){
        System.out.println("addition of " +a +"and" + b + "is"+ add(a,b));
    }
}
public class Main1{
    public static void main(String[] args){
        addition a = new addition();
        a.display(5,6);
    }

    
}