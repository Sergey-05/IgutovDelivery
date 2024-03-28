package com.example.igutovdelivery;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class NotificFragment extends Fragment {

    public NotificFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_notific, container, false);

        ImageView back = v.findViewById(R.id.back_notific);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProfileFragment fragment = new ProfileFragment();
                ((MainActivity) requireActivity()).replaceFragment(fragment);
            }
        });


        return v;
    }
}