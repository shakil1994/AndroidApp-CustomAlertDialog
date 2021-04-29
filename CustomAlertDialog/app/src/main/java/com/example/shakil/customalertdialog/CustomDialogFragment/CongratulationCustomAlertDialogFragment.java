package com.example.shakil.customalertdialog.CustomDialogFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shakil.customalertdialog.R;

import fr.tvbarthel.lib.blurdialogfragment.SupportBlurDialogFragment;

public class CongratulationCustomAlertDialogFragment extends SupportBlurDialogFragment {

    public CongratulationCustomAlertDialogFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_congratulation_custom_alert_dialog, container, false);
    }

    @Override
    protected float getDownScaleFactor() {
        // Allow to customize the down scale factor.
        return 4.0f;
    }

    @Override
    protected int getBlurRadius() {
        // Allow to customize the blur radius factor.
        return 8;
    }

    @Override
    protected boolean isDimmingEnable() {
        // Enable or disable the dimming effect.
        // Disabled by default.
        return true;
    }

    @Override
    protected boolean isDebugEnable() {
        // Enable or disable debug mode.
        // False by default.
        return false;
    }

    @Override
    protected boolean isRenderScriptEnable() {
        // Enable or disable the use of RenderScript for blurring effect
        // Disabled by default.
        return true;
    }
}