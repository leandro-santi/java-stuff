package com.solitudeworks.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInput {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter some string stuff below:");

        String input = reader.readLine();
        int number = Integer.parseInt(reader.readLine());

        System.out.println(input);
        System.out.println(number);

        reader.close();

    }

}
