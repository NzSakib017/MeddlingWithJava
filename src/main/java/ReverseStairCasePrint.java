//Write a program that will give following output:
//        12345
//        2345
//        345
//        45
//        5

import java.util.Scanner;

public class ReverseStairCasePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stair Case Level: ");
        int level = sc.nextInt();

        System.out.println("Reversed Output: ");
        for (int i = 1; i <= level; i++) {
            for (int j = i; j <= level; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
