package com.example.igutovdelivery;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //если пользователь впервые запустил приложение, то вызываем экран адаптации Onboarding, если нет, то запоминаем данные в кэше


        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("isFirstLaunch", false);
        editor.apply();

        replaceFragment(new HomeFragment());

        bottomNavigationView = findViewById(R.id.bottomNavigationView);



        //прослушиваем нажимаемые элементы bottom navigation view

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int menuItemId =  item.getItemId();

                if (menuItemId ==  R.id.home) {
                    replaceFragment(new HomeFragment());
                    return true;
                }
                else if (menuItemId ==  R.id.wallet) {
                    replaceFragment(new WalletFragment());
                    return true;
                }
                else if (menuItemId ==  R.id.track) {
                    replaceFragment(new TrackFragment());
                    return true;
                }
                else if (menuItemId ==  R.id.profile) {
                    replaceFragment(new ProfileFragment());
                    return true;
                }


                return true;
            }
        });


    }


    //функция для замены раздуваемых фрагментов

    public  void replaceFragment (Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.MainFragment, fragment).commit();



    }

}

