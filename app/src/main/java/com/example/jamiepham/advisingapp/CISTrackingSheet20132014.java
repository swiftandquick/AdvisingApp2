package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CISTrackingSheet20132014 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cistracking_sheet20132014);

        Button backtoCISTrackingSheets = (Button) findViewById(R.id.toCISTrackingSheets);
        backtoCISTrackingSheets.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CISTrackingSheet20132014.this, CISTrackingSheets.class);
                startActivity(intent);
            }
        });

    }
}
