package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    CardView cardViewServices, cardViewDiscount, cardViewPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cardViewServices = findViewById(R.id.cardViewServices);
        cardViewServices.setOnClickListener(v -> {
            startActivity(new Intent(this, ServicesActivity.class));
        });

        cardViewDiscount = findViewById(R.id.cardViewDiscount);
        cardViewDiscount.setOnClickListener(v -> {
            startActivity(new Intent(this, DiscountActivity.class));
        });

        cardViewPayment = findViewById(R.id.cardViewPayment);
        cardViewPayment.setOnClickListener(v -> {
            startActivity(new Intent(this, PaymentHistoryActivity.class));
        });
    }
}