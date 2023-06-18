//Find out the second largest element of the given array
//        numbers=[5,3,9,7,4,1,8]

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 7, 4, 1, 8};
        int FirstMax = numbers[0], SecondMax = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > FirstMax)
                FirstMax = numbers[i];
            for (int j = 0; j <= i; j++) {
                if ((numbers[j] > SecondMax) && FirstMax > numbers[j])
                    SecondMax = numbers[j];
            }
        }

        System.out.println("Second Largest Values: " + SecondMax);

        doSort(numbers);
        System.out.println("Second Largest Value Is: " + numbers[numbers.length - 2]);
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
}
