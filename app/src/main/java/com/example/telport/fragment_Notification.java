package com.example.telport;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.example.telport.R;

import java.util.zip.Inflater;

public class fragment_Notification extends Fragment implements View.OnClickListener {

    public fragment_Notification() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_notification, container, false);

        LinearLayout layout1 = v.findViewById(R.id.layout1);
        LinearLayout layout2 = v.findViewById(R.id.layout2);
        LinearLayout layout3 = v.findViewById(R.id.layout3);
        LinearLayout layout4 = v.findViewById(R.id.layout4);

        layout1.setOnClickListener(this);
        layout2.setOnClickListener(this);
        layout3.setOnClickListener(this);
        layout4.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.layout1:
            case R.id.layout2:
            case R.id.layout3:
            case R.id.layout4:
                Intent goToReport = new Intent(getActivity(), subLanding_ViewReport_DetailViewReport.class);
                startActivity(goToReport);
                break;
        }
    }
}

