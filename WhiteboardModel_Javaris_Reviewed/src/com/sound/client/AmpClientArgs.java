package com.sound.client;

import com.sound.Amp;
import com.sound.AmpBrand;
import com.sound.AmpControl;

/**
 * JR: Good job overall, works as expected and easy for user to figure out how to run it.
 *
 * For 'brandInput' and 'controlInput' messages, use the static values() method
 * available in every enum type, e.g., Arrays.toString(AmpBrand.values()),
 * instead of hardcoding them here.  That way, if you add more, no changes needed here.
 *
 * You could have also supported a few more input arguments, e.g., volume and gain,
 * but what you have here is good, and works correctly.
 *
 * Given the 'howTo' message, the text of 'controlInput' would be better as
 * "Valid controls:" instead of "Valid inputs:"
 */
class AmpClientArgs {
    public static void main(String[] args) {
        if (args.length < 2) { // allow to args and provide examples
            String howTo = "HOWTO: java AmpClientArgs <brand> <control>";
            String example = "Example: java AmpClientArgs Fender Professional";
            String brandInput = String.format("Valid brands: %s %s", AmpBrand.FENDER, AmpBrand.BOSS);
            String controlInput = String.format("Valid inputs: %s %s %s", AmpControl.AMATEUR, AmpControl.INTERMEDIATE, AmpControl.PROFESSIONAL);
            System.out.println(howTo);
            System.out.println(example);
            System.out.println(brandInput);
            System.out.println(controlInput);
            return;
        }

        AmpBrand brand = AmpBrand.valueOf(args[0].toUpperCase());
        AmpControl control = AmpControl.valueOf(args[1].toUpperCase());

        Amp argAmpTest = new Amp(brand, control);
        System.out.println(argAmpTest);
    }
}