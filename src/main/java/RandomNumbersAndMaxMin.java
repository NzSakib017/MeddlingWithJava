//Generate random 10 integer numbers in an array and print out all the numbers from array and also print the max and min number from the array

import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumbersAndMaxMin {
    public static void main(String[] args) {
        int maxRange, minRange;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Minimum Range For Random Integer: ");
        minRange = sc.nextInt();
        int max = minRange;

        System.out.println("Enter Maximum Range For Random Integer: ");
        maxRange = sc.nextInt();
        int min = maxRange;

        System.out.println("The 10 Random Integers Are: ");

        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * ((maxRange - minRange) + minRange)));
            if (numbers.get(i) > max)
                max = numbers.get(i);
            if (numbers.get(i) < min)
                min = numbers.get(i);

            System.out.println(numbers.get(i));
        }

        System.out.println("The Maximum Number is: " + max + " & The Minimum Number is: " + min);
    }
}
