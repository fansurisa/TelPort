package com.example.telport;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class A_mainLandingPage extends AppCompatActivity implements View.OnClickListener {
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;

            switch (menuItem.getItemId()) {
                case R.id.nav_Home:
                    selectedFragment = new fragment_Home();
                    break;
                    case R.id.nav_Notification:
                    selectedFragment = new fragment_Notification();
                    break;
                case R.id.nav_Account:
                    selectedFragment = new fragment_Account();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frame, selectedFragment).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landingpage);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new fragment_Home()).commit();
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    @Override
    public void onClick(View v) {
        AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.85F);

        switch (v.getId()) {
            case R.id.cvCreateReport:
                v.startAnimation(buttonClick);
                Intent goCreateReport = new Intent(A_mainLandingPage.this, subLanding_CreateReport_Onsite.class);
                A_mainLandingPage.this.startActivity(goCreateReport);
                break;
            case R.id.cvViewReport:
                v.startAnimation(buttonClick);
                Intent goViewReport = new Intent(A_mainLandingPage.this, subLanding_ViewReport.class);
                A_mainLandingPage.this.startActivity(goViewReport);
                break;
            case R.id.cvTransactionHistory:
                v.startAnimation(buttonClick);
                Intent goTransactionHistory = new Intent(A_mainLandingPage.this, subLanding_TransactionHistory.class);
                A_mainLandingPage.this.startActivity(goTransactionHistory);
                break;

        }
    }

}