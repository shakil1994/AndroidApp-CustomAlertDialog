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
            dialog1 = new Dialog(this);
            dialog1.setContentView(R.layout.custom_alert_dialog);
            dialog1.getWindow().setBackgroundDrawable(getResources().getDrawable(R.drawable.dialog_background));
            dialog1.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog1.setCancelable(true);
            dialog1.show();
        });

        btnShowDialog2.setOnClickListener(v -> {
            dialog2 = new Dialog(this);
            dialog2.setContentView(R.layout.congratulation_custom_alert_dialog);
            dialog2.getWindow().setBackgroundDrawable(getResources().getDrawable(R.drawable.dialog_background));
            dialog2.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog2.setCancelable(true);
            dialog2.show();
        });

        btnShowDialog3.setOnClickListener(v -> {
            dialog3 = new Dialog(this);
            dialog3.setContentView(R.layout.service_custom_alert_dialog);
            dialog3.getWindow().setBackgroundDrawable(getResources().getDrawable(R.drawable.dialog_background));
            dialog3.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog3.setCancelable(true);

            AppCompatButton btnSure = dialog3.findViewById(R.id.btnSure);
            AppCompatButton btnCancel = dialog3.findViewById(R.id.btnCancel);

            btnSure.setOnClickListener(v1 -> {
                Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
                dialog3.dismiss();
            });

            btnCancel.setOnClickListener(v1 -> {
                Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show();
                dialog3.dismiss();
            });

            dialog3.show();
        });
    }
}