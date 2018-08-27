package com.floodline.android.pokerbuddy_bankrollmanagement.models;

/**
 * Created by Wraith on 11/14/2017.
 */

public class GameTypes {
    private int GameTypeID;
    private String GameTypeName;

    public GameTypes(){};

    public int getGameTypeID() {
        return GameTypeID;
    }

    public void setGameTypeID(int gameTypeID) {
        GameTypeID = gameTypeID;
    }

    public String getGameTypeName() {
        return GameTypeName;
    }

    public void setGameTypeName(String gameTypeName) {
        GameTypeName = gameTypeName;
    }
}
