package com.example.igutovdelivery;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FirstChatFragment extends Fragment {

    public FirstChatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_first_chat, container, false);
        ImageView back = v.findViewById(R.id.first_chat_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChatsFragment fragment = new ChatsFragment();
                ((MainActivity) requireActivity()).replaceFragment(fragment);
            }
        });

        return v;
    }
}