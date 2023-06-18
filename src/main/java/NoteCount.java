//Write a program that will breakdown the amount and count notes for any given amount. Here is the notes in the given array:
//        notes=[1000,500,200,100,50,20,10,5,2,1]

import java.util.Scanner;

public class NoteCount {

    private static Exception e;

    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] noteCount = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int fractionAmount;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter The Amount: ");
            int amount = sc.nextInt();

            System.out.println("Count of Notes: ");
            if (amount <= 0)
                throw e;
            else {
                for (int i = 0; amount != 0; i++) {
                    fractionAmount = amount / notes[i];
                    if (fractionAmount != 0) {
                        noteCount[i] = fractionAmount;
                        amount = amount % notes[i];
                    }

                    if (noteCount[i] != 0)
                        System.out.println(notes[i] + " " + noteCount[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Please Enter Value More Than 0 & No Fraction Number.");
        }
    }
}

