package org.example.basics.arithmetic;

import java.util.Scanner;

public class Integers6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        char[] chars = in.toCharArray();
        char tensDigit = chars[chars.length - 2];
        System.out.println(tensDigit);
    }
}
