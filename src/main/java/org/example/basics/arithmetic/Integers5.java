package org.example.basics.arithmetic;

import java.util.Scanner;

public class Integers5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        char[] chars = in.toCharArray();
        char first = chars[0];
        char second = chars[1];
        char third = chars[2];
        String reversedIn = String.valueOf(third) + String.valueOf(second) + String.valueOf(first);
        int result = Integer.parseInt(reversedIn);
        System.out.println(result);
    }
}
