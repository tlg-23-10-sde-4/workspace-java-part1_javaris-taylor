package net.flix.client;

import net.flix.Genre;
import net.flix.Movie;
import net.flix.Rating;

class MovieClient {
    public static void main(String[] args) {
        Movie m1 = new Movie("Akira", 1988, 240_000_000.0);
        System.out.println(m1);

        Movie m2 = new Movie("Iron Man", 2008, 29_000_000_000.0);
        System.out.println(m2);

        Movie m3 = new Movie("Jay 2 Jay", Genre.WESTERN);
        m3.setRating(Rating.G);
        System.out.println(m3);

        Movie m4 = new Movie("Iron Man 2", 2010);
        m4.setGenre(Genre.SPORTS_ROMANCE);
        System.out.println(m4);
    }

}