package com.example.telport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class subLanding_ViewReport extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_view_report);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        LinearLayout LLbtn1 = findViewById(R.id.layout1);
        LLbtn1.setOnClickListener(this);

        LinearLayout LLbtn2 = findViewById(R.id.layout2);
        LLbtn2.setOnClickListener(this);

        LinearLayout LLbtn3 = findViewById(R.id.layout3);
        LLbtn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent goToDetail1 = new Intent(subLanding_ViewReport.this, subLanding_ViewReport_DetailViewReport.class);
        switch (v.getId()) {
            case R.id.layout1:
            case R.id.layout2:
            case R.id.layout3:
                startActivity(goToDetail1);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
