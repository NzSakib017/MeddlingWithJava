//Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
//        Input: Civic
//        Output: true
//        Input: One
//        Output: false

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Word: ");
        String input = sc.next().toLowerCase();

        StringBuilder sb = new StringBuilder(input);
        String reverse = sb.reverse().toString();

        if (input.equals(reverse))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
