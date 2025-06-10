//write a program to split a sentence into words using split method on a new line


import java.util.Scanner;

public class SentenceSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
