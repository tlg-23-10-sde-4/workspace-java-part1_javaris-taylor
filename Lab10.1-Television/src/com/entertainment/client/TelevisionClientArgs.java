package com.entertainment.client;/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java com.entertainment.client.TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java com.entertainment.client.TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of com.entertainment.Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            printUsage();
            return;  // early return from main(), application exits
        }

        // 1: Convert string to proper types

        String brand = null;
        int volume = 0;
        DisplayType display = null;
        try {
            brand = args[0];
            volume = Integer.parseInt(args[1]);
            display = DisplayType.valueOf(args[2].toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("There is a problem with your inputs." );
            System.out.printf("You entered: %s %s %s\n\n", args[0], args[1], args[2]);
            printUsage();
            return;
        }

        try {
            // 2: create a Television object from 3 arguments
            Television tvArgtest = new Television(brand, volume, display);

            // 3: Congradulate them on their order and show them their television
            System.out.println("Congrats! Here's your new TV.");
            System.out.println(tvArgtest);
        } catch (Exception e) {
            System.out.println(e.getMessage()); // extracts throwers reason string.
            printUsage();
        }


    }

    private static void printUsage() {
        String usage = "Usage: java com.entertainment.client.TelevisionClientArgs <brand> <volume> <display>";
        String example = "Example: java com.entertainment.client.TelevisionClientArgs Samsung 32 PLASMA";
        String note1 = String.format("The brand %s is not supported please choose: ", Arrays.toString(Television.VALID_BRANDS));
        String note2 = String.format("Volume must be %s - %s.", Television.MIN_VOLUME, Television.MAX_VOLUME);
        String note3 = "Note: supported displays are " + Arrays.toString(DisplayType.values()).substring(1, Arrays.toString(DisplayType.values()).length() -1);
        System.out.println(usage);
        System.out.println(example);
        System.out.println(note1);
        System.out.println(note2);
        System.out.println(note3);
    }
}