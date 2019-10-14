package com.example.telport;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_Account extends Fragment {

    private Timer timer_interact = new Timer();

    public fragment_Account() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this

        View v = inflater.inflate(R.layout.fragment_account, container, false);

        final TextView LogOut = v.findViewById(R.id.tvLogOut);

        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.85F);
                view.startAnimation(buttonClick);
                Intent goLogOut = new Intent(getContext(), lgsLoginScreen.class);
                startActivity(goLogOut);
                getActivity().finish();
            }
        });
        return v;
    }


}
