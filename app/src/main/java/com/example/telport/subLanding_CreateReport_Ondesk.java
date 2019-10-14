package com.example.telport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class subLanding_CreateReport_Ondesk extends AppCompatActivity implements View.OnClickListener {
    Button r1, r2, r3, r4, r5, r6, r7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_report_ondesk);

        r1 = findViewById(R.id.R1);
        r2 = findViewById(R.id.R2);
        r3 = findViewById(R.id.R3);
        r4 = findViewById(R.id.R4);
        r5 = findViewById(R.id.R5);
        r6 = findViewById(R.id.R6);
        r7 = findViewById(R.id.R7);

        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
        r4.setOnClickListener(this);
        r5.setOnClickListener(this);
        r6.setOnClickListener(this);
        r7.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.85F);
        switch (view.getId()) {
            case R.id.R1:
                view.startAnimation(buttonClick);
                Intent goToR1 = new Intent(subLanding_CreateReport_Ondesk.this, subLanding_CreateReport_Ondesk_First.class);
                String extra = "r1";
                goToR1.putExtra("get1", extra);
                String title1 = "Regional 1";
                goToR1.putExtra("title1", title1);
                startActivity(goToR1);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                finish();
                break;
            case R.id.R2:
                view.startAnimation(buttonClick);
                Intent goToR2 = new Intent(subLanding_CreateReport_Ondesk.this, subLanding_CreateReport_Ondesk_First.class);
                String extra2 = "r2";
                goToR2.putExtra("get2", extra2);
                String title2 = "Regional 2";
                goToR2.putExtra("title2", title2);
                startActivity(goToR2);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                finish();
                break;
            case R.id.R3:
                view.startAnimation(buttonClick);
                Intent goToR3 = new Intent(subLanding_CreateReport_Ondesk.this, subLanding_CreateReport_Ondesk_First.class);
                String extra3 = "r3";
                goToR3.putExtra("get3", extra3);
                String title3 = "Regional 3";
                goToR3.putExtra("title3", title3);
                startActivity(goToR3);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                finish();
                break;
            case R.id.R4:
                view.startAnimation(buttonClick);
                Intent goToR4 = new Intent(subLanding_CreateReport_Ondesk.this, subLanding_CreateReport_Ondesk_First.class);
                String extra4 = "r4";
                goToR4.putExtra("get4", extra4);
                String title4 = "Regional 4";
                goToR4.putExtra("title4", title4);
                startActivity(goToR4);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                finish();
                break;
            case R.id.R5:
                view.startAnimation(buttonClick);
                Intent goToR5 = new Intent(subLanding_CreateReport_Ondesk.this, subLanding_CreateReport_Ondesk_First.class);
                String extra5 = "r5";
                goToR5.putExtra("get5", extra5);
                String title5 = "Regional 5";
                goToR5.putExtra("title5", title5);
                startActivity(goToR5);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                finish();
                break;
            case R.id.R6:
                view.startAnimation(buttonClick);
                Intent goToR6 = new Intent(subLanding_CreateReport_Ondesk.this, subLanding_CreateReport_Ondesk_First.class);
                String extra6 = "r6";
                goToR6.putExtra("get6", extra6);
                String title6 = "Regional 6";
                goToR6.putExtra("title6", title6);
                startActivity(goToR6);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                finish();
                break;
            case R.id.R7:
                view.startAnimation(buttonClick);
                Intent goToR7 = new Intent(subLanding_CreateReport_Ondesk.this, subLanding_CreateReport_Ondesk_First.class);
                String extra7 = "r7";
                goToR7.putExtra("get7", extra7);
                String title7 = "Regional 7";
                goToR7.putExtra("title7", title7);
                startActivity(goToR7);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                finish();
                break;
        }
    }
}
