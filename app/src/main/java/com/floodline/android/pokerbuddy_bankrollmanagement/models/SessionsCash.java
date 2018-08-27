package com.floodline.android.pokerbuddy_bankrollmanagement.models;

/**
 * Created by Wraith on 11/12/2017.
 */

public class SessionsCash {
    private int SessionsCashID;
    private int CoreID;
    private int VenueID;
    private int GameTypeID;
    private int SeriesID;
    private int CashGameID;
    private int Online;
    private double BuyIn;
    private double CashOut;
    private int ReBuys;
    private String SessionStart;
    private String SessionEnd;
    private String SessionLength;
    private String TableSize;
    private double SmallBlind;
    private double BigBlind;
    private double ExtraBlind;

    public SessionsCash(){};

    public int getSessionsCashID() {
        return SessionsCashID;
    }

    public void setSessionsCashID(int sessionsCashID) {
        SessionsCashID = sessionsCashID;
    }

    public int getCoreID() {
        return CoreID;
    }

    public void setCoreID(int coreID) {
        CoreID = coreID;
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

    public int getCashGameID() {
        return CashGameID;
    }

    public void setCashGameID(int cashGameID) {
        CashGameID = cashGameID;
    }

    public int getOnline() {
        return Online;
    }

    public void setOnline(int online) {
        Online = online;
    }

    public double getBuyIn() {
        return BuyIn;
    }

    public void setBuyIn(double buyIn) {
        BuyIn = buyIn;
    }

    public double getCashOut() {
        return CashOut;
    }

    public void setCashOut(double cashOut) {
        CashOut = cashOut;
    }

    public int getReBuys() {
        return ReBuys;
    }

    public void setReBuys(int reBuys) {
        ReBuys = reBuys;
    }

    public String getSessionStart() {
        return SessionStart;
    }

    public void setSessionStart(String sessionStart) {
        SessionStart = sessionStart;
    }

    public String getSessionEnd() {
        return SessionEnd;
    }

    public void setSessionEnd(String sessionEnd) {
        SessionEnd = sessionEnd;
    }

    public String getSessionLength() {
        return SessionLength;
    }

    public void setSessionLength(String sessionLength) {
        SessionLength = sessionLength;
    }

    public String getTableSize() {
        return TableSize;
    }

    public void setTableSize(String tableSize) {
        TableSize = tableSize;
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
}
