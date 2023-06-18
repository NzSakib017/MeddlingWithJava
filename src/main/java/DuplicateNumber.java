//Find out the duplicate numbers in the given array and in which position they are found.
//        numbers=[1,2,3,1,2,4,5,6,4]
//
//        Output:
//        Duplicate value: 1 at index 3
//        Duplicate value: 2 at index 4
//        Duplicate value: 4 at index 8

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 2, 4, 5, 6, 4};

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    sb.append(j + " ");
                }
            }
            if (count != 0) {
                int sameValue = 0;
                for (int k = 0; k < i; k++) {
                    if (numbers[k] == numbers[i])
                        sameValue = 1;
                }
                if (sameValue == 0)
                    System.out.println("Duplicate Value " + numbers[i] + " at Index: " + sb);
            }
        }
    }
}
