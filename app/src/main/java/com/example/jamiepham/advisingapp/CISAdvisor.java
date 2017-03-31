package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CISAdvisor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cisadvisor);

        Button BackToCoopAdvisor = (Button) findViewById(R.id.BackToCoopAdvisor);
        BackToCoopAdvisor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CISAdvisor.this, CoopAdvisors.class);
                startActivity(intent);
            }
        });
    }
}