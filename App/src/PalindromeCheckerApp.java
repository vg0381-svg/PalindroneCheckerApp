import java.util.Scanner;
public class PalindromeCheckerApp {
    public static boolean isPalindrome(String str, int start, int end) {

        // Base Condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call
        return isPalindrome(str, start + 1, end - 1);
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isPalindrome(str, 0, str.length() - 1))
            System.out.println("Is Palindrome?:True");
        else
            System.out.println("Is Palindrome?:False");

        sc.close();
    }
}