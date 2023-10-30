package com.sound.client;

import com.sound.Amp;
import com.sound.AmpBrand;
import com.sound.AmpControl;

/**
 * JR: good basic test-drive of a few instances.
 * Create valid instances here, do the validation testing in ValidationTest class.
 *  a2.setVolume(120) -> error message
 */
class AmpClient {
    public static void main(String[] args) {
        // create com.sound.Amp object and assign its properties
        Amp a1 = new Amp();
        a1.setBrand(AmpBrand.BOSS);
        a1.setControl(AmpControl.INTERMEDIATE);
        a1.setGain(15);
        a1.setVolume(40);
        a1.setAux(true);
        a1.setAcoustic(false);

        // call methods on the instance of amp created.
        a1.turnOn();
        System.out.println(a1);
        a1.turnOff();

        // create a second guitar amp.
        Amp a2 = new Amp(AmpBrand.FENDER, AmpControl.PROFESSIONAL);
        a2.setGain(50);
        a2.setVolume(50);
        a2.setAux(true);
        a2.setAcoustic(true);

        // call methods on the second amp.
        a2.turnOn();
        a2.setVolume(120);
        System.out.println(a2);
        a2.turnOff();

        // create a third guitar amp
        Amp a3 = new Amp(AmpBrand.FENDER, AmpControl.INTERMEDIATE, 15);

        // call methods on the 3rd amp
        a3.turnOn();
        System.out.println(a3);
        a3.turnOff();

    }
}
