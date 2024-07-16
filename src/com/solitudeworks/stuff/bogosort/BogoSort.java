package com.solitudeworks.stuff.bogosort;

import java.util.Random;
import java.util.Scanner;

public class BogoSort {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    private static void swap(int[] array, int a, int b) {
        var temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    private static boolean isSorted(int[] array, int size) {
        for (int i = 0; i < size - 1; i++) {
            if (array[i] > array[i + 1]) return false;
        }

        return true;
    }

    private static void sortArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            swap(array, i, random.nextInt(size));
        }
    }

    private static void bogoSort(int[] array, int size) {
        int i = 0;

        while (!isSorted(array, size)) {
            System.out.println("Iteration: " + i++);
            sortArray(array, size);
        }
    }

    private static void addNumbersOnArray(int[] array, int size) {

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
    }

    public static void main(String[] args) {

        System.out.println("\nThis is BogoSort! \nA sorting algorithm based on generate and test paradigm");

        System.out.println("\nEnter with 10 numbers:");

        int[] array = new int[10];

        addNumbersOnArray(array, 10);

        bogoSort(array, 10);

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n");

    }

}
