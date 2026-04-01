import java.util.Scanner;

class PalindromeService {
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class PALINDROME
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        PalindromeService checker = new PalindromeService();

        if (checker.checkPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
