package com.example.heterogenousrecycleview;

import java.util.ArrayList;

public class Movie {

    private String movieName;
    private int movieImage;

    public Movie(String movieName, int movieImage) {
        this.movieName = movieName;
        this.movieImage = movieImage;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(int movieImage) {
        this.movieImage = movieImage;
    }

    public ArrayList<Movie>getAllMovies(){

        ArrayList<Movie>movieArrayList = new ArrayList<>();
        movieArrayList.add(new Movie("Origin of Wolverine", R.drawable.movie));
        movieArrayList.add(new Movie("Spiderman", R.drawable.movie));
        movieArrayList.add(new Movie("Origin of Wolverine", R.drawable.movie));
        movieArrayList.add(new Movie("Batman", R.drawable.movie));
        movieArrayList.add(new Movie("Origin of Wolverine", R.drawable.movie));
        movieArrayList.add(new Movie("Titanic", R.drawable.movie));
        movieArrayList.add(new Movie("Origin of Wolverine", R.drawable.movie));
        movieArrayList.add(new Movie("Superman", R.drawable.movie));
        movieArrayList.add(new Movie("Origin of Wolverine", R.drawable.movie));
        movieArrayList.add(new Movie("The Mountain Mna", R.drawable.movie));

        return movieArrayList;

    }
}
