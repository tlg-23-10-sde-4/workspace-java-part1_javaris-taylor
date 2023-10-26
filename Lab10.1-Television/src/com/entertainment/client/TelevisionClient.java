package com.entertainment.client;/*
 * This is the application main class, i.e. the class definition with the main method
 * The main method is the starting point for the application.
 *
 * Purpose: create a few instances of com.entertainment.Television and give them a test-drive.
 */

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;
import static com.entertainment.DisplayType.*;

class TelevisionClient {
    // at run time the application starts here.
    public static void main(String[] args) throws InvalidBrandException {
        // create an instance of com.entertainment.Television and set properties
        System.out.println(Television.getInstanceCount() + " instances of Television.");
        Television tv1 = new Television("Linu", 20);
        tv1.setDisplay(CRT);
        System.out.println("You have created a " + tv1.getBrand() + ". You have "
                + Television.getInstanceCount() + " instances active.");

        // create another instance of com.entertainment.Television and set different properties
        Television tv2 = new Television("Sony", 80);
        System.out.println("You have created a " + tv2.getBrand() + ". You have "
                + Television.getInstanceCount() + " instances active.");
        tv2.setBrand("Sony");
        tv2.setDisplay(OLED);
        tv2.setVolume(Television.MIN_VOLUME);

        // recreate the third instance of com.entertainment.Television set the properties
        Television tv3 = new Television();
        tv3.setBrand("Insignia");
        System.out.println("You have created a " + tv3.getBrand() + ". You have "
                + Television.getInstanceCount() + " instances active.");
        tv3.setDisplay(PLASMA);
        tv3.setVolume(Television.MAX_VOLUME);

        // try new constructor with 1 arg
        Television tv4 = new Television("LG");
        System.out.println("You have created a " + tv4.getBrand() + ". You have "
                + Television.getInstanceCount() + " instances active.");

        // three argument ctor with 3 arg test
        Television tv5 = new Television("Sony", 40, LED);
        System.out.println("You have created a " + tv5.getBrand() + ". You have "
                + Television.getInstanceCount() + " instances active.");


        // call the turn on and off method and populate with the referenced variable.
        tv1.turnOn();
        //tv1.volumeQuery();
        System.out.println(tv1);
        tv1.turnOff();


        tv2.turnOn();
        //tv2.volumeQuery();
        System.out.println(tv2);
        tv2.turnOff();

        tv3.turnOn();
        //tv3.volumeQuery();
        System.out.println(tv3);
        tv3.turnOff();

        tv4.turnOn();
        System.out.println(tv4);
        tv4.turnOff();

        tv5.turnOn();
        System.out.println(tv5);
        tv5.turnOff();


    }
}