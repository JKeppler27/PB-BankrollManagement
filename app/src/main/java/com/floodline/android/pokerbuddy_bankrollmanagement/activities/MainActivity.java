package com.floodline.android.pokerbuddy_bankrollmanagement.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.floodline.android.pokerbuddy_bankrollmanagement.preferences.AppSettings;
import com.floodline.android.pokerbuddy_bankrollmanagement.R;
import com.floodline.android.pokerbuddy_bankrollmanagement.models.SessionsCore;
import com.floodline.android.pokerbuddy_bankrollmanagement.data.SessionsDatabaseHelper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;


public class MainActivity extends AppCompatActivity {
//    private List<Movie> movieList = new ArrayList<>();
//    private RecyclerView recyclerView;
//    private MoviesAdapter mAdapter;
    private static Button btnSessionListings;
    private static Button btnTestWrite;
    private static Button btnTestRead;
    private static Button btnTestFrags;
    private static TextView txtVwTestRead;
    private static TextView txtVwTestCoreID;
    private static TextView txtVwTestEntryDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //btnSessionListings
        btnSessionListings = (Button)findViewById(R.id.btnSessionListings);
        btnSessionListings.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            onSessionsListingsClicked();
        }
        });

        //btnTestWrite
        btnTestWrite = (Button)findViewById(R.id.btnTestWrite);
        btnTestWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onTestWriteClicked();
            }
        });

        //btnTestRead
        btnTestRead = (Button)findViewById(R.id.btnTestRead);
        btnTestRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onTestReadClicked();
            }
        });

        //btnTestFrags
        btnTestFrags = (Button)findViewById(R.id.btnTestFrags);
        btnTestFrags.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                onTestFragsClicked();
            }
        });
    }


    private void onSessionsListingsClicked(){
        Log.d(AppSettings.tag,"onSessionsListingsClicked");
        Intent intent = new Intent("android.intent.action.Listings");
        startActivity(intent);
    }

    private void onTestWriteClicked(){
        Log.d(AppSettings.tag, "onTestWriteClicked");
        SessionsDatabaseHelper myDB = SessionsDatabaseHelper.getInstance(this);

        //GET DATE INSTANCE
        Calendar calendar;
        SimpleDateFormat simpleDateFormat;
        String date;

        calendar = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        date = simpleDateFormat.format(calendar.getTime());
        myDB.addSessionCore(date);
    }

    private void onTestReadClicked(){
        Log.d(AppSettings.tag, "onTestReadClicked");
        SessionsDatabaseHelper myDB = SessionsDatabaseHelper.getInstance(this);
        List<SessionsCore> myList;
        myList = myDB.getAllSessions();
        SessionsCore mySC = new SessionsCore();

        txtVwTestRead = (TextView)findViewById(R.id.txtVwTestRead);
        txtVwTestRead.setText(Integer.toString(myList.size()));
        txtVwTestCoreID = (TextView)findViewById(R.id.txtVwTestCoreID);
        txtVwTestEntryDate = (TextView)findViewById(R.id.txtVwTestEntryDate);

        if(myList.size() > 0){
            mySC = myList.get(myList.size()-1);
            txtVwTestCoreID.setText(Integer.toString(mySC.getCoreID()));
            txtVwTestEntryDate.setText(mySC.getEntryDate());
        } else {
            txtVwTestCoreID.setText("There is no list!");
        }
    }

    private void onTestFragsClicked(){
        Log.d(AppSettings.tag, "onTestFragsClicked");
        Intent intent = new Intent("android.intent.action.AddSession");
        startActivity(intent);
    }
}










        //MOVING ALL OF THIS TO SESSIONSLISTING.JAVA

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


//        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
//
//        mAdapter = new MoviesAdapter(movieList);
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
//        recyclerView.setLayoutManager(mLayoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
//        recyclerView.setAdapter(mAdapter);
//
//        //row click listener
//        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener(){
//            @Override
//            public void onClick(View view, int position){
//                Movie movie = movieList.get(position);
//                Toast.makeText(getApplicationContext(), movie.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onLongClick(View view, int position){
//                Movie movie = movieList.get(position);
//                Toast.makeText(getApplicationContext(), movie.getTitle() + " was long clicked!", Toast.LENGTH_LONG).show();
//
//            }
//        }));
//
//        prepareMovieData();
//    }
//
//    private void prepareMovieData(){
//        Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015");
//        movieList.add(movie);
//
//        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015");
//        movieList.add(movie);
//
//        movie = new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
//        movieList.add(movie);
//
//        movie = new Movie("Shaun the Sheep", "Animation", "2015");
//        movieList.add(movie);
//
//        movie = new Movie("The Martian", "Science Fiction & Fantasy", "2015");
//        movieList.add(movie);
//
//        movie = new Movie("Mission: Impossible Rogue Nation", "Action", "2015");
//        movieList.add(movie);
//
//        movie = new Movie("Up", "Animation", "2009");
//        movieList.add(movie);
//
//        movie = new Movie("Star Trek", "Science Fiction", "2009");
//        movieList.add(movie);
//
//        movie = new Movie("The LEGO Movie", "Animation", "2014");
//        movieList.add(movie);
//
//        movie = new Movie("Iron Man", "Action & Adventure", "2008");
//        movieList.add(movie);
//
//        movie = new Movie("Aliens", "Science Fiction", "1986");
//        movieList.add(movie);
//
//        movie = new Movie("Chicken Run", "Animation", "2000");
//        movieList.add(movie);
//
//        movie = new Movie("Back to the Future", "Science Fiction", "1985");
//        movieList.add(movie);
//
//        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981");
//        movieList.add(movie);
//
//        movie = new Movie("Goldfinger", "Action & Adventure", "1965");
//        movieList.add(movie);
//
//        movie = new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
//        movieList.add(movie);
//
//        mAdapter.notifyDataSetChanged();


