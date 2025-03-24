import java.util.Scanner;

class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleanedText.length() - 1;
        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The given text is a palindrome.");
        } else {
            System.out.println("The given text is not a palindrome.");
        }
    }
}

public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to check for palindrome: ");
        String inputText = scanner.nextLine();
        
        PalindromeChecker checker = new PalindromeChecker(inputText);
        checker.displayResult();
        
        scanner.close();
    }
}
