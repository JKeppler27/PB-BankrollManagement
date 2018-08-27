package com.floodline.android.pokerbuddy_bankrollmanagement;

import com.floodline.android.pokerbuddy_bankrollmanagement.data.SessionsDatabaseHelper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    private SessionsDatabaseHelper mDbHelper;

    @Before
    public void setUp(){
        mDbHelper = new SessionsDatabaseHelper(Context context);
        mDbHelper.open();
    }
}

