package org.example.basics.scanning;

import java.util.Scanner;

public class Scanning6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz liczbe");
        int liczbaCalkowita = scanner.nextInt();
        System.out.println("Uzytkonik wprowadzil liczbe " + liczbaCalkowita);
    }
}
