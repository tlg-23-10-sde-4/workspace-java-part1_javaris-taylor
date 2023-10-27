package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    /*
     * Option 1: Try-Catch-Finally and handle. The exception stops here.
     * We use finally to guarantee that stop gets called.
     */
    /*
    public void goToWork() {
        Car c1 = new Car("NINT3ND0", "Saleen", "S7");
        try {
            c1.start();
            c1.moveTo("Port Orchard");
        } catch (DestinationUnreachableException e) {
            System.out.println(e.getMessage());
        }
        finally {
            c1.stop();
        }
    }
     */
    /*
     * Option 2 : Ignore the exception.
     * Use a Try-Finally, to guarantee that stop() gets called.
     * We are not handling the exception.
     */
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c1 = new Car("NINT3ND0", "Saleen", "S7");
        try {

            c1.start();
            c1.moveTo("Port Orchard");

        } finally {
            c1.stop();
        }
    }
     */

    /*
     * Option 3: Try-catch the exception, "respond" in some way, then re-throw it.
     */
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c1 = new Car("NINT3ND0", "Saleen", "S7");
        try {
            c1.start();
            c1.moveTo("Port Orchard");
        } catch (DestinationUnreachableException e) {
            throw e;
        }
        finally {
            c1.stop();
        }
    }
     */
    /*
     * Option 4:
     */
    public void goToWork() throws WorkException {
        Car c1 = new Car("NINT3ND0", "Saleen", "S7");
        try {
            c1.start();
            c1.moveTo("Port Orchard");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work. ", e);
        }
        finally {
            c1.stop();
        }
    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}