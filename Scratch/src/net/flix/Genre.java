package net.flix;

public enum Genre {
    ACTION("Action!!"),
    HORROR("Spooky"),
    HISTORICAL("Historical"),
    COMEDY("cOmeDY :D"),
    SPORTS_ROMANCE("Sport's Romance"),
    WESTERN("Yee-Haw");
    // everything under here is reg class definition stuff: fields, ctor, methods.
    public final String display;

    Genre(String display) {         // automatically private by definition
        this.display = display;
        // System.out.println("net.flix.Genre ctor called");
    }

    public String display() {
        return display;
    }

    public String toString() {
        return display();
    }
}
