package edu.math;

import java.util.Random;
/*
 * All-static class, i.e., a class with all static methods...
 *
 * When there is an all static function there is no reason to create the object instance.
 * Instead invoke the method from class
 */
class Calculator {

    private Calculator() {

    }
    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static  double divide(double a, double b) {
        return a / b;
    }

    public static boolean isEven(int value) {
         return value % 2 == 0;
    }

    /*
     * Returns a random integer between 1 and 19 (inclusive).
     *
     * Hint: See a class called Math (package java.lang), look for help here.
     * Note: the methods in teh Math class are all "static", which means you call them as:
     * Math.methodName();
     *
     * randomInt();
     */

    public static int randomInt() {
        /*
         int result = 0;
         double rand = Math.random();        // 0.0000 to 0.99999
        */
        // delegate to the min-max version, passing 1 for the min, and 19 for the max
        return randomInt(1,19);
    }
    /*
     * Return a random integer between 'min' and 'max' (inclusive)
     *
     * CHALLENGE: implement this.
     */

    public static int randomInt(int min, int max){

        double clientScaled = (Math.random() * (max - min + 1)); //
        double raised = clientScaled + min;
        return (int) raised;
    }

    public static double average(int first, int... rest) { // inside here it is actually an array

        double sum = first;
        for(int value : rest) {
            sum = sum + value;
        }
       return  sum / (rest.length + 1);

    }

}