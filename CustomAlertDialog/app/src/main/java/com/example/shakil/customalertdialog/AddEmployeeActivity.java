package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AddEmployeeActivity extends AppCompatActivity {

    ImageView imgBack, imgFilter;
    TextView toolbarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);
        getSupportActionBar().hide();

        toolbarSettings();
    }

    private void toolbarSettings() {
        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(v -> {
            finish();
        });

        toolbarText = findViewById(R.id.toolbarText);
        toolbarText.setText("Manage Employee");

        imgFilter = findViewById(R.id.imgFilter);
        imgFilter.setVisibility(View.GONE);
    }
}