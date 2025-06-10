//write a program to compare two cases, use equals ignore cases methods
import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        boolean isEqual = str1.equalsIgnoreCase(str2);
        System.out.println("the two string are equal " + isEqual);

        
    }
}

