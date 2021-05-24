package com.dma.tamim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dma.tamim.Adapter.ItemAdapter;
import com.dma.tamim.Fragment.RatingFragment;
import com.dma.tamim.Helper.MySwipeHelper;
import com.dma.tamim.Model.ItemModel;

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
            RatingFragment ratingFragment = RatingFragment.getInstance();
            ratingFragment.show(getSupportFragmentManager(), "RatingFragment");
        });

        recyclerItem = findViewById(R.id.recyclerItem);
        recyclerItem.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerItem.setLayoutManager(layoutManager);

        MySwipeHelper mySwipeHelper = new MySwipeHelper(this, recyclerItem, 200) {
            @Override
            public void instantiateMyButton(RecyclerView.ViewHolder viewHolder, List<MyButton> buffer) {
                buffer.add(new MyButton(MansionWeddingActivity.this, "",
                        0, R.drawable.ic_delete,
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