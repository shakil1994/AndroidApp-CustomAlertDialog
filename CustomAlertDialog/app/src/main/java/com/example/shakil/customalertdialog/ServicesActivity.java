package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.shakil.customalertdialog.Adapter.ServiceAdapter;

import java.util.ArrayList;

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

        ArrayList<String> serviceName = new ArrayList<>();
        serviceName.add("Hair Treatment");
        serviceName.add("Spa");
        serviceName.add("Facial");
        serviceName.add("Hair Treatment");
        serviceName.add("Spa");
        serviceName.add("Facial");

        recyclerServices.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ServiceAdapter(serviceName, this);
        recyclerServices.setAdapter(adapter);
    }
}