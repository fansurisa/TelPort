package com.example.telport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;

public class subLanding_CreateReport_Choose extends AppCompatActivity implements View.OnClickListener {

    CardView ondesk, onsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_report_choose);

        ondesk = findViewById(R.id.cvOndesk);
        onsite = findViewById(R.id.cvOnsite);

        ondesk.setOnClickListener(this);
        onsite.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.85F);
        switch (view.getId()) {
            case R.id.cvOndesk:
                view.startAnimation(buttonClick);
                Intent goToOndesk = new Intent(subLanding_CreateReport_Choose.this, subLanding_CreateReport_Ondesk.class);
                startActivity(goToOndesk);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                break;
            case R.id.cvOnsite:
                view.startAnimation(buttonClick);
                Intent goToOnsite = new Intent(subLanding_CreateReport_Choose.this, subLanding_CreateReport_Onsite.class);
                startActivity(goToOnsite);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                break;
        }
    }
}
