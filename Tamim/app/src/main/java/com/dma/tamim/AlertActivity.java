package com.dma.tamim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

public class AlertActivity extends AppCompatActivity {

    AppCompatButton btnSuccessfullyAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        btnSuccessfullyAlert = findViewById(R.id.btnSuccessfullyAlert);
        btnSuccessfullyAlert.setOnClickListener(v -> {
            final Dialog dialog = new Dialog(this);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.layout_successfully_alert);
            dialog.getWindow().setBackgroundDrawable(getResources().getDrawable(R.drawable.dialog_background));

            ImageView imgClose = dialog.findViewById(R.id.imgClose);
            imgClose.setOnClickListener(v1 -> {
                dialog.dismiss();
            });

            dialog.show();
        });
    }
}