import java.util.Arrays;

import java.util.Collections;

import java.util.List;

import java.util.Scanner;

 

public class Main {

 

    public static void main(String[] args) {

        // A. Create an array with values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        List<Integer> list = Arrays.asList(array);

        Collections.shuffle(list);

        System.out.println("Shuffled array: " + Arrays.toString(list.toArray()));

 

        // B. Enter a Roman Number as input and convert it to an integer. (ex IX = 9)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman Number: ");

        String romanNumeral = scanner.nextLine().toUpperCase();

        int integerValue = romanToInteger(romanNumeral);

        System.out.println("Integer value: " + integerValue);

 

        // C. Check if the input is a pangram or not.

        System.out.print("Enter a sentence to check if it's a pangram: ");

        String sentence = scanner.nextLine().toLowerCase();

        boolean isPangram = isPangram(sentence);

        System.out.println("Is a Pangram: " + isPangram);

    }

 

    private static int romanToInteger(String s) {

        // Implementation of Roman to Integer conversion

        // (You may need to add more cases for other Roman numerals)

        // For simplicity, this example covers only 'I', 'V', 'X', 'L', 'C', 'D', 'M'

        int result = 0;

        int[] values = {1, 5, 10, 50, 100, 500, 1000};

        String symbols = "IVXLCDM";

 

        for (int i = s.length() - 1; i >= 0; i--) {

            char currentSymbol = s.charAt(i);

            int currentIndex = symbols.indexOf(currentSymbol);

            result += values[currentIndex];

            if (i > 0) {

                char prevSymbol = s.charAt(i - 1);

                int prevIndex = symbols.indexOf(prevSymbol);

                if (prevIndex < currentIndex) {

                    result -= values[prevIndex];

                    i--; // Move one position back to skip the previous symbol

                }

            }

        }

 

        return result;

    }

 

    private static boolean isPangram(String s) {

        // Check if the input sentence is a pangram

        boolean[] alphabet = new boolean[26];

        for (char c : s.toCharArray()) {

            if (Character.isLetter(c)) {

                alphabet[c - 'a'] = true;

            }

        }

 

        for (boolean value : alphabet) {

            if (!value) {

                return false; // If any letter is missing, it's not a pangram

            }

        }

 

        return true; // All letters are present

    }

}