package com.example.shakil.customalertdialog.Adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shakil.customalertdialog.R;

import java.util.List;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.MyViewHolder> {

    List<String> serviceList;
    Context context;

    public ServiceAdapter(List<String> serviceList, Context context) {
        this.serviceList = serviceList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_service_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String serviceData = serviceList.get(position);
        holder.txtHeadline.setText(serviceData);
        holder.txtSubText.setText(serviceData);

    }

    @Override
    public int getItemCount() {
        return serviceList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtHeadline, txtSubText;
        ImageView imgServiceImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtHeadline = itemView.findViewById(R.id.txtHeadline);
            txtSubText = itemView.findViewById(R.id.txtSubText);
            imgServiceImage = itemView.findViewById(R.id.imgServiceImage);
        }
    }
}
