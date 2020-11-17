package org.example.basics.scanning;

import java.util.Scanner;

public class Scanning8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int L = scanner.nextInt();
        System.out.print((K + L + N) / 2);
    }
}
