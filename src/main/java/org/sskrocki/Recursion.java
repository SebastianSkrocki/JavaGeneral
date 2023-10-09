package org.sskrocki;

public class Recursion {


    public static int sumNumbersFromN(int n) {
        if (n > 0) {
            return n + sumNumbersFromN(n - 1);
        }
        return 0;
    }

    public static int factorialRecursion(int n) {
        if (n > 0) {
            return n * factorialRecursion(n - 1);
        }
        return 1;
    }

    public static long fibonacciRecursion(int n) {
        if (n == 0) return 0;
        if (n > 2) {
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
        return 1;
    }

    public static String reverseStringRecursion(String word) {
        if (word.length() < 2) {
            return word;
        }
        return reverseStringRecursion(word.substring(1)) + word.charAt(0);
    }

    public static int countDownRecursion(int number) {
//        if(number == 0) System.out.println(number);
        if (number > 0) {
            System.out.print(number + " ");
            return countDownRecursion(number - 1);
        }
        return 0;
    }

    public static void reverseNumberRecursion(int number) {
        if (number < 10) {
            System.out.print(number);
        } else {
            System.out.print(number % 10);
            reverseNumberRecursion(number / 10);
        }
    }
}
