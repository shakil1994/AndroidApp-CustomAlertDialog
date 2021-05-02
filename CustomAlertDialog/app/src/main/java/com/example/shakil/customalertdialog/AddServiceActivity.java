package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shakil.customalertdialog.Adapter.AddServiceAdapter;
import com.example.shakil.customalertdialog.Adapter.ServiceAdapter;
import com.example.shakil.customalertdialog.Model.AddServiceModel;
import com.example.shakil.customalertdialog.Model.ServiceModel;

import java.util.Arrays;

public class AddServiceActivity extends AppCompatActivity {

    ImageView imgBack;
    TextView toolbarText;
    RecyclerView recyclerAddServices;

    AddServiceAdapter addServiceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_service);

        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(v -> {
            finish();
        });

        toolbarText = findViewById(R.id.toolbarText);
        toolbarText.setText("Add Services");

        recyclerAddServices = findViewById(R.id.recyclerAddServices);
        AddServiceModel[] addServiceModels = new AddServiceModel[]{
                new AddServiceModel("Hair Treatment"),
                new AddServiceModel("Nail Treatment"),
                new AddServiceModel("Facial"),
                new AddServiceModel("Spa"),
                new AddServiceModel("Makeup"),
                new AddServiceModel("Massage"),
                new AddServiceModel("Hair Treatment"),
                new AddServiceModel("Nail Treatment"),
                new AddServiceModel("Facial"),
                new AddServiceModel("Spa"),
                new AddServiceModel("Makeup"),
                new AddServiceModel("Massage"),
        };

        recyclerAddServices.setLayoutManager(new LinearLayoutManager(this));
        addServiceAdapter = new AddServiceAdapter(Arrays.asList(addServiceModels), this);
        recyclerAddServices.setHasFixedSize(true);
        recyclerAddServices.setAdapter(addServiceAdapter);
    }
}