package com.ua.task2;

import java.util.Scanner;

/**
 * Given two strings of lowercase English letters,  and , perform the following operations:
 *
 * Sum the lengths of  and .
 * Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
 * Capitalize the first letter in  and  and print them on a single line, separated by a space.
 * Input Format
 *
 * The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.
 *
 * Output Format
 *
 * There are three lines of output:
 * For the first line, sum the lengths of  and .
 * For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
 * For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
 *
 * Sample Input 0
 *
 * hello
 * java
 * Sample Output 0
 *
 * 9
 * No
 * Hello Java
 * */

public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(sum(A, B));
        System.out.println(compareStrings(A, B));
        System.out.println(concatString(A, B));

    }
    public static int sum(String a, String b){
        int sum = a.length() + b.length();
        return sum;
    }

    public static String compareStrings(String a, String b){
        if(a.compareTo(b) > 0){
            return "Yes";
        } else {
            return "No";
        }
    }

    public static String concatString(String a, String b) {
        return a.substring(0,1).toUpperCase().concat(a.substring(1, a.length())) + " " +
                b.substring(0,1).toUpperCase().concat(b.substring(1, b.length()));
    }
}
