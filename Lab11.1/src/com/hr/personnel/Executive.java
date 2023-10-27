package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {

    public Executive() {
        //default -- always called super constructor
        super();
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    public void fileReturn() {
        System.out.println("Return filed electronically");
    }

    // make the override for work
    @Override
    public void work() {
        System.out.println(getName() + " enjoying a nice round of gold since " + getHireDate());
    }
}