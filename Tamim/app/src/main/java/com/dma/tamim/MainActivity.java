package com.dma.tamim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    TextView txtChangeLanguage;
    Button btnNextActivity;
    AppCompatButton btnRatingAndReview, btnAlertActivity, btnMenuItemActivity, btnBottomSheetNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRatingAndReview = findViewById(R.id.btnRatingAndReview);
        btnAlertActivity = findViewById(R.id.btnAlertActivity);
        btnMenuItemActivity = findViewById(R.id.btnMenuItemActivity);
        btnBottomSheetNew = findViewById(R.id.btnBottomSheetNew);

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

        btnAlertActivity.setOnClickListener(v -> {
            startActivity(new Intent(this, AlertActivity.class));
        });

        btnMenuItemActivity.setOnClickListener(v -> {
            startActivity(new Intent(this, MenuItemActivity.class));
        });

        btnBottomSheetNew.setOnClickListener(v -> {
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this, R.style.BottomSheetDialogTheme);
            View bottomSheetView = LayoutInflater.from(this).inflate(R.layout.layout_product_details, findViewById(R.id.bottomSheetContainer));

            Spinner spinner = bottomSheetView.findViewById(R.id.spinner);

            ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.names));
            myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(myAdapter);

            bottomSheetDialog.setContentView(bottomSheetView);
            bottomSheetDialog.show();
        });
    }
}