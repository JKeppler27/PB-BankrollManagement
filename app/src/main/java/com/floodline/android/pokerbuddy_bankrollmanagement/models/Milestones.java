package com.floodline.android.pokerbuddy_bankrollmanagement.models;

/**
 * Created by Wraith on 11/14/2017.
 */

public class Milestones {
    private int MilestoneID;
    private String MilestoneType;
    private String MilestoneName;
    private String EntryDate;
    private String TargetDate;
    private String CompletedDate;
    private String CompletionPercent;

    public Milestones(){};

    public int getMilestoneID() {
        return MilestoneID;
    }

    public void setMilestoneID(int milestoneID) {
        MilestoneID = milestoneID;
    }

    public String getMilestoneType() {
        return MilestoneType;
    }

    public void setMilestoneType(String milestoneType) {
        MilestoneType = milestoneType;
    }

    public String getMilestoneName() {
        return MilestoneName;
    }

    public void setMilestoneName(String milestoneName) {
        MilestoneName = milestoneName;
    }

    public String getEntryDate() {
        return EntryDate;
    }

    public void setEntryDate(String entryDate) {
        EntryDate = entryDate;
    }

    public String getTargetDate() {
        return TargetDate;
    }

    public void setTargetDate(String targetDate) {
        TargetDate = targetDate;
    }

    public String getCompletedDate() {
        return CompletedDate;
    }

    public void setCompletedDate(String completedDate) {
        CompletedDate = completedDate;
    }

    public String getCompletionPercent() {
        return CompletionPercent;
    }

    public void setCompletionPercent(String completionPercent) {
        CompletionPercent = completionPercent;
    }
}
