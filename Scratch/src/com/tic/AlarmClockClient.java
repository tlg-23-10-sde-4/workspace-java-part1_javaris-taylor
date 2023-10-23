package com.tic;

/*
 * The application main-class, i.e., the class definition with the main method.
 *
 * It's purpose is to create a few instances of Alarm Clock and give
 * them a basic test-drive.
 */
class AlarmClockClient {
    // the application "entry point" or starting point - the app starts from the "main" method.
    public static void main(String[] args) {
        //create an instance of com.tic.AlarmClock and set its properties
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        //create a second instance of com.tic.AlarmClock and set its properties
        AlarmClock clock2 = new AlarmClock(6);

        // create a third alarm clock object, but DONT set its properties - what will they be?
        AlarmClock clock3 = new AlarmClock(AlarmClock.MAX_INTERVAL); // as long as it can

        //call the methods
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        System.out.println();
        //show their to toString() methods
        //System.out.println(clock1.toString());

        // change the snoozeinterval on clock1

        clock1.setSnoozeInterval(10);

        // call the toString method again

        System.out.println(clock1.toString());
    }
}