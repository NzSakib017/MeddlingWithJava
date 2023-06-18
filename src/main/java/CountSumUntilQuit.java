//Write a program that will take integer numbers as user input continuously and print the sum of numbers until user input q from the keyboard.
//When user input q, program will be quit. If user inputs another character, then the program will ask to input the number again.

import java.util.Scanner;

public class CountSumUntilQuit {
    public static void main(String[] args) {
        int sum = 0;
        char decision;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Input Number: ");
            sum += sc.nextInt();

            System.out.println("Sum Up-to Now: " + sum + "\nDo you want to continue?");
            decision = sc.next().charAt(0);
        } while (decision != 'q' && decision != 'Q');
    }
}
