package com.example.classworkno003;

public class Movie {

    private String title;
   private String mainActor;
   private double movieRating;
   private int PGRating;
  private  String genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(double movieRating) {
        this.movieRating = movieRating;
    }

    public int getPGRating() {
        return PGRating;
    }

    public void setPGRating(int PGRating) {
        this.PGRating = PGRating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public Movie(String title, String mainActor, double movieRating, int PGRating, String genre) {
        this.title = title;
        this.mainActor = mainActor;
        this.movieRating = movieRating;
        this.PGRating = PGRating;
        this.genre = genre;
    }
}
