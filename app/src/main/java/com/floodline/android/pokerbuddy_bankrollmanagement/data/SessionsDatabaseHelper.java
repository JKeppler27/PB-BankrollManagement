package com.floodline.android.pokerbuddy_bankrollmanagement.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.floodline.android.pokerbuddy_bankrollmanagement.models.SessionsCore;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by Wraith on 11/12/2017.
 */

public class SessionsDatabaseHelper extends SQLiteOpenHelper{

    private static SessionsDatabaseHelper sInstance;

    //Database Info
    private static final String DATABASE_NAME = "SessionsDatabase";
    private static final int DATABASE_VERSION = 1;

    //Table Names
    private static final String TABLE_SESSIONSCORE = "SessionsCore";
    private static final String TABLE_SESSIONSCASH = "SessionsCash";
    private static final String TABLE_SESSIONSTOURNAMENT = "SessionsTournament";
    private static final String TABLE_VENUES = "Venues";
    private static final String TABLE_SERIES = "Series";
    private static final String TABLE_GAMETYPES = "GameTypes";
    private static final String TABLE_SESSIONNOTES = "SessionNotes";
    private static final String TABLE_MILESTONES = "Milestones";
    private static final String TABLE_CASHGAMES = "CashGames";
    private static final String TABLE_TOURNAMENTS = "Tournaments";

    //SessionsCore Columns
    private static final String SESSIONSCORE_COREID = "CoreID";
    private static final String SESSIONSCORE_ENTRYDATE = "EntryDate";

    //SessionsCash Columns
    private static final String SESSIONSCASH_SESSIONSCASHID = "SessionsCashID";
    private static final String SESSIONSCASH_COREID = "CoreID";
    private static final String SESSIONSCASH_VENUEID = "VenueID";
    private static final String SESSIONSCASH_GAMETYPEID = "GameTypeID";
    private static final String SESSIONSCASH_SERIESID = "SeiesID";
    private static final String SESSIONSCASH_CASHGAMEID = "CashGameID";
    //private static final String SESSIONSCASH_ONLINE = "Online";
    private static final String SESSIONSCASH_BUYIN = "BuyIn";
    private static final String SESSIONSCASH_CASHOUT = "CashOut";
    private static final String SESSIONSCASH_REBUYS = "ReBuys";
    private static final String SESSIONSCASH_SESSIONSTART = "SessionStart";
    private static final String SESSIONSCASH_SESSIONEND = "SessionEnd";
    private static final String SESSIONSCASH_SESSIONLENGTH = "SessionLength";
    //private static final String SESSIONSCASH_TABLESIZE = "TableSize";
    //private static final String SESSIONSCASH_SMALLBLIND = "SmallBlind";
    //private static final String SESSIONSCASH_BIGBLIND = "BigBlind";
    //private static final String SESSIONSCASH_EXTRABLIND = "ExtraBlind";

    //SessionsTournament Columns
    private static final String SESSIONSTOURNAMENT_SESSIONSTOURNAMENTID = "SessionsTournamentID";
    private static final String SESSIONSTOURNAMENT_COREID = "CoreID";
    private static final String SESSIONSTOURNAMENT_VENUEID = "VenueID";
    private static final String SESSIONSTOURNAMENT_GAMETYPEID = "GameTypeID";
    private static final String SESSIONSTOURNAMENT_SERIESID = "SeriesID";
    private static final String SESSIONSTOURNAMENT_TOURNAMENTID = "TournamentID";
    //private static final String SESSIONSTOURNAMENT_BUYIN = "BuyIn";
    private static final String SESSIONSTOURNAMENT_CASHOUT = "CashOut";
    private static final String SESSIONSTOURNAMENT_REBUYS = "ReBuys";
    private static final String SESSIONSTOURNAMENT_SESSIONSTART = "SessionStart";
    private static final String SESSIONSTOURNAMENT_SESSIONEND = "SessionEnd";
    private static final String SESSIONSTOURNAMENT_SESSIONLENGTH = "SessionLength";
    //private static final String SESSIONSTOURNAMENT_BOUNTIES = "Bounties";
    //private static final String SESSIONSTOURNAMENT_BOUNTYWORTH = "BountyWorth";
    //private static final String SESSIONSTOURNAMENT_TABLESIZE = "TableSize";
    //private static final String SESSIONSTOURNAMENT_ENTRANTS = "Entrants";
    //private static final String SESSIONSTOURNAMENT_PLACEFINISHED = "PlaceFinished";
    //private static final String SESSIONSTOURNAMENT_ONLINE = "Online";

    //Venues Columns
    private static final String VENUES_VENUEID = "VenueID";
    private static final String VENUES_VENUENAME = "VenueName";

    //Series Columns
    private static final String SERIES_SERIESID = "SeriesID";
    private static final String SERIES_SERIESNAME = "SeriesName";

    //GameTypes Columns
    private static final String GAMETYPES_GAMETYPEID = "GameTypeID";
    private static final String GAMETYPES_GAMETYPENAME = "GameTypeName";

    //Sessions Columns
    private static final String SESSIONNOTES_NOTEID = "NoteID";
    private static final String SESSIONNOTES_COREID = "CoreID";
    private static final String SESSIONNOTES_NOTE = "Note";
    private static final String SESSIONNOTES_NOTETIME = "NoteTime";

    //Milestones Columns
    private static final String MILESTONES_MILESTONEID = "MilestoneID";
    private static final String MILESTONES_MILESTONETYPE = "MilestoneType";
    private static final String MILESTONES_MILESTONENAME = "MilestoneName";
    private static final String MILESTONES_ENTRYDATE = "EntryDate";
    private static final String MILESTONES_TARGETDATE = "TargetDate";
    private static final String MILESTONES_COMPLETEDDATE = "CompletedDate";
    private static final String MILESTONES_COMPLETIONPERCENT = "CompletionPercent";

    //CashGames Columns
    private static final String CASHGAMES_CASHGAMEID = "CashGameID";
    private static final String CASHGAMES_CASHGAMENAME = "CashGameName";
    private static final String CASHGAMES_VENUEID = "VenueID";
    private static final String CASHGAMES_GAMETYPEID = "GameTypeID";
    private static final String CASHGAMES_SERIESID = "SeriesID";
    private static final String CASHGAMES_SMALLBLIND = "SmallBlind";
    private static final String CASHGAMES_BIGBLIND = "BigBlind";
    private static final String CASHGAMES_EXTRABLIND = "ExtraBlind";
    private static final String CASHGAMES_TABLESIZE = "TableSize";
    private static final String CASHGAMES_ONLINE = "Online";

    //Tournaments Columns
    private static final String TOURNAMENTS_TOURNAMENTID = "TournamentID";
    private static final String TOURNAMENTS_TOURNAMENTNAME = "TournamentName";
    private static final String TOURNAMENTS_VENUEID = "VenueID";
    private static final String TOURNAMENTS_GAMETYPEID = "GameTypeID";
    private static final String TOURNAMENTS_SERIESID = "SeriesID";
    private static final String TOURNAMENTS_TABLESIZE = "TableSize";
    private static final String TOURNAMENTS_ISBOUNTY = "IsBounty";
    private static final String TOURNAMENTS_BOUNTYWORTH = "BountyWorth";
    private static final String TOURNAMENTS_BUYIN = "BuyIn";
    private static final String TOURNAMENTS_ONLINE = "Online";


    public static synchronized SessionsDatabaseHelper getInstance(Context context){
        //Use the application context, which will ensure that you
        //don't acidentally leak an Activity's context.
        //See this article for more information: http://bit.ly/6LRzfx
        if(sInstance == null){
            sInstance = new SessionsDatabaseHelper(context.getApplicationContext());
        }
        return sInstance;
    }

    //Construnctor should be private to prevent direct instantiation.
    //Make a call to the static method "getInstance()" instead.
    //This ensures that only one DB helper will exist at a given time.
    //com.floodline.android.pokerbuddy_bankrollmanagement.data.SessionsDatabaseHelper helper = SessionDatabaseHelper.getInstance(this);
    private SessionsDatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    //Called when the DB connection is being configured.
    //Configure DB settings for things like foreign key support, write-ahead logging, etc.
    @Override
    public void onConfigure(SQLiteDatabase db){
        super.onConfigure(db);
        db.setForeignKeyConstraintsEnabled(true);
    }

    //Called when the DB is created for the first time.
    //If a DB already exists on disk with the same DATABASE_NAME, this method will not be called.
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_SESSIONSCORE_TABLE = "CREATE TABLE " + TABLE_SESSIONSCORE +
                "(" +
                SESSIONSCORE_COREID + " INTEGER PRIMARY KEY," +
                SESSIONSCORE_ENTRYDATE + " TEXT" +
                ")";

        String CREATE_SESSIONSCASH_TABLE = "CREATE TABLE " + TABLE_SESSIONSCASH +
                "(" +
                SESSIONSCASH_SESSIONSCASHID + " INTEGER PRIMARY KEY," +
                SESSIONSCASH_COREID + " INTEGER," +
                SESSIONSCASH_VENUEID + " INTEGER," +
                SESSIONSCASH_GAMETYPEID + " INTEGER," +
                SESSIONSCASH_SERIESID + " INTEGER," +
                SESSIONSCASH_CASHGAMEID + " INTEGER," +
                //SESSIONSCASH_ONLINE + " INTEGER," +
                SESSIONSCASH_BUYIN + " REAL," +
                SESSIONSCASH_CASHOUT + " REAL," +
                SESSIONSCASH_REBUYS + " REAL," +
                SESSIONSCASH_SESSIONSTART + " TEXT," +
                SESSIONSCASH_SESSIONEND + " TEXT," +
                SESSIONSCASH_SESSIONLENGTH + " TEXT" +
                //SESSIONSCASH_TABLESIZE + " INTEGER," +
                //SESSIONSCASH_SMALLBLIND + " REAL," +
                //SESSIONSCASH_BIGBLIND + " REAL," +
                //SESSIONSCASH_EXTRABLIND + " REAL" +
                ")";

        String CREATE_SESSIONSTOURNAMENT_TABLE = "CREATE TABLE " + TABLE_SESSIONSTOURNAMENT +
                "(" +
                SESSIONSTOURNAMENT_SESSIONSTOURNAMENTID + " INTEGER PRIMARY KEY," +
                SESSIONSTOURNAMENT_COREID + " INTEGER," +
                SESSIONSTOURNAMENT_VENUEID + " INTEGER," +
                SESSIONSTOURNAMENT_GAMETYPEID + " INTEGER," +
                SESSIONSTOURNAMENT_SERIESID + " INTEGER," +
                SESSIONSTOURNAMENT_TOURNAMENTID + " INTEGER," +
                //SESSIONSTOURNAMENT_BUYIN + " REAL," +
                SESSIONSTOURNAMENT_CASHOUT + " REAL," +
                SESSIONSTOURNAMENT_REBUYS + " INT," +
                SESSIONSTOURNAMENT_SESSIONSTART + " TEXT," +
                SESSIONSTOURNAMENT_SESSIONEND + " TEXT," +
                SESSIONSTOURNAMENT_SESSIONLENGTH + " TEXT" +
                //SESSIONSTOURNAMENT_BOUNTIES + " INTEGER," +
                //SESSIONSTOURNAMENT_BOUNTYWORTH + " REAL," +
                //SESSIONSTOURNAMENT_TABLESIZE + " INTEGER," +
                //SESSIONSTOURNAMENT_ENTRANTS + " INTEGER," +
                //SESSIONSTOURNAMENT_PLACEFINISHED + " INTEGER" +
                ")";

        String CREATE_VENUES_TABLE = "CREATE TABLE " + TABLE_VENUES +
                "(" +
                VENUES_VENUEID + " INTEGER PRIMARY KEY," +
                VENUES_VENUENAME + " TEXT" +
                ")";

        String CREATE_SERIES_TABLE = "CREATE TABLE " + TABLE_SERIES +
                "(" +
                SERIES_SERIESID + " INTEGER PRIMARY KEY," +
                SERIES_SERIESNAME + " TEXT" +
                ")";

        String CREATE_GAMETYPES_TABLE = "CREATE TABLE " + TABLE_GAMETYPES +
                "(" +
                GAMETYPES_GAMETYPEID + " INTEGER PRIMARY KEY," +
                GAMETYPES_GAMETYPENAME + " TEXT" +
                ")";

        String CREATE_SESSIONNOTES_TABLE = "CREATE TABLE " + TABLE_SESSIONNOTES +
                "(" +
                SESSIONNOTES_NOTEID + " INTEGER PRIMARY KEY," +
                SESSIONNOTES_COREID + " INTEGER," +
                SESSIONNOTES_NOTE + " TEXT," +
                SESSIONNOTES_NOTETIME + " TEXT" +
                ")";

        String CREATE_MILESTONES_TABLE = "CREATE TABLE " + TABLE_MILESTONES +
                "(" +
                MILESTONES_MILESTONEID + " INTEGER PRIMARY KEY," +
                MILESTONES_MILESTONETYPE + " TEXT," +
                MILESTONES_MILESTONENAME + " TEXT," +
                MILESTONES_ENTRYDATE + " TEXT," +
                MILESTONES_TARGETDATE + " TEXT," +
                MILESTONES_COMPLETEDDATE + " TEXT," +
                MILESTONES_COMPLETIONPERCENT + " TEXT" +
                ")";

        String CREATE_CASHGAMES_TABLE = "CREATE TABLE " + TABLE_CASHGAMES +
                "(" +
                CASHGAMES_CASHGAMEID + " INTEGER PRIMARY KEY," +
                CASHGAMES_CASHGAMENAME + " TEXT," +
                CASHGAMES_VENUEID + " INTEGER," +
                CASHGAMES_GAMETYPEID + " INTEGER," +
                CASHGAMES_SERIESID + " INTEGER," +
                CASHGAMES_SMALLBLIND + " REAL," +
                CASHGAMES_BIGBLIND + " REAL," +
                CASHGAMES_EXTRABLIND + " REAL," +
                CASHGAMES_TABLESIZE + " INTEGER," +
                CASHGAMES_ONLINE + " INTEGER" +
                ")";

        String CREATE_TOURNAMENTS_TABLE = "CREATE TABLE " + TABLE_TOURNAMENTS +
                "(" +
                TOURNAMENTS_TOURNAMENTID + " INTEGER PRIMARY KEY," +
                TOURNAMENTS_TOURNAMENTNAME + " TEXT," +
                TOURNAMENTS_VENUEID + " INTEGER," +
                TOURNAMENTS_GAMETYPEID + " INTEGER," +
                TOURNAMENTS_SERIESID + " INTEGER," +
                TOURNAMENTS_TABLESIZE + " INTEGER," +
                TOURNAMENTS_ISBOUNTY + " INTEGER," +
                TOURNAMENTS_BOUNTYWORTH + " REAL," +
                TOURNAMENTS_BUYIN + " REAL," +
                TOURNAMENTS_ONLINE + " INTEGER" +
                ")";

        //Execute the SQL CREATE scripts
        db.execSQL(CREATE_SESSIONSCORE_TABLE);
        db.execSQL(CREATE_SESSIONSCASH_TABLE);
        db.execSQL(CREATE_SESSIONSTOURNAMENT_TABLE);
        db.execSQL(CREATE_VENUES_TABLE);
        db.execSQL(CREATE_SERIES_TABLE);
        db.execSQL(CREATE_GAMETYPES_TABLE);
        db.execSQL(CREATE_SESSIONNOTES_TABLE);
        db.execSQL(CREATE_MILESTONES_TABLE);
        db.execSQL(CREATE_CASHGAMES_TABLE);
        db.execSQL(CREATE_TOURNAMENTS_TABLE);
    }


    //Called when the database needs to be upgraded.
    //This method will only be called if a database already exists on disk with the same DATABASE_NAME,
    //but the DATABASE_VERSION is different than the version of the database that exists on disk.
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        if (oldVersion != newVersion){
            //Simplest implementation is to drop all old tables and recreate them.
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_SESSIONSCORE);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_SESSIONSCASH);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_SESSIONSTOURNAMENT);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_VENUES);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_GAMETYPES);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_SERIES);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_SESSIONNOTES);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_MILESTONES);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_CASHGAMES);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_TOURNAMENTS);
        }
    }

    //Insert a core session into the database.
    public void addSessionCore(String entryDate){
        //Create and/or open the database for writing
        SQLiteDatabase db = this.getWritableDatabase();

        //Wrap insert in a transaction.
        db.beginTransaction();
        try{
            ContentValues values = new ContentValues();
            values.put(SESSIONSCORE_ENTRYDATE, entryDate);

            db.insertOrThrow(TABLE_SESSIONSCORE, null,values);
            db.setTransactionSuccessful();
        } catch(Exception e){
            Log.d(TAG, "Error while trying to add a core session to the database.");
        } finally{
            db.endTransaction();
        }
    }

    //Query example
    public List<SessionsCore> getAllSessions(){
        List<SessionsCore> sessions = new ArrayList<>();

        String SESSIONSCORE_SELECT_QUERY =
                String.format("SELECT * FROM %s",
                        TABLE_SESSIONSCORE);
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(SESSIONSCORE_SELECT_QUERY, null);
        try{
            if(cursor.moveToFirst()){
                do{
                    SessionsCore sessionsCore = new SessionsCore();
                    sessionsCore.setCoreID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(SESSIONSCORE_COREID))));
                    sessionsCore.setEntryDate(cursor.getString(cursor.getColumnIndex(SESSIONSCORE_ENTRYDATE)));
                    sessions.add(sessionsCore);
                }while(cursor.moveToNext());
            }
        }catch(Exception e){
            Log.d(TAG, "Error while trying to get all core sessions.");
        }finally {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return sessions;
    }

    //Get all cash game sessions
//    public List<SessionsCash> getAllCashSessions(){
//        List<SessionsCash> cashSessions = new ArrayList<>();
//
//        String QUERY_SELECT_SESSIONSCASH = String.format("SELECT * FROM %s", TABLE_SESSIONSCASH);
//        SQLiteDatabase db = getReadableDatabase();
//        Cursor cursor = db.rawQuery(QUERY_SELECT_SESSIONSCASH, null);
//        try{
//            if(cursor.moveToFirst()){
//                do{
//                    SessionsCash sessionsCash = new SessionsCash();
//                    sessionsCash.setSessionsCashID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(SESSIONSCASH_COREID))));
//
//                }
//            }
//        }
//
//    }


}
