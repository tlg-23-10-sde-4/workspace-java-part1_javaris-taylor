package com.sound.test;

import com.sound.Amp;

class AmpValidationTest {
    public static void main(String[] args) { // create an amp object to validate setter constraints
        Amp ampValidation = new Amp();
        // Check constraint enforcement and reset
        ampValidation.setVolume(101);
        ampValidation.setGain(101);
        ampValidation.setVolume(-1);
        ampValidation.setGain(-1);
        System.out.println(ampValidation);

        // Check lower and upper limit of constraint
        ampValidation.setVolume(100);
        ampValidation.setGain(100);
        System.out.println(ampValidation);
        ampValidation.setVolume(1);
        ampValidation.setGain(1);
        System.out.println(ampValidation);

    }
}