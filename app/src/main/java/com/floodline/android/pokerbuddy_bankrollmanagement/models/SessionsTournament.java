package com.floodline.android.pokerbuddy_bankrollmanagement.models;

/**
 * Created by Wraith on 11/13/2017.
 */

public class SessionsTournament {
    private int SessionsTournamentID;
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
    private int TableSize;
    private int Entrants;
    private int PlaceFinished;
    private String Bounties;
    private double BountyWorth;

    public SessionsTournament(){};

    public int getSessionsTournamentID() {
        return SessionsTournamentID;
    }

    public void setSessionsTournamentID(int sessionsTournamentID) {
        SessionsTournamentID = sessionsTournamentID;
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

    public int getTableSize() {
        return TableSize;
    }

    public void setTableSize(int tableSize) {
        TableSize = tableSize;
    }

    public int getEntrants() {
        return Entrants;
    }

    public void setEntrants(int entrants) {
        Entrants = entrants;
    }

    public int getPlaceFinished() {
        return PlaceFinished;
    }

    public void setPlaceFinished(int placeFinished) {
        PlaceFinished = placeFinished;
    }

    public String getBounties() {
        return Bounties;
    }

    public void setBounties(String bounties) {
        Bounties = bounties;
    }

    public double getBountyWorth() {
        return BountyWorth;
    }

    public void setBountyWorth(double bountyWorth) {
        BountyWorth = bountyWorth;
    }
}
