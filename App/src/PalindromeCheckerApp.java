import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = input.nextLine();
        String reverse = "";

        // 2. Logic to reverse the string
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        // 3. Boolean Check
        // .equalsIgnoreCase returns a boolean (true/false)
        boolean isPalindrome = original.equalsIgnoreCase(reverse);

        // 4. Output the specific requested format
        System.out.println("is it a palindrome?:" + isPalindrome);

        input.close();




    }

}
