package com.verbosetech.quickdeal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegBuyerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_buyer);
        setTitle("Register");
    }
    public void signinnow(View v)
    {
        Toast.makeText(this, "Go back to sign in!", Toast.LENGTH_SHORT).show();
    }
    public void regnow(View v)
    {
        Intent reg = new Intent(this,OtpVerificationActivity.class);
        startActivity(reg);
    }
}
