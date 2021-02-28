package com.ads.adcalculator.screens.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ads.adcalculator.R;
import com.ads.adcalculator.databinding.ActivityMainBinding;
import com.chauthai.swipereveallayout.SwipeRevealLayout;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setupViews();

    }

    private void setupViews() {

        //set current mode light
        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_UNSPECIFIED){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }


        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_NO){
            binding.switchButton.setText("DARK");
        }
        else if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            binding.switchButton.setText("LIGHT");
        }

        //Dark mode button
        binding.switchButton.setOnClickListener(v -> {
            if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_NO){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
            else if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
        });


        //Standard mode button
        binding.standardModeBtn.setOnClickListener(v -> {
            binding.layoutAdRevenue.setVisibility(View.GONE);
            binding.layoutVideo.setVisibility(View.GONE);
            binding.dotAdRevenue.setVisibility(View.INVISIBLE);
            binding.dotVideo.setVisibility(View.INVISIBLE);
            binding.dotStandard.setVisibility(View.VISIBLE);
        });

        //Adrevenue mode button
        binding.adRevenueModeBtn.setOnClickListener(v -> {
            binding.layoutVideo.setVisibility(View.GONE);
            binding.layoutVideo.close(true);

            binding.layoutAdRevenue.open(true);

            binding.layoutAdRevenue.setVisibility(View.VISIBLE);

            binding.dotVideo.setVisibility(View.INVISIBLE);
            binding.dotStandard.setVisibility(View.INVISIBLE);
            binding.dotAdRevenue.setVisibility(View.VISIBLE);

        });

        //Video mode button
        binding.videoModeBtn.setOnClickListener(v -> {
            binding.layoutAdRevenue.close(true);
            binding.layoutAdRevenue.setVisibility(View.GONE);

            binding.layoutVideo.open(true);

            binding.layoutVideo.setVisibility(View.VISIBLE);


            binding.dotVideo.setVisibility(View.VISIBLE);
            binding.dotStandard.setVisibility(View.INVISIBLE);
            binding.dotAdRevenue.setVisibility(View.INVISIBLE);
        });


        binding.layoutAdRevenue.setSwipeListener(new SwipeRevealLayout.SwipeListener() {
            @Override
            public void onClosed(SwipeRevealLayout view) {
                binding.arrowAdRevenue.setImageResource(R.drawable.ic_open_arrow);
            }

            @Override
            public void onOpened(SwipeRevealLayout view) {
                binding.arrowAdRevenue.setImageResource(R.drawable.ic_close_arrow);
            }

            @Override
            public void onSlide(SwipeRevealLayout view, float slideOffset) {

            }
        });

        binding.layoutVideo.setSwipeListener(new SwipeRevealLayout.SwipeListener() {
            @Override
            public void onClosed(SwipeRevealLayout view) {
                binding.arrowVideo.setImageResource(R.drawable.ic_open_arrow);
            }

            @Override
            public void onOpened(SwipeRevealLayout view) {
                binding.arrowVideo.setImageResource(R.drawable.ic_close_arrow);
            }

            @Override
            public void onSlide(SwipeRevealLayout view, float slideOffset) {

            }
        });
    }
}