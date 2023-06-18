//Take any number as input and print the reverse of the number
//        input: 12345
//        output: 54321

import java.util.Scanner;

public class ReverseInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        String input = sc.next();

        StringBuilder sb = new StringBuilder(input);
        sb.reverse();

        System.out.println("Reversed Output: " + sb);

    }
}
