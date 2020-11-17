package org.example.basics.arithmetic;

import java.util.Scanner;

public class Integers4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int L = scanner.nextInt();
        System.out.print((K / 2 + K % 2 + N / 2 + N % 2 + L / 2 + L % 2));
    }
}
