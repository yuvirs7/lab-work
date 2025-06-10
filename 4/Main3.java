//write a java program with a calculator class having multiple constructors
   // : one that takes no arguements and sets value to ()
   // : one that takes two arguements and performs addition immediately
   // : one that takes three arguements ,two integers and one string to perform the operation
class calculation{
    int a;
    int b;
    String s;
    public void add(int a,int b){
        int c = a +b;
        System.out.println(c);
    }
    
    calculation(){
        this.a= a;
        this.b=b;

    }
    calculation(int v,int n){
        this.a=v;
        this.b=n;
        add(v,n);
    }
    calculation(int x, int y, String z){
        this.a=x;
        this.b=y;
        this.s=z;

    
         
        switch(z){
            case"+":
            int c= x+y;
            System.out.println("add " + c);
            break;
          
            case "-":
            int n = x-y;
            System.out.println("sub " + n);
            break;

            case "x":
            int p = x*y;
            System.out.println("multiply " + p );
            break;
            case "/":
            if(y==0){
                System.out.println("null");
            }
            else{
                int l = x/y;
                System.out.println("division " + l);
            }
            break;

            case "end" :
                 System.out.println("done");
                 break;


        }

    


    }
}
public class Main3 {
    public static void main(String[] args) {
        
        calculation c1 = new calculation();
        calculation c2 = new calculation(5, 6);
        calculation c3 = new calculation(5,6,"+");
    }

}
