package org.example.sunderproblems;

import java.util.Scanner;

public class SimpleNumberToWords {

    // Arrays for storing number names
    private static final String[] ones = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    // Method to convert numbers below 1000 to words
    private static String convertToWords(int number) {
        if (number < 20) {
            return ones[number];
        } else if (number < 100) {
            return tens[number / 10] + (number % 10 != 0 ? " " + ones[number % 10] : "");
        } else {
            return ones[number / 100] + " hundred" + (number % 100 != 0 ? " and " + convertToWords(number % 100) : "");
        }
    }

    // Main method to handle thousands and hundreds
    public static String numberToWords(int number) {
        if (number == 0) return "zero";

        String result = "";

        if (number >= 1000) {
            result += convertToWords(number / 1000) + " thousand";
            number %= 1000;
        }

        if (number > 0) {
            result += (result.isEmpty() ? "" : " ") + convertToWords(number);
        }

        return result;
    }

    public static void main(String[] args) {
        // Input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Convert and display the result
        System.out.println("In words: " + numberToWords(number));
    }
}

