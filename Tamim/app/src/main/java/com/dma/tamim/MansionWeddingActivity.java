package com.dma.tamim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.dma.tamim.Adapter.ItemAdapter;
import com.dma.tamim.Helper.MySwipeHelper;
import com.dma.tamim.Model.ItemModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class MansionWeddingActivity extends AppCompatActivity {

    Button btnBottomSheet;
    RecyclerView recyclerItem;
    ItemAdapter adapter;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mansion_wedding);

        btnBottomSheet = findViewById(R.id.btnBottomSheet);
        btnBottomSheet.setOnClickListener(v -> {
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this, R.style.BottomSheetDialogTheme);
            View bottomSheetView = LayoutInflater.from(this).inflate(R.layout.bottom_sheet_dialog_rating, findViewById(R.id.bottomSheetContainer));

            AppCompatButton btnSubmit = bottomSheetView.findViewById(R.id.btnSubmit);
            btnSubmit.setOnClickListener(v1 -> {
                Toast.makeText(MansionWeddingActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            });

            ImageView imgClose = bottomSheetView.findViewById(R.id.imgClose);
            imgClose.setOnClickListener(v12 -> {
                bottomSheetDialog.dismiss();
            });
            bottomSheetDialog.setContentView(bottomSheetView);
            bottomSheetDialog.show();

        });

        recyclerItem = findViewById(R.id.recyclerItem);
        recyclerItem.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerItem.setLayoutManager(layoutManager);

        MySwipeHelper mySwipeHelper = new MySwipeHelper(this, recyclerItem, 200) {
            @Override
            public void instantiateMyButton(RecyclerView.ViewHolder viewHolder, List<MyButton> buffer) {
                buffer.add(new MyButton(MansionWeddingActivity.this, "Delete",
                        30, 0,
                        Color.parseColor("#FF4B55"), pos -> {
                    Toast.makeText(MansionWeddingActivity.this, "Delete item", Toast.LENGTH_SHORT).show();

                }));

            }
        };


        generateItem();
    }

    private void generateItem() {
        List<ItemModel> itemModels = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            itemModels.add(new ItemModel("Jerome Bell", "Cousin"));
        }
        adapter = new ItemAdapter(this, itemModels);
        recyclerItem.setAdapter(adapter);
    }
}