package com.ziac.splashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ziac.SplashApp.R;

public class verifyOtp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_otp);
        Button btn=findViewById(R.id.getotp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(verifyOtp.this,signup.class);
                startActivity(i);
            }
        });
        TextView txt=findViewById(R.id.vback);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(verifyOtp.this,login.class);
                startActivity(intent);
            }
        });

    }
}
