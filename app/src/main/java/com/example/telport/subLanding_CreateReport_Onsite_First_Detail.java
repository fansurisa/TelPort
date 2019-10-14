package com.example.telport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class subLanding_CreateReport_Onsite_First_Detail extends AppCompatActivity implements View.OnClickListener {

    Spinner spinner;
    String spin[];
    EditText etNKD, etJCYT, etJCR, etJCI, etJSH, etJODPH;
    ImageButton ibtnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_report_onsite_first_detail);

        Button btnSubmit = findViewById(R.id.btnNext);
        btnSubmit.setOnClickListener(this);

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        ibtnCheck = findViewById(R.id.btnCheck);
        ibtnCheck.setOnClickListener(this);

        spinner = findViewById(R.id.spinner);
        spin = getResources().getStringArray(R.array.KKD);

        TextView secret = findViewById(R.id.tvHSD);

        secret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goNext = new Intent(subLanding_CreateReport_Onsite_First_Detail.this, subLanding_CreateReport_Onsite_First_Detail_CameraProof.class);
                startActivity(goNext);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
            }
        });

        etNKD = findViewById(R.id.etNKD);
        etJCYT = findViewById(R.id.etJCYT);
        etJCR = findViewById(R.id.etJCR);
        etJCI = findViewById(R.id.etJCI);
        etJSH = findViewById(R.id.etJSH);
        etJODPH = findViewById(R.id.etJODPH);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.KKD, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.85F);

        switch (v.getId()) {
            case R.id.btnCheck:
                v.startAnimation(buttonClick);
                Toast.makeText(getApplicationContext(), "Cable is Available", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBack:
                v.startAnimation(buttonClick);
                finish();
                break;
            case R.id.btnNext:
                v.startAnimation(buttonClick);
                String inputNKD = etNKD.getText().toString().trim();
                String inputJCYT = etJCYT.getText().toString().trim();
                String inputJCR = etJCR.getText().toString().trim();
                String inputJCI = etJCI.getText().toString().trim();
                String inputJSH = etJSH.getText().toString().trim();
                String inputJODPH = etJODPH.getText().toString().trim();

                if (inputNKD.isEmpty()) {
                    etNKD.setError("Field can't be empty.");
                    etNKD.requestFocus();
                } else if (inputJCYT.isEmpty()) {
                    etJCYT.setError("Field can't be empty.");
                    etJCYT.requestFocus();
                } else if (inputJCR.isEmpty()) {
                    etJCR.setError("Field can't be empty.");
                    etJCR.requestFocus();
                } else if (inputJCI.isEmpty()) {
                    etJCI.setError("Field can't be empty.");
                    etJCI.requestFocus();
                } else if (inputJSH.isEmpty()) {
                    etJSH.setError("Field can't be empty.");
                    etJSH.requestFocus();
                } else if (inputJODPH.isEmpty()) {
                    etJODPH.setError("Field can't be empty.");
                    etJODPH.requestFocus();
                } else {
                    Intent goNext = new Intent(subLanding_CreateReport_Onsite_First_Detail.this, subLanding_CreateReport_Onsite_First_Detail_CameraProof.class);
                    startActivity(goNext);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                }
                break;
        }

    }
}
