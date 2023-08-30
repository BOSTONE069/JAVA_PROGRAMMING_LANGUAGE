import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Enter the string to check for palindrome: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reverseInput = "";

        // Reverse the input string
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseInput += input.charAt(i);
        }

        // Check if the input string is a palindrome
        if (input.equals(reverseInput)) {
            System.out.println("Input string is a palindrome.");
        } else {
            System.out.println("Input string is not a palindrome.");
        }

        scanner.close();
    }
}

