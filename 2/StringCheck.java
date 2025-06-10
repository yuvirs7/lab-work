//write a program to check if a string starts or ends with a specific word using starts with or ends with method
import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("enter the word: ");
        String word = scanner.nextLine(); 
        boolean startsWith = inputString.startsWith(word);
        boolean endsWith = inputString.endsWith(word);
        System.out.println("if the string starts with " + word + "'? " + startsWith);
        System.out.println("if the string ends with " + word + "'? " + endsWith);
    }
}
