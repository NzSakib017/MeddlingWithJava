//Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//        "I live in Bangladesh"
//        Output:
//        Number of words: 4
//        Number of chars without spaces: 17
//        Number of vowels: 7
//        Number of consonant: 10

import java.util.ArrayList;
import java.util.Arrays;

public class CountValuesFromString {
    public static void main(String[] args) {
        String input = "I live in Bangladesh";
        System.out.println("Sample Input: " + input);

        countWord(input);
        countCharWithoutSpace(input);
        countVowelsConsonants(input);
    }

    static void countWord(String input) {
        String[] str = input.split(" ");
        System.out.println("Number Of Words: " + str.length);
    }

    static void countCharWithoutSpace(String input) {
        String[] str = input.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++)
            sb.append(str[i]);

        System.out.println("Number Of Chars Without Space: " + sb.length());
    }

    static void countVowelsConsonants(String input) {
        String[] str = input.split(" ");
        int vowels = 0, consonants = 0;
        ArrayList<String> vowelsList = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u", "A", "E", "I", "O", "U"));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++)
            sb.append(str[i]);

        char[] ch = new char[sb.length()];
        sb.getChars(0, sb.length(), ch, 0);
        for (int j = 0; j < ch.length; j++) {
            if (vowelsList.contains(String.valueOf(ch[j])))
                vowels++;
            else
                consonants++;
        }

        System.out.println("Number of Vowels: " + vowels + "\n" + "Number of Consonants: " + consonants);
    }
}
