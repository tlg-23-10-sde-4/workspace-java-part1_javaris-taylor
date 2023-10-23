package com.tic;

/*
 * class definition to model the workings of an alarm clock.
 * This is called a "business class" or "system class", as it contains
 * business things (attributes and methods)
 * This class definition does NOT have main() method - most do not.
 */
class AlarmClock {
    // Static or shared variables - only one copy of these, live in the class-wide common area
    // this means that variables exist outside each instance
    public static final int MIN_INTERVAL = 1; // class constants - public static or shared variable
    public static final int MAX_INTERVAL = 20;// class constants - or public static

    //properties or attributes - in Java, we called these "instance variables" or "fields"
    // business constraint: must be between 1 and 20 (inclusive)
    private int snoozeInterval = 5; // default value for client when it isn't specified

    // constructors - these are what are retrieves when the client uses the new keyword.
    public AlarmClock () {
        // no argument constructor, allows client to create the object and then assign parameters to empty objects.
    }
    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval); // delegate to setter for validation;
    }

    // functions or operations - in Java, we call these "methods"
    void snooze() {
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes");
    }

    // accessor methods - provide "controlled" access to the objects fields getter and setter
    // allows data validation like putting constraints
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // TODO: enorce the data constraint (if-else) -> must be between 1 and 20 (inclusive)
    public void setSnoozeInterval(int snoozeInterval) {
        if(snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
           this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Error: The snooze interval " + snoozeInterval +
                    " needs to be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + ".");
        }
    }

    public String toString() {
        return "com.tic.AlarmClock: snoozeInterval= " + getSnoozeInterval();
    }

}