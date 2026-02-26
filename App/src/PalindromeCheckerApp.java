import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Required Output Format
        System.out.println("input: \"" + original + "\"");
        System.out.println("is palindrome?: " + isPalindrome);

        sc.close();



    }

}
