package com.example.telport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class subLanding_CreateReport_Ondesk_First extends AppCompatActivity implements View.OnClickListener {

    Spinner Spinner;
    String R1[], R2[], R3[], R4[], R5[], R6[], R7[];
    String getr1, getr2, getr3, getr4, getr5, getr6, getr7;
    String title1, title2, title3, title4, title5, title6, title7;
    Button btnSubmitReport;
    EditText etTicket, etNIKTeam, etSTO, etNKD;
    TextView title;
    RadioButton rBtn1, rBtn2, rBtnG;
    ImageButton ibtnCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_report_ondesk_first);

        etTicket = findViewById(R.id.etTicket);
        etNIKTeam = findViewById(R.id.etNIKTeam);
        etSTO = findViewById(R.id.etSTO);
        etNKD = findViewById(R.id.etNKD);
        Spinner = findViewById(R.id.spinner);
        title = findViewById(R.id.title2);

        rBtn1 = findViewById(R.id.rBtn1);
        rBtn2 = findViewById(R.id.rBtn2);

        ibtnCheck = findViewById(R.id.btnCheck);
        ibtnCheck.setOnClickListener(this);

        btnSubmitReport = findViewById(R.id.btnNext);
        btnSubmitReport.setOnClickListener(this);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {

            getr1 = (String) bundle.get("get1");
            getr2 = (String) bundle.get("get2");
            getr3 = (String) bundle.get("get3");
            getr4 = (String) bundle.get("get4");
            getr5 = (String) bundle.get("get5");
            getr6 = (String) bundle.get("get6");
            getr7 = (String) bundle.get("get7");

            title1 = (String) bundle.get("title1");
            title2 = (String) bundle.get("title2");
            title3 = (String) bundle.get("title3");
            title4 = (String) bundle.get("title4");
            title5 = (String) bundle.get("title5");
            title6 = (String) bundle.get("title6");
            title7 = (String) bundle.get("title7");


        }
//        setting array dropdown spinner
        if (getr1 != null && getr1.equals("r1")) {
            R1 = getResources().getStringArray(R.array.R1);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.R1, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            title.setText(title1);
            Spinner.setAdapter(adapter);
        } else if (getr2 != null && getr2.equals("r2")) {
            R2 = getResources().getStringArray(R.array.R2);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.R2, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            title.setText(title2);
            Spinner.setAdapter(adapter);
        } else if (getr3 != null && getr3.equals("r3")) {
            R3 = getResources().getStringArray(R.array.R3);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.R3, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            title.setText(title3);
            Spinner.setAdapter(adapter);
        } else if (getr4 != null && getr4.equals("r4")) {
            R4 = getResources().getStringArray(R.array.R4);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.R4, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            title.setText(title4);
            Spinner.setAdapter(adapter);
        } else if (getr5 != null && getr5.equals("r5")) {
            R5 = getResources().getStringArray(R.array.R5);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.R5, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            title.setText(title5);
            Spinner.setAdapter(adapter);
        } else if (getr6 != null && getr6.equals("r6")) {
            R6 = getResources().getStringArray(R.array.R6);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.R6, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            title.setText(title6);
            Spinner.setAdapter(adapter);
        } else if (getr7 != null && getr7.equals("r7")) {
            R7 = getResources().getStringArray(R.array.R7);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.R7, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            title.setText(title7);
            Spinner.setAdapter(adapter);
        }

        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rBtn1.isChecked()) {
                    Intent goFinishSubmit = new Intent(subLanding_CreateReport_Ondesk_First.this, subLanding_CreateReport_Ondesk_First_Detail1.class);
                    startActivity(goFinishSubmit);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                } else if (rBtn2.isChecked()) {
                    Intent goFinishSubmit = new Intent(subLanding_CreateReport_Ondesk_First.this, subLanding_CreateReport_Ondesk_First_Detail2.class);
                    startActivity(goFinishSubmit);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                }
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

            case R.id.btnNext:
                v.startAnimation(buttonClick);

                String ticketInput = etTicket.getText().toString().trim();
                String nikTeamInput = etNIKTeam.getText().toString().trim();
                String stoInput = etSTO.getText().toString().trim();

                if (ticketInput.isEmpty()) {
                    etTicket.setError("Field can't be empty.");
                    etTicket.requestFocus();
                } else if (!etTicket.getText().toString().contains("TC")) {
                    etTicket.setError("Check the format example.");
                    etTicket.requestFocus();
                } else if (!(etTicket.getText().toString().length() == 8)) {
                    etTicket.setError("Should be 8 digit.");
                    etTicket.requestFocus();
                } else if (nikTeamInput.isEmpty()) {
                    etNIKTeam.setError("Field can't be empty.");
                    etNIKTeam.requestFocus();
                } else if (!(etNIKTeam.getText().toString().length() >= 6)) {
                    etNIKTeam.setError("Should be 6 to 9 digit.");
                    etNIKTeam.requestFocus();
                } else if (!(etNIKTeam.getText().toString().length() <= 9)) {
                    etNIKTeam.setError("Should be 6 to 9 digit.");
                    etNIKTeam.requestFocus();
                } else if (stoInput.isEmpty()) {
                    etSTO.setError("Field can't be empty.");
                    etSTO.requestFocus();
                } else if (!(etSTO.getText().toString().length() == 3)) {
                    etSTO.setError("Should be 3 digit.");
                    etSTO.requestFocus();
                } else if (rBtn1.isChecked()) {
                    Intent goFinishSubmit = new Intent(subLanding_CreateReport_Ondesk_First.this, subLanding_CreateReport_Ondesk_First_Detail1.class);
                    startActivity(goFinishSubmit);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                } else if (rBtn2.isChecked()) {
                    Intent goFinishSubmit = new Intent(subLanding_CreateReport_Ondesk_First.this, subLanding_CreateReport_Ondesk_First_Detail2.class);
                    startActivity(goFinishSubmit);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl

                }
        }

    }

    @Override
    public void onBackPressed() {
        Intent goBack = new Intent(subLanding_CreateReport_Ondesk_First.this, subLanding_CreateReport_Ondesk.class);
        startActivity(goBack);
        finish();
    }
}


