package com.dma.tamim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dma.tamim.Fragment.RatingFragment;

public class MansionWeddingActivity extends AppCompatActivity {

    Button btnBottomSheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mansion_wedding);

        btnBottomSheet = findViewById(R.id.btnBottomSheet);
        btnBottomSheet.setOnClickListener(v -> {
            RatingFragment ratingFragment = RatingFragment.getInstance();
            ratingFragment.show(getSupportFragmentManager(), "RatingFragment");
        });
    }
}