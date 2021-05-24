package com.dma.tamim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    TextView txtChangeLanguage;
    Button btnNextActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    }
}