package com.muhammadandmustafa.khadamat.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.muhammadandmustafa.khadamat.Activities.PlumbingStoresActivity;
import com.muhammadandmustafa.khadamat.R;

public class SellersFragment extends Fragment {

    private View rootView;
    private ImageView plumbing;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_sellers, container, false);

        plumbing = rootView.findViewById(R.id.plumbing);
        plumbing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), PlumbingStoresActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
