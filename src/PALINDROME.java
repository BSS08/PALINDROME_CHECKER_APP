import java.util.Scanner;

class PALINDROME {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        boolean palindrome = true;

        while (start < end) {
            if (arr[start] != arr[end]) {
                palindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (palindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}