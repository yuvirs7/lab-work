//writye a program to find the first and last occurence of a character using indexof and last index of method
import java.util.*;
public class occurence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        String car = sc.nextLine();
        System.out.println("enter the word");
        String word = sc.nextLine();
        System.out.println("the first occurence is " + word.indexOf(car));
        System.out.println("the last index of occurence of string is" + word.lastIndexOf(car));


    }

}
