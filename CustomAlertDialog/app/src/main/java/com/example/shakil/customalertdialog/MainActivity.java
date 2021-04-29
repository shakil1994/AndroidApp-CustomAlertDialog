package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.shakil.customalertdialog.CustomDialogFragment.CongratulationCustomAlertDialogFragment;
import com.example.shakil.customalertdialog.CustomDialogFragment.CustomAlertDialogFragment;
import com.example.shakil.customalertdialog.CustomDialogFragment.ServiceCustomAlertDialogFragment;

import fr.tvbarthel.lib.blurdialogfragment.BlurDialogFragment;

public class MainActivity extends AppCompatActivity {

    Button btnShowDialog1, btnShowDialog2, btnShowDialog3, btnNextActivity;

    Dialog dialog1, dialog2, dialog3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowDialog1 = findViewById(R.id.btnShowDialog1);
        btnShowDialog2 = findViewById(R.id.btnShowDialog2);
        btnShowDialog3 = findViewById(R.id.btnShowDialog3);
        btnNextActivity = findViewById(R.id.btnNextActivity);

        btnNextActivity.setOnClickListener(v -> {
            startActivity(new Intent(this, HomeActivity.class));
        });

        btnShowDialog1.setOnClickListener(v -> {
            CustomAlertDialogFragment customAlertDialogFragment = new CustomAlertDialogFragment();
            customAlertDialogFragment.show(getSupportFragmentManager(), customAlertDialogFragment.getClass().getSimpleName());
            /*dialog1 = new Dialog(this);
            dialog1.setContentView(R.layout.custom_alert_dialog);
            dialog1.getWindow().setBackgroundDrawable(getResources().getDrawable(R.drawable.dialog_background));
            dialog1.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog1.setCancelable(true);
            dialog1.show();*/
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