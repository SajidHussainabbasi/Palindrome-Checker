import java.util.Scanner;

public class PalindromeChecker {

    public void checkPalindrome() {
        Scanner scanner = new Scanner(System.in);
        String word;

        // Validate input (letters only)
        while (true) {
            System.out.print("Enter a word (letters only): ");
            word = scanner.nextLine();

            if (word.matches("[a-zA-Z]+")) {
                break; // valid input
            } else {
                System.out.println(" Invalid input! Please enter letters only (no numbers or symbols).");
            }
        }

        // Convert to lowercase for comparison
        String cleaned = word.toLowerCase();

        // Reverse string manually
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        // Check palindrome
        if (cleaned.equals(reversed)) {
            System.out.println(" \"" + word + "\" is a palindrome.");
            System.out.println("Good Bye , Made by Sajid Hussain");
        } else {
            System.out.println(" \"" + word + "\" is not a palindrome.");
            System.out.println("Good Bye , Made by Sajid Hussain");
        }
    }
}
