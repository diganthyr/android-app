package com.ziac.splashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ziac.SplashApp.R;



public class password_otp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_otp);

        Button btn=findViewById(R.id.mobileotp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(password_otp.this, setNewpassword.class);
                startActivity(i);
            }
        });
        TextView txt=findViewById(R.id.logback);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(password_otp.this, login.class);
                startActivity(i);
            }
        });

    }
}
