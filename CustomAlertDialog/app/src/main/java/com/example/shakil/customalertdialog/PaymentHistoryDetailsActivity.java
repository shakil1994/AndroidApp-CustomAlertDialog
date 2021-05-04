package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shakil.customalertdialog.Adapter.PaymentHistoryAdapter;
import com.example.shakil.customalertdialog.Adapter.PaymentHistoryDetailsAdapter;
import com.example.shakil.customalertdialog.Model.PaymentHistoryDetailsModel;
import com.example.shakil.customalertdialog.Model.PaymentHistoryModel;

import java.util.Arrays;

public class PaymentHistoryDetailsActivity extends AppCompatActivity {

    ImageView imgBack, imgFilter;
    TextView toolbarText, txtPaymentId, txtPaymentDate;

    RecyclerView recyclerPaymentHistoryDetails;
    PaymentHistoryDetailsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_history_details);
        getSupportActionBar().hide();

        txtPaymentId = findViewById(R.id.txtPaymentId);
        txtPaymentDate = findViewById(R.id.txtPaymentDate);

        imgFilter = findViewById(R.id.imgFilter);
        imgFilter.setVisibility(View.GONE);

        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(v -> {
            finish();
        });

        toolbarText = findViewById(R.id.toolbarText);
        toolbarText.setText("Payment History Details");

        if (getIntent() != null) {
            if (!getIntent().getStringExtra("PAYMENT_ID").isEmpty() && !getIntent().getStringExtra("PAYMENT_DATE").isEmpty()) {
                txtPaymentId.setText(getIntent().getStringExtra("PAYMENT_ID"));
                txtPaymentDate.setText(getIntent().getStringExtra("PAYMENT_DATE"));
            }
        }

        recyclerPaymentHistoryDetails = findViewById(R.id.recyclerPaymentHistoryDetails);
        PaymentHistoryDetailsModel[] paymentHistoryDetailsModels = new PaymentHistoryDetailsModel[]{
                new PaymentHistoryDetailsModel("#123456123456",  1050),
                new PaymentHistoryDetailsModel("#147852369852",  1185),
                new PaymentHistoryDetailsModel("#123456123456",  1050),
                new PaymentHistoryDetailsModel("#159632478520",  102),
                new PaymentHistoryDetailsModel("#123456123456",  1050),
                new PaymentHistoryDetailsModel("#154789632015",  1054),
                new PaymentHistoryDetailsModel("#123456123456",  1050),
                new PaymentHistoryDetailsModel("#124578956321",  102),
                new PaymentHistoryDetailsModel("#123456123456",  1050),
                new PaymentHistoryDetailsModel("#012478596321",  2658),
        };

        recyclerPaymentHistoryDetails.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PaymentHistoryDetailsAdapter(Arrays.asList(paymentHistoryDetailsModels), this);
        recyclerPaymentHistoryDetails.setHasFixedSize(true);
        recyclerPaymentHistoryDetails.setAdapter(adapter);
    }
}