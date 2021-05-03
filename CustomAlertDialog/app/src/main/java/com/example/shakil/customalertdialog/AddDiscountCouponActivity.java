package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class AddDiscountCouponActivity extends AppCompatActivity {

    ImageView imgBack, imgFilter;
    TextView toolbarText;

    EditText edtStartDate, edtEndDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_discount_coupon);

        edtStartDate = findViewById(R.id.edtStartDate);
        edtEndDate = findViewById(R.id.edtEndDate);

        imgFilter = findViewById(R.id.imgFilter);
        imgFilter.setVisibility(View.GONE);

        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(v -> {
            finish();
        });

        toolbarText = findViewById(R.id.toolbarText);
        toolbarText.setText("Discount Coupon");

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        edtStartDate.setOnClickListener(v -> {
            DatePickerDialog datePickerDialog = new DatePickerDialog(this, (view, year1, month1, dayOfMonth) -> {
                month1 = month1 + 1;
                String date = dayOfMonth + "/" + month1 + "/" + year1;
                edtStartDate.setText(date);
            }, year, month, day);
            datePickerDialog.show();
        });

        edtEndDate.setOnClickListener(v -> {
            DatePickerDialog datePickerDialog = new DatePickerDialog(this, (view, year1, month1, dayOfMonth) -> {
                month1 = month1 + 1;
                String date = dayOfMonth + "/" + month1 + "/" + year1;
                edtEndDate.setText(date);
            }, year, month, day);
            datePickerDialog.show();
        });
    }
}