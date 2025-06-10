//reverse a string using char at method
import java.util.Scanner;
public class reverse {
    public static void reverse(String str){
        
        char[] rev = new char[str.length()];
        for(int i = 0;i<str.length();i++){
            rev[i] = str.charAt(str.length()-1-i);
        }
        for(int i = 0;i<str.length();i++){
            System.out.print(rev[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String word = sc.nextLine();
        reverse(word);

        
    }

}
