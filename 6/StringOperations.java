/*Question 2:
Write a Java code to perform the String operations:

Hide Last 4 Digits of a Phone Number

Hide Middle Part of an Email

Replace All Characters Except First and Last */
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Hide Last 4 Digits of a Phone Number
        System.out.print("Enter a 10-digit phone number: ");
        String phone = scanner.nextLine();
        if (phone.length() >= 4) {
            String maskedPhone = phone.substring(0, phone.length() - 4).replaceAll("\\d", "*")
                                 + phone.substring(phone.length() - 4);
            System.out.println("Masked Phone: " + maskedPhone);
        } else {
            System.out.println("Invalid phone number.");
        }

        // 2. Hide Middle Part of an Email
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();
        int at = email.indexOf('@');
        if (at > 1) {
            String hiddenEmail = email.charAt(0) + "*****" + email.substring(at - 1);
            System.out.println("Masked Email: " + hiddenEmail);
        } else {
            System.out.println("Invalid email address.");
        }

        // 3. Replace All Characters Except First and Last
        System.out.print("Enter a word to mask (except first and last char): ");
        String word = scanner.nextLine();
        if (word.length() <= 2) {
            System.out.println("Masked Word: " + word);
        } else {
            String maskedWord = word.charAt(0) + "*".repeat(word.length() - 2) + word.charAt(word.length() - 1);
            System.out.println("Masked Word: " + maskedWord);
        }

        scanner.close();
    }
}

