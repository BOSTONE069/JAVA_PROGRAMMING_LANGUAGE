package intro_to_java;

import java.util.Scanner;

public class WordEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String encryptedWord = encryptWord(word);
        
        System.out.println("Encrypted word: " + encryptedWord);

        scanner.close();
    }

    public static String encryptWord(String word) {
        char[] chars = word.toCharArray();
        StringBuilder encrypted = new StringBuilder();

        for (char c : chars) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char encryptedChar = (char) (base + (c - base + 1) % 26);
                encrypted.append(encryptedChar);
            } else {
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }
}

