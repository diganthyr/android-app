package com.ziac.splashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ziac.SplashApp.R;


public class mobileNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_number);

        Button no = findViewById(R.id.otp);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mobileNumber.this, verifyOtp.class);
                startActivity(intent);
            }
        });
        TextView text=findViewById(R.id.mback);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mobileNumber.this,login.class);
                startActivity(intent);
            }
        });

    }
}
