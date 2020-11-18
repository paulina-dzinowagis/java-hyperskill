package org.example.basics.arithmetic;

import java.util.Scanner;

public class Integers6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        char[] chars = in.toCharArray();
        int charsLength = chars.length;
        if (charsLength >= 2) {
            char tensDigit = chars[chars.length - 2];
            System.out.println(tensDigit);
        } else {
            System.out.println(0);
        }
    }
}
