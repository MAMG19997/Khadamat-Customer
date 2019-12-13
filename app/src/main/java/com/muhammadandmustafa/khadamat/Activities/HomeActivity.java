package com.muhammadandmustafa.khadamat.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.muhammadandmustafa.khadamat.Fragments.FinishingFragment;
import com.muhammadandmustafa.khadamat.Fragments.FixersFragment;
import com.muhammadandmustafa.khadamat.Fragments.MoreFragment;
import com.muhammadandmustafa.khadamat.Fragments.ProfileFragment;
import com.muhammadandmustafa.khadamat.Fragments.SellersFragment;
import com.muhammadandmustafa.khadamat.R;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView bottom_navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FixersFragment()).commit();

        bottom_navigation = findViewById(R.id.bottom_navigation);
        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                Fragment selectedFragment = null;

                switch (menuItem.getItemId()){
                    case R.id.nav_bar_fixers:
                        selectedFragment = new FixersFragment();
                        break;
                    case R.id.nav_bar_sellers:
                        selectedFragment = new SellersFragment();
                        break;
                    case R.id.nav_bar_finishing:
                        selectedFragment = new FinishingFragment();
                        break;
                    case R.id.nav_bar_profile:
                        selectedFragment = new ProfileFragment();
                        break;
                    case R.id.nav_bar_more:
                        selectedFragment = new MoreFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                return true;
            }
        });


    }
}
