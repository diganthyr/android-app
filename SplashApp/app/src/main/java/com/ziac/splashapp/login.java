package com.ziac.splashapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.ziac.SplashApp.R;



public class login  extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.sign_in);


           Button btn = findViewById(R.id.btnLogin);
           btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(login.this,nav_mainActivity.class);
                   startActivity(intent);
               }
           });

            TextView register=findViewById(R.id.rclick);
            register.setMovementMethod(LinkMovementMethod.getInstance());
            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(login.this, mobileNumber.class);

                    startActivity(intent);

                }
            });

          TextView txt=findViewById(R.id.forgotpass);
          txt.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent i=new Intent(login.this, resetPassword.class);
                  startActivity(i);
              }
          });

            
        }
    }
