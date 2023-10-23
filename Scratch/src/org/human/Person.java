package org.human;

import java.time.LocalDate;
import java.time.Period;

/*
 * An immutable class. More accurately, a class definition written in such a way
 * that instances of it, once created cannot have their properties changed.
 * There are simply no public methods to do so.
 */
class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    /*
     * Returns the person's age in whole years.
     * getAge()
     * This is a derived property, it is calculated adn returned
     */
    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person: name= %s, birthDate= %s, age= %s", getName(), getBirthDate(), getAge());
    }
}