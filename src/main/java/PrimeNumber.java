//Print the prime numbers of 2 to 100

public class PrimeNumber {
    public static void main(String[] args) {
        int minRange = 2, maxRange = 100, count = 0;
        boolean prime;
        String primeNumbers;
        StringBuilder sb = new StringBuilder();

        for (int i = minRange; i <= maxRange; i++) {
            prime = true;
            for (int j = 2; j <= (i / 2); j++) {
                if ((i % j) == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                sb.append(i + " ");
                count++;
            }
        }
        System.out.println("There Are Total " + count + " Prime Numbers, Which Are: " + sb);
    }
}
