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
import com.ads.adcalculator.databinding.FragmentVideoBinding;
import com.ads.adcalculator.screens.video.CPCVActivity;
import com.ads.adcalculator.screens.video.CPMVideoActivity;
import com.ads.adcalculator.screens.video.CVActivity;
import com.ads.adcalculator.screens.video.ImpressionActivity;
import com.ads.adcalculator.screens.video.VTRActivity;


public class VideoFragment extends Fragment {

    private FragmentVideoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentVideoBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupViews();
    }

    private void setupViews(){
        binding.cpcvVideoBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), CPCVActivity.class));
        });

        binding.cvVideoBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), CVActivity.class));
        });

        binding.vtrVideoBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), VTRActivity.class));
        });
        binding.impressionsVideoBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), ImpressionActivity.class));
        });

        binding.cpmVideoBtn.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), CPMVideoActivity.class));
        });
    }
}