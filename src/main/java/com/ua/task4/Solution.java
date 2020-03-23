package com.ua.task4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = removeNonLetters(s);

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        String[] words = s.split("[^a-zA-Z]+");

        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static String removeNonLetters(String str) {
        int s = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                s = i;
                break;
            }
        }
        return str.substring(s);
    }
}
