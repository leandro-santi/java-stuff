package com.solitudeworks.in;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some string stuff below:");

        String input = scanner.nextLine();
        int number = scanner.nextInt();

        System.out.println(input);
        System.out.println(number);

        scanner.close();

    }

}
