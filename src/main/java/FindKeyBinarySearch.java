//Write a program that will find your key is found in the given array using binary search method
//        numbers=[1,6,9,3,5,4,7]
//        key=5

import java.util.Scanner;

public class FindKeyBinarySearch {

    public static void main(String[] args) {
        int[] numbers = {1, 6, 9, 3, 5, 4, 7};
        doSort(numbers);

        int keyIndex = indexCheck(numbers);
        if (keyIndex >= 0)
            System.out.println("Key Is Found & On Index Number: " + keyIndex);
        else
            System.out.println("Key Is Not Found");
    }

    static void doSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    static int indexCheck(int[] numbers) {
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        int foundIndex = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Key Value: ");
        int key = scanner.nextInt();

        while (leftPointer <= rightPointer) {
            int midIndex = (leftPointer + rightPointer) / 2;
            if (numbers[midIndex] == key) {
                foundIndex = midIndex;
                break;
            } else {
                if (key > numbers[midIndex])
                    leftPointer = midIndex + 1;
                else
                    rightPointer = midIndex - 1;
            }
        }

        return foundIndex;
    }
}
