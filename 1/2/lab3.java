//the string is there "I AM PROUD VITIAN"
public class lab3 {
    public static void main(String[] args) {   
        String sentence = "I AM A PROUD VITIAN";

        System.out.println("original String: " + sentence);
        System.out.println("length: " + sentence.length());
        System.out.println("char at index 5: " + sentence.charAt(5));
        System.out.println("substring (7 to 12): " + sentence.substring(7, 12));
        System.out.println("to Upper Case: " + sentence.toUpperCase());
        System.out.println("to Lower Case: " + sentence.toLowerCase());
        System.out.println("contains 'VIT': " + sentence.contains("VIT"));
        System.out.println("starts with 'I AM': " + sentence.startsWith("I AM"));
        System.out.println("ends with 'VITIAN': " + sentence.endsWith("VITIAN"));
        System.out.println("equals 'I AM A PROUD VITIAN': " + sentence.equals("I AM A PROUD VITIAN"));
        System.out.println("equals Ignore Case: " + sentence.equalsIgnoreCase("i am a proud vitian"));
        System.out.println("replace 'PROUD' with 'HAPPY': " + sentence.replace("PROUD", "HAPPY"));
        System.out.println("If it is Empty: " + sentence.isEmpty());
        System.out.println("index of 'A': " + sentence.indexOf('A'));
        System.out.println("last index of 'A': " + sentence.lastIndexOf('A'));
        System.out.println("compare To 'I AM A VITIAN': " + sentence.compareTo("I AM A VITIAN"));

       //trimming the sentence
        String withSpaces = "   " + sentence;
        System.out.println("trimmed: '" + withSpaces.trim() + "'");

        //splitting the given in words
        String[] words = sentence.split(" ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        char[] chars = sentence.toCharArray();
        System.out.println("Character analysis:");
        for (char c : chars) {
            System.out.print(c + " -> ");
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    System.out.println("Uppercase Letter");
                } else {
                    System.out.println("Lowercase Letter");
                }
            } else if (Character.isDigit(c)) {
                System.out.println("Digit");
            } else if (Character.isWhitespace(c)) {
                System.out.println("Space");
            } else {
                System.out.println("Other Character");
            }
        }
        int[] vitianIds = {101, 102, 103};
        String[] clubs = {"GDSC", "CSI", "IEEE"};

        System.out.print("VITian ID Array: ");
        for (int id : vitianIds) {
            System.out.print(id + " ");
        }

        System.out.println("\nClubs:");
        for (String club : clubs) {
            System.out.println(club);
        }
    }
}
//lab3