package net.flix;

public class Movie {
    // fields or instance variables
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    // business or "action methods - not shown
    //pause(), play(), rewind(), fastForward(), skipTo()

    // constructors - allows the creation of objects in the client file with a new keyword

    public Movie(String title) {
        setTitle(title);                // delegate to setter
    }

    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear) {
        this(title);                   // uses this to call the 1 arg constructor
        setReleaseYear(releaseYear);
    }

    public Movie(String title, Integer releaseYear, Double revenue) {
        this(title, releaseYear);
        setRevenue(revenue);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating) {
        this(title, releaseYear, revenue);
        setRating(rating);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title,releaseYear, revenue, rating);
        setGenre(genre);
    }

    // accessor methods - provide "controlled access" to the object's fields
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    // TODO: Checkout Currency formatting.
    // toString method
    public String toString() {
        // did jay say == was ok here????

        String revenueFormat;
        // ternary String revenueFormat = (getRevenue() == null) ? "%s" : "%,.2f";
        if (getRevenue() ==null) {
            revenueFormat = "%s";
        }
        else {
            revenueFormat = "%,.2f";
        }

        return String.format("Movie: title=%s, releaseYear=%s, revenue=" + revenueFormat +", rating=%s, genre=%s ",
                getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());

    }

}