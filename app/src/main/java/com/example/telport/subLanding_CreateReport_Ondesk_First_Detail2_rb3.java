package com.example.telport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class subLanding_CreateReport_Ondesk_First_Detail2_rb3 extends AppCompatActivity implements View.OnClickListener {

    Button btnBack, btnSubmit;
    EditText etJODP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_report_ondesk_first_detail2_rb3);

        etJODP = findViewById(R.id.etJODP);

        btnBack = findViewById(R.id.btnBack);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnBack.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.85F);
        switch (view.getId()) {
            case R.id.btnBack:
                view.startAnimation(buttonClick);
                finish();
                break;
            case R.id.btnSubmit:
                view.startAnimation(buttonClick);
                String inputJSD = etJODP.getText().toString().trim();
                if (inputJSD.isEmpty()) {
                    etJODP.setError("Field can't be empty.");
                    etJODP.requestFocus();
                } else {
                    Toast.makeText(getApplicationContext(), "Report Submitted", Toast.LENGTH_SHORT).show();
                    Intent goToSubmit = new Intent(this, A_mainLandingPage.class);
                    startActivity(goToSubmit);
                    overridePendingTransition(R.anim.slide_in_bot, R.anim.slide_out_top); //ttb
                }
                break;
        }
    }
}
