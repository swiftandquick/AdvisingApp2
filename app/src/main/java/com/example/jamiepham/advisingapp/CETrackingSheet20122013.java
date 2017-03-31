package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CETrackingSheet20122013 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cetracking_sheet20122013);

        Button backtoCETrackingSheets = (Button) findViewById(R.id.toCISTrackingSheets);
        backtoCETrackingSheets.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CETrackingSheet20122013.this, CETrackingSheets.class);
                startActivity(intent);
            }
        });

    }
}
