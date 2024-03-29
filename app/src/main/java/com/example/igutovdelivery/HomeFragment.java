package com.example.igutovdelivery;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home, container, false);
        LinearLayout customer = v.findViewById(R.id.customerBtn);

        LinearLayout wallet = v.findViewById(R.id.walletBtn);

        LinearLayout chats = v.findViewById(R.id.chatsBtn);
        chats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChatsFragment fragment = new ChatsFragment();
                ((MainActivity) requireActivity()).replaceFragment(fragment);
            }
        });

        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WalletFragment fragment = new WalletFragment();
                ((MainActivity) requireActivity()).replaceFragment(fragment);
            }
        });




        return v;
    }
}