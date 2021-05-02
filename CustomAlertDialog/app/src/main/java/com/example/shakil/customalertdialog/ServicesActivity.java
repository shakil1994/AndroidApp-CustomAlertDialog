package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.shakil.customalertdialog.Adapter.ServiceAdapter;
import com.example.shakil.customalertdialog.Model.ServiceModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServicesActivity extends AppCompatActivity {

    ImageView imgBack;
    RecyclerView recyclerServices;

    ServiceAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(v -> {
            finish();
        });

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
    }
}