package com.example.shakil.customalertdialog.Adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shakil.customalertdialog.Interface.IRecyclerClickListener;
import com.example.shakil.customalertdialog.Model.ServiceModel;
import com.example.shakil.customalertdialog.R;

import java.util.List;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.MyViewHolder> {

    List<ServiceModel> serviceModelList;
    Context context;

    public ServiceAdapter(List<ServiceModel> serviceModelList, Context context) {
        this.serviceModelList = serviceModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_service_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtHeadline.setText(serviceModelList.get(position).getServiceName());
        holder.txtSubText.setText(serviceModelList.get(position).getSortDescription());
        holder.imgServiceImage.setImageResource(serviceModelList.get(position).getServiceImage());

        holder.setListener((view, pos) -> {
            Toast.makeText(context, "" + serviceModelList.get(pos).getServiceName(), Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public int getItemCount() {
        return serviceModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView txtHeadline, txtSubText;
        ImageView imgServiceImage;

        IRecyclerClickListener listener;

        public void setListener(IRecyclerClickListener listener) {
            this.listener = listener;
        }


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtHeadline = itemView.findViewById(R.id.txtHeadline);
            txtSubText = itemView.findViewById(R.id.txtSubText);
            imgServiceImage = itemView.findViewById(R.id.imgServiceImage);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onItemClickListener(v, getAdapterPosition());
        }
    }
}
