package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    // fields -- variables
    double rate;
    double hours;

    public HourlyEmployee() {

    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    // business methods
    @Override
    public void pay() {
        System.out.format("%s is paid hourly %s\n", getName(), getHours()*getRate());
    }

    // accessor methods

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", rate=" + getRate() +
                ", hours=" + getHours();
    }
}