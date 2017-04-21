package com.verbosetech.quickdeal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void seller(View v)
    {
        Intent sell = new Intent(this,LoginAsSellerActivity.class);
        startActivity(sell);
    }
    public void buyer(View v)
    {
        Intent buy = new Intent(this,LoginAsBuyerActivity.class);
        startActivity(buy);
    }
}
