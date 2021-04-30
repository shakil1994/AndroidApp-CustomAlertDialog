package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.shakil.customalertdialog.CustomDialogFragment.CongratulationCustomAlertDialogFragment;
import com.example.shakil.customalertdialog.CustomDialogFragment.CustomAlertDialogFragment;
import com.example.shakil.customalertdialog.CustomDialogFragment.ServiceCustomAlertDialogFragment;

public class MainActivity extends AppCompatActivity {

    Button btnShowDialog1, btnShowDialog2, btnShowDialog3, btnNextActivity, ratingActivity, mapActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowDialog1 = findViewById(R.id.btnShowDialog1);
        btnShowDialog2 = findViewById(R.id.btnShowDialog2);
        btnShowDialog3 = findViewById(R.id.btnShowDialog3);
        btnNextActivity = findViewById(R.id.btnNextActivity);
        ratingActivity = findViewById(R.id.ratingActivity);
        mapActivity = findViewById(R.id.mapActivity);

        mapActivity.setOnClickListener(v -> {
            startActivity(new Intent(this, MapActivity.class));
        });

        ratingActivity.setOnClickListener(v -> {
            startActivity(new Intent(this, RatingActivity.class));
        });

        btnNextActivity.setOnClickListener(v -> {
            startActivity(new Intent(this, HomeActivity.class));
        });

        btnShowDialog1.setOnClickListener(v -> {
            CustomAlertDialogFragment customAlertDialogFragment = new CustomAlertDialogFragment();
            customAlertDialogFragment.show(getSupportFragmentManager(), customAlertDialogFragment.getClass().getSimpleName());
        });

        btnShowDialog2.setOnClickListener(v -> {
            CongratulationCustomAlertDialogFragment congratulationCustomAlertDialogFragment = new CongratulationCustomAlertDialogFragment();
            congratulationCustomAlertDialogFragment.show(getSupportFragmentManager(), congratulationCustomAlertDialogFragment.getClass().getSimpleName());
        });

        btnShowDialog3.setOnClickListener(v -> {
            ServiceCustomAlertDialogFragment serviceCustomAlertDialogFragment = new ServiceCustomAlertDialogFragment();
            serviceCustomAlertDialogFragment.show(getSupportFragmentManager(), serviceCustomAlertDialogFragment.getClass().getSimpleName());
        });
    }
}