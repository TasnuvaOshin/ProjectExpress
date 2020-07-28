package com.sumayea.joyexpress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Merchant_Registration extends AppCompatActivity {

    Button Registration;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchant__registration);

        Registration= findViewById(R.id.btn_registration);

        Registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Merchant_Registration.this,Home.class);
                onBackPressed();
                startActivity(intent);



            }
        });

    }
}
