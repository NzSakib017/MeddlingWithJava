//Encrypt word: ROADTOSDET [when A=F]
//        Output: WTFIYTXIJY

import java.util.Scanner;

public class EncryptionString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        char[] input = sc.next().toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            input[i] = (char) (input[i] + 5);
            sb.append(input[i]);
        }
        System.out.println("Encrypted Value: " + sb);
    }
}
