package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CNTrackingSheet20142015 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cntracking_sheet20142015);

        Button backtoCNTrackingSheets = (Button) findViewById(R.id.toCNTrackingSheets);
        backtoCNTrackingSheets.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CNTrackingSheet20142015.this, CNTrackingSheets.class);
                startActivity(intent);
            }
        });

    }
}
