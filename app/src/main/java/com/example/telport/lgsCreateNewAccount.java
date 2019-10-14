package com.example.telport;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class lgsCreateNewAccount extends AppCompatActivity implements View.OnClickListener {

    TextView tvDontHaveCode;
    Button btnCNA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_account);

        btnCNA = findViewById(R.id.btnCNA);
        tvDontHaveCode = findViewById(R.id.tvDontHaveCode);

        tvDontHaveCode.setOnClickListener(this);
        btnCNA.setOnClickListener(this);


    }

    @Override
    public void onBackPressed() {
        Intent goToBack = new Intent(this, lgsLoginScreen.class);
        startActivity(goToBack);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right); //backward
    }

    @Override
    public void onClick(View view) {
        Intent goLogin = new Intent(lgsCreateNewAccount.this, lgsLoginScreen.class);
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));

        switch (view.getId()) {
            case R.id.btnCNA:
                startActivity(goLogin);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right); //swipefromright
                finish();
                break;

            case R.id.tvDontHaveCode:
                startActivity(browserIntent);
                overridePendingTransition(R.anim.slide_in_bot, R.anim.slide_out_top); //swipefromtop
                break;
        }

    }

}
