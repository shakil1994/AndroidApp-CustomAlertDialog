package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OrderDetailsActivity extends AppCompatActivity {

    ImageView imgBack, imgFilter;
    TextView toolbarText, txtName, txtOrderNo, txtBookingDate, txtBookingTime;

    LinearLayout layoutSecretCode;

    AppCompatButton btnShowedUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        getSupportActionBar().hide();

        txtName = findViewById(R.id.txtName);
        txtOrderNo = findViewById(R.id.txtOrderNo);
        txtBookingDate = findViewById(R.id.txtBookingDate);
        txtBookingTime = findViewById(R.id.txtBookingTime);

        if (getIntent() != null) {
            if (!getIntent().getStringExtra("ORDER_CUSTOMER_NAME").isEmpty() &&
                    !getIntent().getStringExtra("ORDER_ID").isEmpty() &&
                    !getIntent().getStringExtra("ORDER_DATE").isEmpty() &&
                    !getIntent().getStringExtra("ORDER_TIME").isEmpty()) {
                txtName.setText(getIntent().getStringExtra("ORDER_CUSTOMER_NAME"));
                txtOrderNo.setText(getIntent().getStringExtra("ORDER_ID"));
                txtBookingDate.setText(getIntent().getStringExtra("ORDER_DATE"));
                txtBookingTime.setText(getIntent().getStringExtra("ORDER_TIME"));
            }
        }

        layoutSecretCode = findViewById(R.id.layoutSecretCode);
        btnShowedUp = findViewById(R.id.btnShowedUp);
        btnShowedUp.setOnClickListener(v -> {
            btnShowedUp.setVisibility(View.GONE);
            layoutSecretCode.setVisibility(View.VISIBLE);
        });

        toolbar();
    }

    private void toolbar() {
        imgFilter = findViewById(R.id.imgFilter);
        imgFilter.setVisibility(View.GONE);

        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(v -> {
            finish();
        });

        toolbarText = findViewById(R.id.toolbarText);
        toolbarText.setText("Order Details");
    }
}