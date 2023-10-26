package com.entertainment;

import java.util.Arrays;

/*
 * Business class to model the workings of a television
 *
 * no main() method
 */
public class Television {
    // static constant properties for volume
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Insignia"};

    // attributes or properties - "instance variables" or "fields" in Java
    private String brand; // string value for the name of the brand
    private int volume;   // int value for the level of the volume
    private DisplayType display = DisplayType.LCD;

    // muting behaviors
    public boolean isMuted;
    private int oldVolume;


    // constructors
    public Television() {
        //no arg ctor
        instanceCount++;
    }

    public Television(String brand) throws InvalidBrandException {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) throws InvalidBrandException, IllegalArgumentException {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) throws InvalidBrandException, IllegalArgumentException {
        this(brand, volume);
        setDisplay(display);
    }

    // functions or operations - "methods" in Java
    public void mute() {
        if (!isMuted()) { // not currently emitting sound
            oldVolume = getVolume();
            setVolume(MIN_VOLUME); //make it muted ( you can also use min_volume or 0)
            isMuted = true;
        } else {           // we are currently muted, so restore volume from oldVolume
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Your " + brand + " is now turning on, please wait!");
    }

    public void turnOff() {
        System.out.println("Your " + brand + " is turning off, I hope you enjoyed your program!");
    }

    void volumeQuery() {
        System.out.println("The volume level on your " + brand + " is currently: " + volume + ".");
    }

    // Accessor Methods the generated getters and setters
    public String getBrand() {
        return brand;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public void setBrand(String brand) throws InvalidBrandException {
        if (isValidBrand(brand)) { // delagation to the private method for validation
            this.brand = brand;
        } else {
            throw new InvalidBrandException(String.format("Invalid Brand: Please choose between %s", Arrays.toString(VALID_BRANDS)));
        }
    }

    private static boolean isValidBrand(String brand) {
        boolean valid = false;
        for (String currentBrand : VALID_BRANDS) {
            if (brand.equals(currentBrand)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public int getVolume() {
        return volume;
    }

    // Throw illegalargumentexception
    public void setVolume(int volume) throws IllegalArgumentException{
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false; // automatically unmuted

        } else {
            throw new IllegalArgumentException(String.format("The volume: %s MUST be between %s and %s.\n",
                    volume, MIN_VOLUME, MAX_VOLUME));
        }

    }

    public boolean isMuted() {
        return isMuted;
    }

    private boolean verifyInternetConnection() {
        return true; //the ollle fakeout
    }

    // toString() method for the diagnostics of the instanced object.
    public String toString() {
        /*
         * Ternary operation: Create a field named volume string and assign
         *  isMuted() [getter] ? [assign if true] "muted" : [otherwise assign] String.valueOf(getVolume());
         */

        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("brand= %s display= %s volume= %s ", getBrand(), getDisplay(), volumeString);
//        return "brand= " + getBrand() + ", display= " + getDisplay() + ", volume= " + volumeString;
    }
}
