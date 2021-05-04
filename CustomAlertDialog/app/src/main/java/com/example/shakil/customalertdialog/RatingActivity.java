package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RatingActivity extends AppCompatActivity {

    TextView toolbarText;
    ImageView imgBack, imgFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        getSupportActionBar().hide();

        imgFilter = findViewById(R.id.imgFilter);
        imgFilter.setVisibility(View.GONE);

        toolbarText = findViewById(R.id.toolbarText);
        toolbarText.setVisibility(View.GONE);

        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(v -> {
            finish();
        });
    }
}