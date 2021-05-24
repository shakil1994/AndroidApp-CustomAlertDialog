package com.dma.tamim.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.dma.tamim.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class RatingFragment extends BottomSheetDialogFragment {

    ImageView imgClose;

    public RatingFragment() {
        // Required empty public constructor
    }

    private static RatingFragment instance;

    public static RatingFragment getInstance() {
        if (instance == null) {
            instance = new RatingFragment();
        }
        return instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_rating, container, false);

        imgClose = rootView.findViewById(R.id.imgClose);

        return rootView;
    }
}