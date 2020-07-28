package com.sumayea.joyexpress;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class LoginActivity extends AppCompatActivity {

    RelativeLayout rellay1, rellay2;
    private Button Login, Registration;

    Handler handler= new Handler();
    Runnable runnable= new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Login= findViewById(R.id.btn_login);
        Registration= findViewById(R.id.btn_registration);


        rellay1 = (RelativeLayout)findViewById(R.id.rellay1);
        rellay2 = (RelativeLayout) findViewById(R.id.rellay2);

        handler.postDelayed(runnable, 1000);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginActivity.this,Home.class);
                onBackPressed();
                startActivity(intent);



            }
        });

        Registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginActivity.this,Merchant_Registration.class);
                onBackPressed();
                startActivity(intent);



            }
        });
    }


}
