package com.example.igutovdelivery;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class CardFragment extends Fragment {


    public CardFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_card, container, false);

        ImageView back = v.findViewById(R.id.back_card);

        //пр нажатии на иконку стрелки раздуваем предыдущий фрагмент

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