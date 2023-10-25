/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 5500.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 53.0, 30.0));
        dept.addEmployee(new SalariedEmployee("Javaris", LocalDate.of(2002, 3, 27), 6000.0));
        dept.addEmployee(new HourlyEmployee("Breanna", LocalDate.of(2003, 3, 27), 55.2, 30.0));
        dept.addEmployee(new Executive("Aaron", LocalDate.of(1990, 10, 10), 100000));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay employees for their work.
        System.out.println("\nPay all employees:");
        dept.payEmployees();

        // holiday break
        System.out.println("\nForced holiday break");
        dept.holidayBreak();

    }
}