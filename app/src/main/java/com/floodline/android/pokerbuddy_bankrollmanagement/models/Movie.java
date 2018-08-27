package com.floodline.android.pokerbuddy_bankrollmanagement.models;

/**
 * Created by Wraith on 1/18/2018.
 */

public class Movie {

    private String title;
    private String genre;
    private String year;

    public Movie(){}

    public Movie(String title, String genre, String year){
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
