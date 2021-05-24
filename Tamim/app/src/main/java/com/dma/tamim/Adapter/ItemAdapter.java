package com.dma.tamim.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dma.tamim.Model.ItemModel;
import com.dma.tamim.R;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    Context context;
    List<ItemModel> itemModelList;

    public ItemAdapter(Context context, List<ItemModel> itemModelList) {
        this.context = context;
        this.itemModelList = itemModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_manage_guest_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtGuestName.setText(itemModelList.get(position).getName());
        holder.txtRelation.setText(itemModelList.get(position).getRelation());
    }

    @Override
    public int getItemCount() {
        return itemModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView txtGuestName, txtRelation;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtGuestName = itemView.findViewById(R.id.txtGuestName);
            txtRelation = itemView.findViewById(R.id.txtRelation);
        }
    }
}
