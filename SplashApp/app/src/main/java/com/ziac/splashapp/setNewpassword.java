package com.ziac.splashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ziac.SplashApp.R;

public class setNewpassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_newpassword);

        Button btn=findViewById(R.id.cngpass);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(setNewpassword.this,pwdResetSuccessful.class);
                startActivity(intent);
            }
        });

        TextView txt=findViewById(R.id.cnglogin);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(setNewpassword.this,login.class);
                startActivity(intent);
            }
        });
    }
}
