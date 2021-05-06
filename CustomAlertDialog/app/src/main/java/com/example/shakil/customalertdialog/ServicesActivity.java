package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.shakil.customalertdialog.Adapter.ServiceAdapter;
import com.example.shakil.customalertdialog.Model.ServiceModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServicesActivity extends AppCompatActivity {

    ImageView imgBack, imgFilter;
    RecyclerView recyclerServices;

    ServiceAdapter adapter;

    AppCompatButton btnAddServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        getSupportActionBar().hide();

        toolbarSettings();

        recyclerServices = findViewById(R.id.recyclerServices);
        ServiceModel[] serviceModels = new ServiceModel[]{
                new ServiceModel("Hair Treatment", "Lorem ipsum dolor sit amet.", R.drawable.hair_treatment),
                new ServiceModel("Spa", "Lorem ipsum dolor sit amet.", R.drawable.spa),
                new ServiceModel("Facial", "Lorem ipsum dolor sit amet.", R.drawable.facial),
                new ServiceModel("Hair Treatment", "Lorem ipsum dolor sit amet.", R.drawable.hair_treatment),
                new ServiceModel("Spa", "Lorem ipsum dolor sit amet.", R.drawable.spa),
                new ServiceModel("Facial", "Lorem ipsum dolor sit amet.", R.drawable.facial),
                new ServiceModel("Hair Treatment", "Lorem ipsum dolor sit amet.", R.drawable.hair_treatment),
                new ServiceModel("Spa", "Lorem ipsum dolor sit amet.", R.drawable.spa),
                new ServiceModel("Facial", "Lorem ipsum dolor sit amet.", R.drawable.facial),
                new ServiceModel("Hair Treatment", "Lorem ipsum dolor sit amet.", R.drawable.hair_treatment),
                new ServiceModel("Spa", "Lorem ipsum dolor sit amet.", R.drawable.spa),
                new ServiceModel("Facial", "Lorem ipsum dolor sit amet.", R.drawable.facial),
        };

        recyclerServices.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ServiceAdapter(Arrays.asList(serviceModels), this);
        recyclerServices.setHasFixedSize(true);
        recyclerServices.setAdapter(adapter);

        btnAddServices = findViewById(R.id.btnAddServices);
        btnAddServices.setOnClickListener(v -> {
            startActivity(new Intent(this, AddServiceActivity.class));
        });
    }

    private void toolbarSettings() {
        imgFilter = findViewById(R.id.imgFilter);
        imgFilter.setVisibility(View.GONE);

        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(v -> {
            finish();
        });
    }
}