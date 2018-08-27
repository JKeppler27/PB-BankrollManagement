package com.floodline.android.pokerbuddy_bankrollmanagement.models;

/**
 * Created by Wraith on 11/14/2017.
 */

public class Tournaments {
    private int mTournamentID;
    private String mTournamentName;
    private int mVenueID;
    private int mGameTypeID;
    private int mSeriesID;
    private int mTableSize;
    private int mIsBounty;
    private double mBountyWorth;
    private double mBuyIn;
    private int mOnline;

    public Tournaments(){};

    public int getmTournamentID() {
        return mTournamentID;
    }

    public void setmTournamentID(int mTournamentID) {
        this.mTournamentID = mTournamentID;
    }

    public String getmTournamentName() {
        return mTournamentName;
    }

    public void setmTournamentName(String mTournamentName) {
        this.mTournamentName = mTournamentName;
    }

    public int getmVenueID() {
        return mVenueID;
    }

    public void setmVenueID(int mVenueID) {
        this.mVenueID = mVenueID;
    }

    public int getmGameTypeID() {
        return mGameTypeID;
    }

    public void setmGameTypeID(int mGameTypeID) {
        this.mGameTypeID = mGameTypeID;
    }

    public int getmSeriesID() {
        return mSeriesID;
    }

    public void setmSeriesID(int mSeriesID) {
        this.mSeriesID = mSeriesID;
    }

    public int getmTableSize() {
        return mTableSize;
    }

    public void setmTableSize(int mTableSize) {
        this.mTableSize = mTableSize;
    }

    public int getmIsBounty() {
        return mIsBounty;
    }

    public void setmIsBounty(int mIsBounty) {
        this.mIsBounty = mIsBounty;
    }

    public double getmBountyWorth() {
        return mBountyWorth;
    }

    public void setmBountyWorth(double mBountyWorth) {
        this.mBountyWorth = mBountyWorth;
    }

    public double getmBuyIn() {
        return mBuyIn;
    }

    public void setmBuyIn(double mBuyIn) {
        this.mBuyIn = mBuyIn;
    }

    public int getmOnline() {
        return mOnline;
    }

    public void setmOnline(int mOnline) {
        this.mOnline = mOnline;
    }
}
