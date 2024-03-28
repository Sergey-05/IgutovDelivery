package com.example.igutovdelivery;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class WalletFragment extends Fragment {

    public WalletFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        View v = inflater.inflate(R.layout.fragment_wallet, container, false);

        //получаем id кнопки и textview для скрытия баланса

        ImageView toggle = v.findViewById(R.id.toggle_hide_balance_wallet);
        TextView balanceHide = v.findViewById(R.id.hide_balance_wallet);
        TextView visibleBalance = v.findViewById(R.id.visible_balance_wallet);


        //при нажатии на иконку баланс скрывается/отображается

        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (balanceHide.getVisibility() == View.GONE){
                    balanceHide.setVisibility(View.VISIBLE);
                    visibleBalance.setVisibility(View.GONE);
                    toggle.setImageResource(R.drawable.eye);
                }else{
                    balanceHide.setVisibility(View.GONE);
                    visibleBalance.setVisibility(View.VISIBLE);
                    toggle.setImageResource(R.drawable.eyeslash);
                }
            }
        });


        return v;
    }
}