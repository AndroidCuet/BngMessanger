package com.ratna.bngmessanger;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HomePageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_home_page, menu);
        return true;
    }    
}
