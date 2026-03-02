import java.util.Scanner;

class PalindromeChecker {


    public boolean checkPalindrome(String input) {

        if (input == null || input.isEmpty())
            return false;

        // Normalize string (ignore case and spaces)
        String str = input.toLowerCase().replaceAll("\\s+", "");

        return isPalindrome(str, 0, str.length() - 1);
    }

    private boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end)
            return true;

        // If characters don't match
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = checker.checkPalindrome(input);

        if (result)
            System.out.println("Is Palindrome?:True");
        else
            System.out.println("Is Palindrome?:False");

        sc.close();
    }
}