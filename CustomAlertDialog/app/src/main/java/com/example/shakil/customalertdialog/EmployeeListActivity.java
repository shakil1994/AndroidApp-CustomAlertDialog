package com.example.shakil.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shakil.customalertdialog.Adapter.AddServiceAdapter;
import com.example.shakil.customalertdialog.Adapter.EmployeeListAdapter;
import com.example.shakil.customalertdialog.Model.AddServiceModel;
import com.example.shakil.customalertdialog.Model.EmployeeModel;

import java.util.Arrays;

public class EmployeeListActivity extends AppCompatActivity {

    ImageView imgBack, imgFilter;
    TextView toolbarText;
    RecyclerView recyclerEmployeeList;

    EmployeeListAdapter adapter;

    AppCompatButton btnAddEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);
        getSupportActionBar().hide();

        btnAddEmployee = findViewById(R.id.btnAddEmployee);
        btnAddEmployee.setOnClickListener(v -> {
            startActivity(new Intent(this, AddEmployeeActivity.class));
        });

        toolbarSettings();

        recyclerEmployeeList = findViewById(R.id.recyclerEmployeeList);
        EmployeeModel[] employeeModels = new EmployeeModel[]{
                new EmployeeModel(R.drawable.profile_pic, "Jane Cooper", "Nail Specialist", "Bangladesh"),
                new EmployeeModel(R.drawable.profile_pic, "Savannah Nguyen", "Nail Specialist", "Bangladesh"),
                new EmployeeModel(R.drawable.profile_pic, "Abada Amari", "Nail Specialist", "Bangladesh"),
                new EmployeeModel(R.drawable.profile_pic, "Nusrat Bahar", "Nail Specialist", "Bangladesh"),
                new EmployeeModel(R.drawable.profile_pic, "Savannah Nguyen", "Nail Specialist", "Bangladesh"),
                new EmployeeModel(R.drawable.profile_pic, "Jane Cooper", "Nail Specialist", "Bangladesh"),
                new EmployeeModel(R.drawable.profile_pic, "Jane Cooper", "Nail Specialist", "Bangladesh"),
                new EmployeeModel(R.drawable.profile_pic, "Jane Cooper", "Nail Specialist", "Bangladesh"),
        };

        recyclerEmployeeList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new EmployeeListAdapter(Arrays.asList(employeeModels), this);
        recyclerEmployeeList.setHasFixedSize(true);
        recyclerEmployeeList.setAdapter(adapter);
    }

    private void toolbarSettings() {
        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(v -> {
            finish();
        });

        toolbarText = findViewById(R.id.toolbarText);
        toolbarText.setText("Employee List");

        imgFilter = findViewById(R.id.imgFilter);
        imgFilter.setVisibility(View.GONE);
    }
}