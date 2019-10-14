package com.example.telport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class subLanding_CreateReport_Ondesk_First_Detail2_rb2 extends AppCompatActivity implements View.OnClickListener {
    Button btnSubmit, btnBack;
    Spinner spinner1;
    String spin1[];
    EditText etJSD, etJCYT, etJCI, etJCIB, etJSDC, etJSDG, etJSKD, etJDPU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_report_ondesk_first_detail2_rb2);


        etJSD = findViewById(R.id.etJSD);
        etJCYT = findViewById(R.id.etJCYT);
        etJCI = findViewById(R.id.etJCI);
        etJCIB = findViewById(R.id.etJCIB);
        etJSDC = findViewById(R.id.etJSDC);
        etJSDG = findViewById(R.id.etJSDG);
        etJSKD = findViewById(R.id.etJSKD);
        etJDPU = findViewById(R.id.etJDPU);

        btnBack = findViewById(R.id.btnBack);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnBack.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);

        spinner1 = findViewById(R.id.spinner);
        spin1 = getResources().getStringArray(R.array.KKD);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.KKD, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

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

                String inputJSD = etJSD.getText().toString().trim();
                String inputJCYT = etJCYT.getText().toString().trim();
                String inputJCI = etJCI.getText().toString().trim();
                String inputJCIB = etJCIB.getText().toString().trim();
                String inputJSDC = etJSDC.getText().toString().trim();
                String inputJSDG = etJSDG.getText().toString().trim();
                String inputJSKD = etJSKD.getText().toString().trim();
                String inputJDPU = etJDPU.getText().toString().trim();

                if (inputJSD.isEmpty()) {
                    etJSD.setError("Field can't be empty.");
                    etJSD.requestFocus();
                } else if (inputJCYT.isEmpty()) {
                    etJCYT.setError("Field can't be empty.");
                    etJCYT.requestFocus();
                } else if (inputJCI.isEmpty()) {
                    etJCI.setError("Field can't be empty.");
                    etJCI.requestFocus();
                } else if (inputJCIB.isEmpty()) {
                    etJCIB.setError("Field can't be empty.");
                    etJCIB.requestFocus();
                } else if (inputJSDC.isEmpty()) {
                    etJSDC.setError("Field can't be empty.");
                    etJSDC.requestFocus();
                } else if (inputJSDG.isEmpty()) {
                    etJSDG.setError("Field can't be empty.");
                    etJSDG.requestFocus();
                } else if (inputJSKD.isEmpty()) {
                    etJSKD.setError("Field can't be empty.");
                    etJSKD.requestFocus();
                } else if (inputJDPU.isEmpty()) {
                    etJDPU.setError("Field can't be empty.");
                    etJDPU.requestFocus();
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
