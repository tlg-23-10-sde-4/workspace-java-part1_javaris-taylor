package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;
import com.hr.WorkException;

public class EmployeeClient {

    public static void main(String[] args) {
        // TODO: create an instance of Employee
        Employee emp = new Employee("Lucius");

        // TODO: call goToWork() on the Employee object

        try {
            emp.goToWork();
        } catch (WorkException e) {
            System.out.println(e.getMessage()); // Just the reason string.
            System.out.println(e.getCause().getMessage());   // Extract the underlying cause.

        }


    }
}