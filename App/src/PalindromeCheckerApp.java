import java.util.*;

public class PalindromeCheckerApp {

    //Recursive Approach
    public static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursivePalindrome(str, start + 1, end - 1);
    }

    // Stack Approach
    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        for (char c : str.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }

    // Deque Approach
    public static boolean dequePalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray())
            deque.addLast(c);

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast()))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize once
        String str = input.toLowerCase().replaceAll("\\s+", "");

        // Recursive Timing
        long startTime = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(str, 0, str.length() - 1);
        long endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        // Stack Timing
        startTime = System.nanoTime();
        boolean stackResult = stackPalindrome(str);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Deque Timing
        startTime = System.nanoTime();
        boolean dequeResult = dequePalindrome(str);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        // Display Results
        System.out.println("\n--- Results ---");
        System.out.println("Recursive Result: " + recursiveResult +
                " | Time: " + recursiveTime + " ns");

        System.out.println("Stack Result:     " + stackResult +
                " | Time: " + stackTime + " ns");

        System.out.println("Deque Result:     " + dequeResult +
                " | Time: " + dequeTime + " ns");

        sc.close();
    }
}