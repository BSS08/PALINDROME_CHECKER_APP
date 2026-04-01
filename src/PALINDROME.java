import java.util.*;

public class PALINDROME {

    static boolean reverseMethod(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }

    static boolean twoPointerMethod(String input) {
        int start = 0, end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    static boolean dequeMethod(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.add(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        long start, end;

        start = System.nanoTime();
        boolean r1 = reverseMethod(input);
        end = System.nanoTime();
        System.out.println("Reverse Method: " + r1 + " Time: " + (end - start));

        start = System.nanoTime();
        boolean r2 = twoPointerMethod(input);
        end = System.nanoTime();
        System.out.println("Two Pointer Method: " + r2 + " Time: " + (end - start));

        start = System.nanoTime();
        boolean r3 = stackMethod(input);
        end = System.nanoTime();
        System.out.println("Stack Method: " + r3 + " Time: " + (end - start));

        start = System.nanoTime();
        boolean r4 = dequeMethod(input);
        end = System.nanoTime();
        System.out.println("Deque Method: " + r4 + " Time: " + (end - start));
    }
}
