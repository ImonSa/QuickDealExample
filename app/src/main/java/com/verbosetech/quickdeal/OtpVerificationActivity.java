package com.verbosetech.quickdeal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OtpVerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);
        setTitle("Verification");
    }
    public void resendnow(View v)
    {
        Toast.makeText(this, "Resending OTP...!", Toast.LENGTH_SHORT).show();
    }
}