package com.example.telport;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class subLanding_CreateReport_Ondesk_First_Detail1 extends AppCompatActivity implements View.OnClickListener {

    Spinner spinner1, spinner2;
    String spin1[], spin2[];
    EditText etJSD, etJCYT, etJCI, etJCIB, etJSDC, etJSDG, etJSKD, etJDPU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_report_ondesk_first_detail1);

        Button btnSubmit = findViewById(R.id.btnNext);
        btnSubmit.setOnClickListener(this);

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        TextView secret = findViewById(R.id.tvHSD);

        secret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer indexValue = spinner2.getSelectedItemPosition();
//                String dv = indexValue.toString();
                if (indexValue.equals(0)) {
                    Intent goNext = new Intent(subLanding_CreateReport_Ondesk_First_Detail1.this, subLanding_CreateReport_Ondesk_First_Detail1_Survey0.class);
                    startActivity(goNext);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                } else if (indexValue.equals(1)) {
                    Toast.makeText(getApplicationContext(), "Report Submitted", Toast.LENGTH_SHORT).show();
                    Intent goNext = new Intent(subLanding_CreateReport_Ondesk_First_Detail1.this, A_mainLandingPage.class);
                    startActivity(goNext);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                }
            }
        });

        etJSD = findViewById(R.id.etJSD);
        etJCYT = findViewById(R.id.etJCYT);
        etJCI = findViewById(R.id.etJCI);
        etJCIB = findViewById(R.id.etJCIB);
        etJSDC = findViewById(R.id.etJSDC);
        etJSDG = findViewById(R.id.etJSDG);
        etJSKD = findViewById(R.id.etJSKD);
        etJDPU = findViewById(R.id.etJDPU);

        spinner1 = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        spin1 = getResources().getStringArray(R.array.KKD);
        spin2 = getResources().getStringArray(R.array.Survey);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.KKD, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.Survey, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

    }

    @Override
    public void onClick(View v) {
        AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.85F);

        switch (v.getId()) {
            case R.id.btnBack:
                v.startAnimation(buttonClick);
                finish();
                break;

            case R.id.btnNext:
                v.startAnimation(buttonClick);

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
                    Integer indexValue = spinner2.getSelectedItemPosition();
                    if (indexValue.equals(0)) {
                        Intent goNext = new Intent(subLanding_CreateReport_Ondesk_First_Detail1.this, subLanding_CreateReport_Ondesk_First_Detail1_Survey0.class);
                        startActivity(goNext);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                    } else if (indexValue.equals(1)) {
                        Toast.makeText(getApplicationContext(), "Report Submitted", Toast.LENGTH_SHORT).show();
                        Intent goNext = new Intent(subLanding_CreateReport_Ondesk_First_Detail1.this, A_mainLandingPage.class);
                        startActivity(goNext);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                    }

                }
        }
    }
}
