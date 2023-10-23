package com.tic;

/*
 * Client-side main-class test and debug
 *
 * BVT (Boundary Value Testing) - we test the boundaries and just outside them
 * i.e., 0,1 and 20, 21
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
    AlarmClock clock = new AlarmClock();

    clock.setSnoozeInterval(20);     // no error
        System.out.println(clock);  // print to test, you must print to see the result (error or not).
    clock.setSnoozeInterval(1);    // no error
        System.out.println("snoozeInterval= " + clock.getSnoozeInterval());  // print to test, this time do a different method
    clock.setSnoozeInterval(0);     // error planted
        System.out.println(clock.toString());
    clock.setSnoozeInterval(21);    // error planted
        System.out.println(clock);
    }

    /*
     * Note: When the setter throws the error for invalid input. There are
     */
}