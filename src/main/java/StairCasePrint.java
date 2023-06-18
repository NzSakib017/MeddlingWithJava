//Write a program that will give following output:
//        1
//        12
//        123
//        1234
//        12345

import java.util.Scanner;

public class StairCasePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stair Case Level: ");
        int level = sc.nextInt();

        System.out.println("Output: ");
        for (int i = 1; i <= level; i++){
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
