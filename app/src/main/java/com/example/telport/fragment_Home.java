package com.example.telport;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_Home extends Fragment implements View.OnClickListener {


    public fragment_Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreate(savedInstanceState);

        View v = inflater.inflate(R.layout.fragment_home, container, false);

        CardView cvCreateReport = v.findViewById(R.id.cvCreateReport);
        CardView cvViewReport = v.findViewById(R.id.cvViewReport);
        CardView cvTransactionHistory = v.findViewById(R.id.cvTransactionHistory);

        cvCreateReport.setOnClickListener(this);
        cvViewReport.setOnClickListener(this);
        cvTransactionHistory.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.85F);

        switch (v.getId()) {
            case R.id.cvCreateReport:
                v.startAnimation(buttonClick);
                Intent goCreateReport = new Intent(getActivity(), subLanding_CreateReport_Choose.class);
                startActivity(goCreateReport);
                break;
            case R.id.cvViewReport:
                v.startAnimation(buttonClick);
                Intent goViewReport = new Intent(getActivity(), subLanding_ViewReport.class);
                startActivity(goViewReport);
                break;
            case R.id.cvTransactionHistory:
                v.startAnimation(buttonClick);
                Intent goTransactionHistory = new Intent(getActivity(), subLanding_TransactionHistory.class);
                startActivity(goTransactionHistory);
                break;
        }
    }
}

