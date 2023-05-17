package com.example.tickets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText userID;
private EditText mesto;
private EditText liftOn;
private EditText liftOff;
private EditText cash;

private Button buttonBegin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userID = findViewById(R.id.ID);
        mesto = findViewById(R.id.mesto);
        liftOn = findViewById(R.id.timeOn);
        liftOff = findViewById(R.id.timeOff);
        cash = findViewById(R.id.cash);

        buttonBegin = findViewById(R.id.buttonBegin);
        buttonBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String IDstr = userID.getText().toString();
                String MESTOstr = mesto.getText().toString();
                String ONstr = liftOn.getText().toString();
                String OFFstr = liftOff.getText().toString();
                String CASHstr = cash.getText().toString();

                Intent intentBegin = new Intent(getApplicationContext(), PreviewActivity.class);
                Customer customer = new Customer(IDstr, MESTOstr, ONstr, OFFstr, CASHstr);
                intentBegin.putExtra("argument", customer);
                startActivity(intentBegin);
            }
        });

    }
}