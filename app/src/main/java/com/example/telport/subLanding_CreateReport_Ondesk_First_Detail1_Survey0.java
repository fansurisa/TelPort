package com.example.telport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class subLanding_CreateReport_Ondesk_First_Detail1_Survey0 extends AppCompatActivity implements View.OnClickListener {

    Button btnSubmit, btnBack;
    CheckBox cb1, cb2, cb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_report_ondesk_first_detail1_survey0);

        btnBack = findViewById(R.id.btnBack);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnBack.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnBack:
                finish();
                break;
            case R.id.btnSubmit:
                if (!cb1.isChecked() && !cb2.isChecked() && !cb3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Please Check One of The Options", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Report Submitted", Toast.LENGTH_SHORT).show();
                    Intent goSubmit = new Intent(subLanding_CreateReport_Ondesk_First_Detail1_Survey0.this, A_mainLandingPage.class);
                    startActivity(goSubmit);
                    overridePendingTransition(R.anim.slide_in_bot, R.anim.slide_out_top); //ttb
                }
        }
    }
}
