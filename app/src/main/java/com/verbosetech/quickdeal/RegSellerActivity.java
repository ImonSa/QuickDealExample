package com.verbosetech.quickdeal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegSellerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_seller);
        setTitle("Register");
    }
    public void signinnows(View v)
    {
        Toast.makeText(this, "Go back to sign in!", Toast.LENGTH_SHORT).show();
    }
    public void regnows(View v)
    {
        Intent reg = new Intent(this,OtpVerificationActivity.class);
        startActivity(reg);
    }
}
