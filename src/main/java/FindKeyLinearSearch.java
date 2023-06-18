//Write a program that will find your key is found in the given array using linear search method
//        numbers=[1,6,9,3,5,4,7]
//        key=5

import java.util.Scanner;

public class FindKeyLinearSearch {

    public static void main(String[] args) {
        int[] numbers = {1, 6, 9, 3, 5, 4, 7};

        int keyIndex = indexCheck(numbers);
        if (keyIndex >= 0)
            System.out.println("Key Is Found & On Index Number: " + keyIndex);
        else
            System.out.println("Key Is Not Found");
    }

    static int indexCheck(int[] numbers) {
        int index = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Key Value: ");
        int key = scanner.nextInt();

        for (int i = 0; i < numbers.length;) {
            if (key == numbers[i]) {
                index = i;
                break;
            } else
                i++;
        }
        return index;
    }
}
