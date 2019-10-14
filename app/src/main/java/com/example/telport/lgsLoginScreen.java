package com.example.telport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class lgsLoginScreen extends AppCompatActivity implements View.OnClickListener {
    EditText username, password;
    Button btnLogin;
    TextView tvFP, tvCNA;
    ImageView imageView;
    String usernameKey, passwordKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

        tvFP = findViewById(R.id.tvForgotPassword);
        tvCNA = findViewById(R.id.tvCreateNewAccount);
        tvFP.setOnClickListener(this);
        tvCNA.setOnClickListener(this);

        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(this);

        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
    }

    @Override
    public void onClick(View view) {
        final TextView tvFP = findViewById(R.id.tvForgotPassword);
        final TextView tvCNA = findViewById(R.id.tvCreateNewAccount);

        usernameKey = username.getText().toString();
        passwordKey = password.getText().toString();

        AlphaAnimation buttonClick = new AlphaAnimation(1F,0.85F);

        switch (view.getId()) {
            case R.id.tvForgotPassword:
                Intent goFP = new Intent(lgsLoginScreen.this, lgsForgotPassword.class);
                lgsLoginScreen.this.startActivity(goFP);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right); //ltr
                finish();
                break;

            case R.id.tvCreateNewAccount:
                Intent goCNA = new Intent(lgsLoginScreen.this, lgsCreateNewAccount.class);
                lgsLoginScreen.this.startActivity(goCNA);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); //rtl
                finish();
                break;

            case R.id.btnLogin:
                view.startAnimation(buttonClick);
                usernameKey = username.getText().toString();
                passwordKey = password.getText().toString();

                if (usernameKey.equals("admin") && passwordKey.equals("123")) {
                    //login successful
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(lgsLoginScreen.this, A_mainLandingPage.class);
                    lgsLoginScreen.this.startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_bot, R.anim.slide_out_top); //ttb
                    finish();
                } else {
                    //login failed
                    AlertDialog.Builder builder = new AlertDialog.Builder(lgsLoginScreen.this);
                    builder.setMessage("Username or Password Invalid!")
                            .setNegativeButton("Retry", null).create().show();
                }
                break;

            case R.id.imageView:
                Toast.makeText(getApplicationContext(), "Login With Secret passage", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(lgsLoginScreen.this, A_mainLandingPage.class);
                lgsLoginScreen.this.startActivity(intent);
                overridePendingTransition(R.anim.slide_in_bot, R.anim.slide_out_top); //ttb
                finish();
                break;
        }
    }

    @Override
    public void onBackPressed() {
// super.onBackPressed();
// Not calling **super**, disables back button in current screen.
    }
}
