package com.floodline.android.pokerbuddy_bankrollmanagement.models;

/**
 * Created by Wraith on 11/14/2017.
 */

public class Series {
    private int SeriesID;
    private String SeriesName;

    public Series(){};

    public int getSeriesID() {
        return SeriesID;
    }

    public void setSeriesID(int seriesID) {
        SeriesID = seriesID;
    }

    public String getSeriesName() {
        return SeriesName;
    }

    public void setSeriesName(String seriesName) {
        SeriesName = seriesName;
    }
}
