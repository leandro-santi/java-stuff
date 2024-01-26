package com.solitudeworks.weasel;

// this is a genetic algorithm entry sample

import java.util.Random;

public class Weasel {

    private static final String target = "METHINKS IT IS LIKE A WEASEL";
    private static final char[] possibilities = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ".toCharArray();
    private static final int reproduction = 100;
    private static final double mutation = 0.5;
    private static final int fit = target.length();

    private static String parent;
    static Random rand = new Random();

    private static int fitness(String trial) {

        int HasSameVal = 0;

        for (int i = 0; i < trial.length(); i++) {
            if (trial.charAt(i) == target.charAt(i)) HasSameVal++;
        }

        return HasSameVal;

    }

    private static String mutate(String parent, double rate) {

        String mutateVal = "";

        for (int i = 0; i < parent.length(); i++) {
            mutateVal += (rand.nextDouble() <= rate) ?
                    possibilities[rand.nextInt(possibilities.length)] :
                    parent.charAt(i);
        }

        return mutateVal;

    }

    public static void main(String[] args) {

        parent = mutate(target, 1);

        int iterator = 0;

        while (!target.equals(parent)) {
            double rate = mutation;
            iterator++;

            if (iterator % 100 == 0) {
                System.out.println(iterator + ": " + parent + ", fitness: " + fitness(parent) + ", rate: " + rate);
            }

            String bestSpawn = null;
            int bestFit = 0;

            for (int i = 0; i < reproduction; i++) {
                String spawn = mutate(parent, rate);
                int fitness = fitness(spawn);

                if (fitness > bestFit) {
                    bestSpawn = spawn;
                    bestFit = fitness;
                }
            }

            parent = bestFit > fitness(parent) ? bestSpawn : parent;
        }

        System.out.println(parent + ", " + iterator);

    }

}
