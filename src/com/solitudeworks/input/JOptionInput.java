package com.solitudeworks.input;

import javax.swing.*;

public class JOptionInput {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter some string stuff below:");

        JOptionPane.showInputDialog(null, input);

    }

}
