//package com.floodline.android.pokerbuddy_bankrollmanagement.activities;
//
//import android.support.v4.app.FragmentTransaction;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
////import android.widget.Toolbar;
//import android.support.v7.widget.DefaultItemAnimator;
//import android.support.v7.widget.DividerItemDecoration;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.view.View;
//import android.widget.Toast;
//
//import com.floodline.android.pokerbuddy_bankrollmanagement.fragments.SessionListingFragment;
//import com.floodline.android.pokerbuddy_bankrollmanagement.interfaces.ClickListener;
//import com.floodline.android.pokerbuddy_bankrollmanagement.R;
//import com.floodline.android.pokerbuddy_bankrollmanagement.adapters.RecyclerTouchListener;
//import com.floodline.android.pokerbuddy_bankrollmanagement.models.SessionsCore;
//import com.floodline.android.pokerbuddy_bankrollmanagement.adapters.SessionsCoreAdapter;
//import com.floodline.android.pokerbuddy_bankrollmanagement.data.SessionsDatabaseHelper;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class SessionsCoreListingActivity extends AppCompatActivity {
//    private List<SessionsCore> sessionsCoreList = new ArrayList<>();
//    private RecyclerView recyclerView;
//    private SessionsCoreAdapter mAdapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sessions_listing);
//        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        //setSupportActionBar(toolbar);
//
//        //FRAGMET TRANSACTION HERE?
//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        ft.replace(R.id.sessions_listing_placeholder, new SessionListingFragment());
//        ft.commit();
//
//        //I THINK I NEED TO MOVE THIS TO THE FRAGMENT...
////        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
////
////        mAdapter = new SessionsCoreAdapter(sessionsCoreList);
////        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
////        recyclerView.setLayoutManager(mLayoutManager);
////        recyclerView.setItemAnimator(new DefaultItemAnimator());
////        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
////        recyclerView.setAdapter(mAdapter);
//
//        //row click listener
//        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener(){
//            @Override
//            public void onClick(View view, int position){
//                SessionsCore sessionsCore = sessionsCoreList.get(position);
//                Toast.makeText(getApplicationContext(), sessionsCore.getCoreID() + " is selected!", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onLongClick(View view, int position){
//                SessionsCore sessionsCore = sessionsCoreList.get(position);
//                Toast.makeText(getApplicationContext(), sessionsCore.getEntryDate() + " was long clicked!", Toast.LENGTH_LONG).show();
//            }
//        }));
//
//        prepareSessionsCoreData();
//    }
//
//    private void prepareSessionsCoreData(){
//        SessionsDatabaseHelper myDB = SessionsDatabaseHelper.getInstance(this);
//        List<SessionsCore> sessionsCL = myDB.getAllSessions();
//        Toast.makeText(getApplicationContext(), Integer.toString(sessionsCL.size()) + " sessions available.", Toast.LENGTH_LONG).show();
//        SessionsCore mySC = new SessionsCore();
//
//        for(int x = 0; x<sessionsCL.size(); x++){
//            sessionsCoreList.add(sessionsCL.get(x));
//        }
//
//
//        mAdapter.notifyDataSetChanged();
//    }
//}











package com.floodline.android.pokerbuddy_bankrollmanagement.activities;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
//import android.widget.Toolbar;
        import android.support.v7.widget.DefaultItemAnimator;
        import android.support.v7.widget.DividerItemDecoration;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.view.View;
        import android.widget.Toast;

        import com.floodline.android.pokerbuddy_bankrollmanagement.interfaces.ClickListener;
        import com.floodline.android.pokerbuddy_bankrollmanagement.R;
        import com.floodline.android.pokerbuddy_bankrollmanagement.adapters.RecyclerTouchListener;
        import com.floodline.android.pokerbuddy_bankrollmanagement.models.SessionsCore;
        import com.floodline.android.pokerbuddy_bankrollmanagement.adapters.SessionsCoreAdapter;
        import com.floodline.android.pokerbuddy_bankrollmanagement.data.SessionsDatabaseHelper;

        import java.util.ArrayList;
        import java.util.List;


public class SessionsCoreListingActivity extends AppCompatActivity {
    private List<SessionsCore> sessionsCoreList = new ArrayList<>();
    private RecyclerView recyclerView;
    private SessionsCoreAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessions_listing);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new SessionsCoreAdapter(sessionsCoreList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        //row click listener
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener(){
            @Override
            public void onClick(View view, int position){
                SessionsCore sessionsCore = sessionsCoreList.get(position);
                Toast.makeText(getApplicationContext(), sessionsCore.getCoreID() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position){
                SessionsCore sessionsCore = sessionsCoreList.get(position);
                Toast.makeText(getApplicationContext(), sessionsCore.getEntryDate() + " was long clicked!", Toast.LENGTH_LONG).show();
            }
        }));

        prepareSessionsCoreData();
    }

    private void prepareSessionsCoreData(){
        SessionsDatabaseHelper myDB = SessionsDatabaseHelper.getInstance(this);
        List<SessionsCore> sessionsCL = myDB.getAllSessions();
        Toast.makeText(getApplicationContext(), Integer.toString(sessionsCL.size()) + " sessions available.", Toast.LENGTH_LONG).show();
        SessionsCore mySC = new SessionsCore();

        for(int x = 0; x<sessionsCL.size(); x++){
            sessionsCoreList.add(sessionsCL.get(x));
        }


        mAdapter.notifyDataSetChanged();
    }
}

































//package com.floodline.android.pokerbuddy_bankrollmanagement;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
////import android.widget.Toolbar;
//import android.support.v7.widget.DefaultItemAnimator;
//import android.support.v7.widget.DividerItemDecoration;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.support.v7.widget.Toolbar;
//import android.view.View;
//import android.widget.Toast;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class SessionsCoreListingActivity extends AppCompatActivity {
//    private List<Movie> movieList = new ArrayList<>();
//    private RecyclerView recyclerView;
//    private MoviesAdapter mAdapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sessions_listing);
//        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        //setSupportActionBar(toolbar);
//
//
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
//    }
//}
//
