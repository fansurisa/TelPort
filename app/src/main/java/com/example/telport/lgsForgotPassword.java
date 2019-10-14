package com.example.telport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class lgsForgotPassword extends AppCompatActivity implements View.OnClickListener {
    Button btnResetPassword;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        btnResetPassword = findViewById(R.id.btnResetPassword);
        btnResetPassword.setOnClickListener(this);
        
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        

    }

    @Override
    public void onBackPressed() {
        Intent goToBack = new Intent(this, lgsLoginScreen.class);
        startActivity(goToBack);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
    }

    @Override
    public void onClick(View view) {
        Intent goToBack = new Intent(this, lgsLoginScreen.class);
        switch (view.getId()) {
            case R.id.btnResetPassword:
                startActivity(goToBack);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                finish();
                break;
            case R.id.tv1:
                Toast.makeText(this, "Verification Sent", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv2:
                Toast.makeText(this, "Verification Successful", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
