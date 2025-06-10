import java.util.Scanner;

public class StringCharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TELL ME A word");
        String str = sc.nextLine();
        countCharacters(str);
    }

    public static void countCharacters(String str) {
        int vowels = 0, consonants = 0, digits = 0, spaces = 0, special = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            } else {
                special++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + special);
    }
}
