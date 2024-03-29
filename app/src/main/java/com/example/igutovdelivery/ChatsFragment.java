package com.example.igutovdelivery;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ChatsFragment extends Fragment {

    public ChatsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_chats, container, false);

        ImageView back = v.findViewById(R.id.chats_back);
        ConstraintLayout firstChat = v.findViewById(R.id.first_chats_layout);

        firstChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirstChatFragment fragment = new FirstChatFragment();
                ((MainActivity) requireActivity()).replaceFragment(fragment);
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeFragment fragment = new HomeFragment();
                ((MainActivity) requireActivity()).replaceFragment(fragment);
            }
        });

        return v;
    }
}