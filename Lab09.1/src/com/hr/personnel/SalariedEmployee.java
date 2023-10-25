package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{

    // fields -- variables
    double salary;
    private final double STANDARD_DEDCUTION = 10_000.0;


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

    @Override
    public void payTaxes() {
       double taxes = getSalary() * SALARIED_TAX_RATE;
        System.out.printf("%s paid taxes %s\n", getName(), taxes);
    }

    @Override
    public double getStandardDeduction() {
        return STANDARD_DEDCUTION;
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation.");
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