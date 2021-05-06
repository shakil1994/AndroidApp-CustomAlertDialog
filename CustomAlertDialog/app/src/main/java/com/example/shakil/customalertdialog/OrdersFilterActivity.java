package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class OrdersFilterActivity extends AppCompatActivity {

    ImageView imgBack, imgFilter;
    TextView toolbarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders_filter);
        getSupportActionBar().hide();

        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(v -> {
            finish();
        });

        toolbarText = findViewById(R.id.toolbarText);
        toolbarText.setText("Filter");

        imgFilter = findViewById(R.id.imgFilter);
        imgFilter.setVisibility(View.GONE);

    }
}