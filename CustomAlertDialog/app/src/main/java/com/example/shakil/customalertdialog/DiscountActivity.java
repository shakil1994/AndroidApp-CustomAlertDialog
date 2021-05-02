package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shakil.customalertdialog.Adapter.AddServiceAdapter;
import com.example.shakil.customalertdialog.Adapter.DiscountAdapter;
import com.example.shakil.customalertdialog.Model.AddServiceModel;
import com.example.shakil.customalertdialog.Model.DiscountModel;

import java.util.Arrays;

public class DiscountActivity extends AppCompatActivity {

    ImageView imgBack;
    TextView toolbarText;

    RecyclerView recyclerDiscount;
    DiscountAdapter adapter;

    AppCompatButton btnAddCoupon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount);

        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(v -> {
            finish();
        });

        toolbarText = findViewById(R.id.toolbarText);
        toolbarText.setText("Discount Coupon");

        btnAddCoupon = findViewById(R.id.btnAddCoupon);

        recyclerDiscount = findViewById(R.id.recyclerDiscount);
        DiscountModel[] discountModels = new DiscountModel[]{
                new DiscountModel("ABCD1234", "May 2 - May 15, 2021", 25),
                new DiscountModel("EFGH1234", "May 16 - May 31, 2021", 25),
                new DiscountModel("IJKL1234", "June 1 - June 15, 2021", 25),
                new DiscountModel("MNOP1234", "June 16 - June 30, 2021", 25),
                new DiscountModel("QRST1234", "July 1 - July 15, 2021", 25),
                new DiscountModel("UVWX1234", "July 16 - July 31, 2021", 25),
                new DiscountModel("QRST1234", "August 1 - August 15, 2021", 25),
                new DiscountModel("UVWX1234", "August 16 - August 31, 2021", 25),
                new DiscountModel("QRST1234", "September 1 - September 15, 2021", 25),
                new DiscountModel("UVWX1234", "September 16 - September 30, 2021", 25),
                new DiscountModel("QRST1234", "October 1 - October 15, 2021", 25),
                new DiscountModel("UVWX1234", "October 16 - October 31, 2021", 25),
        };

        recyclerDiscount.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DiscountAdapter(Arrays.asList(discountModels), this);
        recyclerDiscount.setHasFixedSize(true);
        recyclerDiscount.setAdapter(adapter);
    }
}