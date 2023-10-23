package edu.math;

import static edu.math.Calculator.*;   // okay to use * for static imports


class CalculatorClient {
    public static void main(String[] args) {

        // pass ints to the add object of the calculator and store the value in a variable sum
        double sum = add(3.1 ,5.5);

        // using println to display the results of the methods in the calculator class
        System.out.println("The sum is " + sum);

        // below, its okay to pass ints where double
        System.out.println("The difference is " + sub(3, 5));

        System.out.println("Is 10 even? " + isEven(10));

        // test the double divide method
        System.out.println(Calculator.divide(5, 2));

        // calls the regular random method with no arguments
        int winner = Calculator.randomInt();
        // System.out.println("The winner is " + winner);

//         calls the overload random method with 2 arguments

        int min = 5;
        int max = 20;
        boolean itWorks = true;
        int result = 0;

        System.out.println("The Average is: " + average(3, 4, 5, 9, 15));

        //iterate 1_000_000 times and check the result

        for(int i = 0; i < 1_000_000; i++) {
            result = Calculator.randomInt(min, max);
            if(result < min || result > 20) {
                itWorks = false;
                break;
            }
        }
        if(itWorks) {
            System.out.println("Congratulations, it works! " + result);
        }
        else {
            System.out.println("You Gotta Bug!");
        }





    }
}