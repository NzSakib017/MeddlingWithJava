//Write a program that will shuffle (values will randomly change their position) from the given array
//
//        numbers=[1,2,3,4,5,6,7,8,9,0]
//
//        random output: 3 5 0 1 7 9 6 4 2 8

import java.util.Arrays;

public class ShuffleArrayValue {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int random = 0, j = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            int max = numbers.length - 1, min = i + 1;
            while (i < numbers.length) {
                random = (int) (Math.random() * ((max - min) + min));
                if (random > i && random < numbers.length)
                    break;
                if (max == min)
                    break;
            }
            int temp = numbers[i];
            numbers[i] = numbers[random];
            numbers[random] = temp;
            j = i;
        }
        random = (int) (Math.random() * ((numbers.length - 1) - 0) + 0);
        int temp = numbers[j + 1];
        numbers[j + 1] = numbers[random];
        numbers[random] = temp;

        System.out.println("Random Output: " + Arrays.toString(numbers));
    }
}
