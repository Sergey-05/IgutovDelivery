package com.example.igutovdelivery;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ProfileFragment extends Fragment {
    public ProfileFragment() {
        // Required empty public constructor



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final int TAKE_AVATAR_CAMERA_REQUEST = 24;
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        ImageView toggle = v.findViewById(R.id.toggle_hide_balance);
        TextView balanceHide = v.findViewById(R.id.hide_balance);
        TextView visibleBalance = v.findViewById(R.id.visible_balance);


        ImageView ava = v.findViewById(R.id.profileAvatar);



//        ava.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String strAvatarPrompt = "test photo";
//                Intent pictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                startActivityForResult(Intent.createChooser(pictureIntent, strAvatarPrompt), TAKE_AVATAR_CAMERA_REQUEST);
//            }
//        });

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

        //замена фрагмента на экран уведомлений через вызов функции replace_fragment из mainactivity

        RelativeLayout notific = v.findViewById(R.id.notific_profil);
        notific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificFragment notificFragment = new NotificFragment();
                ((MainActivity) requireActivity()).replaceFragment(notificFragment);
            }
        });


        RelativeLayout card = v.findViewById(R.id.card_profil);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CardFragment fragment = new CardFragment();
                ((MainActivity) requireActivity()).replaceFragment(fragment);
            }
        });


        return  v;



    }
}


