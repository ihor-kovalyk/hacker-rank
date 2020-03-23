package com.ua.task3;

import java.util.Scanner;
/**
 * We define the following terms:
 *
 * Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
 * For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
 *
 * A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
 * Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
 *
 * Input Format
 *
 * The first line contains a string denoting .
 * The second line contains an integer denoting .
 *
 * Constraints
 *
 *  consists of English alphabetic letters only (i.e., [a-zA-Z]).
 * Output Format
 *
 * Return the respective lexicographically smallest and largest substrings as a single newline-separated string.
 *
 * Sample Input 0
 *
 * welcometojava
 * 3
 * Sample Output 0
 *
 * ava
 * wel
 * */

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String curr = s.substring(0, k);
        smallest = curr;
        largest = curr;
        for (int i = 1; i < s.length() - k + 1; ++i) {
            curr = s.substring(i, i + k);
            if (smallest.compareTo(curr) > 0) {
                smallest = curr;
            }
            if (largest.compareTo(curr) < 0) {
                largest = curr;
            }
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        System.out.println(getSmallestAndLargest(s, k));
        scan.close();

    }
}

