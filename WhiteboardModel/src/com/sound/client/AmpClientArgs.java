package com.sound.client;

import com.sound.Amp;
import com.sound.AmpBrand;
import com.sound.AmpControl;

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