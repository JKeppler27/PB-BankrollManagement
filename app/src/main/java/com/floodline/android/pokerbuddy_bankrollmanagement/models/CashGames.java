package com.floodline.android.pokerbuddy_bankrollmanagement.models;

/**
 * Created by Wraith on 11/14/2017.
 */

public class CashGames {
    private int CashGameID;
    private String CashGameName;
    private int VenueID;
    private int GameTypeID;
    private int SeriesID;
    private double SmallBlind;
    private double BigBlind;
    private double ExtraBlind;
    private int TableSize;
    private int Online;

    public CashGames(){};

    public int getCashGameID() {
        return CashGameID;
    }

    public void setCashGameID(int cashGameID) {
        CashGameID = cashGameID;
    }

    public String getCashGameName() {
        return CashGameName;
    }

    public void setCashGameName(String cashGameName) {
        CashGameName = cashGameName;
    }

    public int getVenueID() {
        return VenueID;
    }

    public void setVenueID(int venueID) {
        VenueID = venueID;
    }

    public int getGameTypeID() {
        return GameTypeID;
    }

    public void setGameTypeID(int gameTypeID) {
        GameTypeID = gameTypeID;
    }

    public int getSeriesID() {
        return SeriesID;
    }

    public void setSeriesID(int seriesID) {
        SeriesID = seriesID;
    }

    public double getSmallBlind() {
        return SmallBlind;
    }

    public void setSmallBlind(double smallBlind) {
        SmallBlind = smallBlind;
    }

    public double getBigBlind() {
        return BigBlind;
    }

    public void setBigBlind(double bigBlind) {
        BigBlind = bigBlind;
    }

    public double getExtraBlind() {
        return ExtraBlind;
    }

    public void setExtraBlind(double extraBlind) {
        ExtraBlind = extraBlind;
    }

    public int getTableSize() {
        return TableSize;
    }

    public void setTableSize(int tableSize) {
        TableSize = tableSize;
    }

    public int getOnline() {
        return Online;
    }

    public void setOnline(int online) {
        Online = online;
    }
}
