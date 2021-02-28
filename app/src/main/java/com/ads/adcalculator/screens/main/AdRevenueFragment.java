package com.ads.adcalculator.screens.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ads.adcalculator.R;
import com.ads.adcalculator.databinding.FragmentAdRevenueBinding;
import com.ads.adcalculator.screens.adRevenue.AdsenseActivity;
import com.ads.adcalculator.screens.adRevenue.CPAActivity;
import com.ads.adcalculator.screens.adRevenue.CPCActivity;
import com.ads.adcalculator.screens.adRevenue.CPCTrafficBuyActivity;
import com.ads.adcalculator.screens.adRevenue.CPIActivity;
import com.ads.adcalculator.screens.adRevenue.CPMActivity;
import com.ads.adcalculator.screens.adRevenue.CTRActivity;
import com.ads.adcalculator.screens.adRevenue.EcpmActivity;
import com.ads.adcalculator.screens.adRevenue.PercentageActivity;
import com.ads.adcalculator.screens.adRevenue.ROIActivity;
import com.ads.adcalculator.screens.adRevenue.RevenueActivity;


public class AdRevenueFragment extends Fragment {

    private FragmentAdRevenueBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentAdRevenueBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setupViews();

    }
    private void setupViews(){
        binding.cpmCalculateBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), CPMActivity.class));
        });

        binding.cpcCalculateBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), CPCActivity.class));
        });

        binding.ctrCalculateBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), CTRActivity.class));
        });

        binding.cpiCalculateBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), CPIActivity.class));
        });

        binding.cpaCalculateBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), CPAActivity.class));
        });

        binding.ecpmCalculateBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), EcpmActivity.class));
        });

        binding.cpcFromCpmCalculateBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), CPCTrafficBuyActivity.class));
        });

        binding.cpmFromCpcCalculateBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), ROIActivity.class));
        });

        binding.revCalculateBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), RevenueActivity.class));
        });

        binding.adsenseCalculateBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), AdsenseActivity.class));
        });

        binding.percentageCalculateBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), PercentageActivity.class));
        });
    }
}