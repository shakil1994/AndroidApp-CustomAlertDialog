package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AuthorizedPersonProfileActivity extends AppCompatActivity {

    ImageView imgBack, imgFilter;
    TextView toolbarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorized_person_profile);
        getSupportActionBar().hide();

        toolbarSettings();
    }

    private void toolbarSettings() {
        imgFilter = findViewById(R.id.imgFilter);
        imgFilter.setVisibility(View.GONE);

        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(v -> {
            finish();
        });

        toolbarText = findViewById(R.id.toolbarText);
        toolbarText.setText("Authorized Person’s Profile");
    }
}