package com.dma.tamim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    TextView txtChangeLanguage;
    Button btnNextActivity;
    AppCompatButton btnRatingAndReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRatingAndReview = findViewById(R.id.btnRatingAndReview);

        btnNextActivity = findViewById(R.id.btnNextActivity);
        txtChangeLanguage = findViewById(R.id.txtChangeLanguage);
        toggleButton = findViewById(R.id.toggleButton);
        txtChangeLanguage.setText("Hello Bangladesh");

        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                txtChangeLanguage.setText("مرحبًا بنجلاديش");
            } else {
                txtChangeLanguage.setText("Hello Bangladesh");
            }
        });

        btnNextActivity.setOnClickListener(v -> {
            startActivity(new Intent(this, MansionWeddingActivity.class));
        });

        btnRatingAndReview.setOnClickListener(v -> {
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this, R.style.BottomSheetDialogTheme);
            View bottomSheetView = LayoutInflater.from(this).inflate(R.layout.layout_rating_item, findViewById(R.id.bottomSheetRatingView));

            bottomSheetView.findViewById(R.id.imgClose).setOnClickListener(v12 -> bottomSheetDialog.dismiss());
            bottomSheetDialog.setContentView(bottomSheetView);
            bottomSheetDialog.show();
        });
    }
}