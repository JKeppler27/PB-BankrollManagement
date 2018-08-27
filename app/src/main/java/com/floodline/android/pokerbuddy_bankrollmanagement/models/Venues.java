package com.floodline.android.pokerbuddy_bankrollmanagement.models;

/**
 * Created by Wraith on 11/14/2017.
 */

public class Venues {
    private int VenueID;
    private String VenueName;

    public Venues(){};

    public int getVenueID() {
        return VenueID;
    }

    public void setVenueID(int venueID) {
        VenueID = venueID;
    }

    public String getVenueName() {
        return VenueName;
    }

    public void setVenueName(String venueName) {
        VenueName = venueName;
    }
}
