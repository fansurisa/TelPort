package com.example.telport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.RadioButton;

public class subLanding_CreateReport_Ondesk_First_Detail2 extends AppCompatActivity implements View.OnClickListener {


    Button btnNext, btnBack;
    RadioButton rb1, rb2, rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_report_ondesk_first_detail2);

        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.85F);
        switch (view.getId()) {
            case R.id.btnBack:
                view.startAnimation(buttonClick);
                finish();
                break;
            case R.id.btnNext:
                view.startAnimation(buttonClick);
                if (rb1.isChecked()) {
                    Intent goToRb1 = new Intent(this, subLanding_CreateReport_Ondesk_First_Detail2_rb1.class);
                    startActivity(goToRb1);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                } else if (rb2.isChecked()) {
                    Intent goToRb2 = new Intent(this, subLanding_CreateReport_Ondesk_First_Detail2_rb2.class);
                    startActivity(goToRb2);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                } else if (rb3.isChecked()) {
                    Intent goToRb3 = new Intent(this, subLanding_CreateReport_Ondesk_First_Detail2_rb3.class);
                    startActivity(goToRb3);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                }
                break;
        }

    }
}
