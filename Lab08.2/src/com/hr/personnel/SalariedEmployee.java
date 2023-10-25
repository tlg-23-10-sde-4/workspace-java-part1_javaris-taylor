package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    // fields -- variables
    double salary;


    public SalariedEmployee() {

    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);

        // registerIn401k()
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    // business methods
    @Override
    public void pay() {
        System.out.format("%s is paid salary %s\n", getName(), getSalary());
    }

    // accessor methods

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return  super.toString() +
                ", salary=" + getSalary();
    }
}