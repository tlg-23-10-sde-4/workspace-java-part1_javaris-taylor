package com.sound;

/*
 * Javaris Taylor
 * Personal Challenge:
 * TODO: I have never been a thorough commenter, it was because I didn't understand why things were happening.
 *  My goal for this whiteboard is to comment and express understanding, while developing habits that can
 *  help me contribute to the software development community.
 */
public class Amp {
    // static fields created first - "shared" variable across the class
    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;
    private static final int MIN_GAIN = 0;
    private static final int MAX_GAIN = 100;

    // regular fields - "variables"
    private AmpBrand brand = AmpBrand.BOSS;
    private AmpControl control = AmpControl.AMATEUR;
    private Integer volume = 0;
    private Integer gain = 10;
    private boolean hasAux;
    private boolean isAcoustic;

    // no arg ctor
    public Amp() {

    }

    // 1 arg ctor
    public Amp(AmpBrand brand) {
        this();
        setBrand(brand);
    }

    // 2 arg ctor
    public Amp(AmpBrand brand, AmpControl control) {
        this(brand);
        setControl(control);
    }

    // 3 arg ctor
    public Amp(AmpBrand brand, AmpControl control, Integer volume) {
        this(brand, control);
        setVolume(volume);
    }

    // again
    public Amp(AmpBrand brand, AmpControl control, Integer volume, Integer gain) {
        this(brand, control, volume);
        setGain(gain);
    }

    // ...
    public Amp(AmpBrand brand, AmpControl control, Integer volume, Integer gain, boolean hasAux) {
        this(brand, control, volume, gain);
        setAux(hasAux);
    }

    // you get it by now right? 6 arg ctor
    public Amp(AmpBrand brand, AmpControl control, Integer volume, Integer gain, boolean hasAux, boolean isAcoustic) {
        this(brand, control, volume, gain, hasAux);
        setAcoustic(isAcoustic);
    }

    public void turnOn() { // a sout of convenience, to show the method is in proper working order.
        System.out.println("Powering on your " + getBrand() + " amp.");
    }

    public void turnOff() { // a sout of convenience, to show the method is in proper working order.
        System.out.println("Powering down your " + getBrand() + " amp.\n");
    }

    public AmpBrand getBrand() { // use a getter to return the brand
        return brand;
    }

    public void setBrand(AmpBrand brand) { // use .equals() to validate the brand before setting. *NOTE DO NOT USE ==*
        this.brand = brand;
    }

    public AmpControl getControl() {     // standard getter :D
        return control;
    }

    public void setControl(AmpControl control) { // use a setter in order validate the input before assigning to field
        this.control = control;
    }

    public Integer getVolume() { // the ole getter
        return volume;
    }

    public void setVolume(int volume) {                     // <-- validate volume before setting the value.
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {    // use if statement to restrict the volume input.
            this.volume = 0;
            System.out.printf("Invalid Volume: %s. Proper Range: %s - %s\n", volume, MIN_VOLUME, MAX_VOLUME);
        }

        else { // if the volume variable "field" reaches this point the program is safe to set the value.
            this.volume = volume;
        }
    }

    public Integer getGain() { // standard getter
        return gain;
    }

    public void setGain(int gain) { // validate the input for gain and set the value after checking range
        if (gain < MIN_GAIN || gain > MAX_GAIN) {
            this.gain = 0;
            System.out.printf("Invalid Gain: %s. Proper Range: %s - %s\n", gain, MIN_GAIN, MAX_GAIN);
        }

        else {
            this.gain = gain;
        }

    }

    public boolean hasAux() { // standard getter nothing to see here
        return hasAux;
    }

    public void setAux(boolean hasAux) { // standard boolean setter: booleans cannot pass unless true or false so no need to validate
        this.hasAux = hasAux;
    }

    public boolean isAcoustic() { // standard getter STILL nothing to see here.
        return isAcoustic;
    }

    public void setAcoustic(boolean acoustic) { // set the boolean for the type of guitar.
        isAcoustic = acoustic;
    }

    public String toString() { // The messy... standard straight to the point form Jay enjoys
        return "brand=" + getBrand() + " control=" + getControl() + " volume=" + getVolume()
                + " gain=" + getGain() + " hasAux=" + hasAux() + " isAcoustic=" + isAcoustic();
    }
}
