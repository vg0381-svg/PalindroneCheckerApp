import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert string to char array
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Required Output Format
        System.out.println("input: \"" + input + "\"");
        System.out.println("is palindrome?: " + isPalindrome);

        sc.close();


    }

}
