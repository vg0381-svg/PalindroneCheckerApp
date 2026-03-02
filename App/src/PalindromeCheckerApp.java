import java.util.Scanner;
class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeCheckerApp {

    // Convert String to Linked List
    public static Node createList(String str) {
        Node head = null, tail = null;

        for (char ch : str.toCharArray()) {
            Node newNode = new Node(ch);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Reverse Linked List
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Check Palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;

        // Step 1: Find middle using Fast & Slow
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node secondHalf = reverse(slow);

        // Step 3: Compare halves
        Node firstHalf = head;
        Node tempSecond = secondHalf;

        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data)
                return false;

            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        return true;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Node head = createList(input);

        if (isPalindrome(head))
            System.out.println("Is Palindrome?:True");
        else
            System.out.println("Is Palindrome?:False");

        scanner.close();
    }
}