package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shakil.customalertdialog.Adapter.DiscountAdapter;
import com.example.shakil.customalertdialog.Adapter.PaymentHistoryAdapter;
import com.example.shakil.customalertdialog.Model.DiscountModel;
import com.example.shakil.customalertdialog.Model.PaymentHistoryModel;

import java.util.Arrays;

public class PaymentHistoryActivity extends AppCompatActivity {

    ImageView imgBack, imgFilter;
    TextView toolbarText;

    RecyclerView recyclerPayment;
    PaymentHistoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_history);
        getSupportActionBar().hide();

        toolbarSettings();

        recyclerPayment = findViewById(R.id.recyclerPayment);
        PaymentHistoryModel[] paymentHistoryModels = new PaymentHistoryModel[]{
                new PaymentHistoryModel("#123456", "May 15, 2021", 102),
                new PaymentHistoryModel("#025689", "May 31, 2021", 485),
                new PaymentHistoryModel("#789102", "June 15, 2021", 150),
                new PaymentHistoryModel("#025689", "June 30, 2021", 963),
                new PaymentHistoryModel("#123456", "July 15, 2021", 20),
                new PaymentHistoryModel("#025689", "July 31, 2021", 200),
                new PaymentHistoryModel("#789102", "August 15, 2021", 25),
                new PaymentHistoryModel("#025689", "August 31, 2021", 568),
                new PaymentHistoryModel("#789102", "September 15, 2021", 500),
                new PaymentHistoryModel("#025689", "September 30, 2021", 100),
                new PaymentHistoryModel("#789102", "October 15, 2021", 80),
                new PaymentHistoryModel("#025689", "October 31, 2021", 900),
        };

        recyclerPayment.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PaymentHistoryAdapter(Arrays.asList(paymentHistoryModels), this);
        recyclerPayment.setHasFixedSize(true);
        recyclerPayment.setAdapter(adapter);
    }

    private void toolbarSettings() {
        imgFilter = findViewById(R.id.imgFilter);
        imgFilter.setOnClickListener(v -> {
            startActivity(new Intent(this, PaymentHistoryFilterActivity.class));
        });

        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(v -> {
            finish();
        });

        toolbarText = findViewById(R.id.toolbarText);
        toolbarText.setText("Payment History");
    }
}