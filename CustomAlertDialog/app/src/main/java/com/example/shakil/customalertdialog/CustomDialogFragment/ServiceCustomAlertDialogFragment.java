package com.example.shakil.customalertdialog.CustomDialogFragment;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;

import com.example.shakil.customalertdialog.R;

import fr.tvbarthel.lib.blurdialogfragment.SupportBlurDialogFragment;

public class ServiceCustomAlertDialogFragment extends SupportBlurDialogFragment {

    AppCompatButton btnSure, btnCancel;

    public ServiceCustomAlertDialogFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_service_custom_alert_dialog, container, false);

        if (getDialog() != null && getDialog().getWindow() != null) {
            getDialog().getWindow().setBackgroundDrawable(getResources().getDrawable(R.drawable.dialog_background));
            getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        }

        btnSure = view.findViewById(R.id.btnSure);
        btnCancel = view.findViewById(R.id.btnCancel);

        btnSure.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "Sure", Toast.LENGTH_SHORT).show();
            dismiss();
        });

        return view;
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