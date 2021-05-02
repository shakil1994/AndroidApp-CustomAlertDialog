package com.example.shakil.customalertdialog.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shakil.customalertdialog.Model.AddServiceModel;
import com.example.shakil.customalertdialog.Model.ServiceModel;
import com.example.shakil.customalertdialog.R;

import java.util.List;

public class AddServiceAdapter extends RecyclerView.Adapter<AddServiceAdapter.MyViewHolder> {

    List<AddServiceModel> addServiceModelList;
    Context context;

    public AddServiceAdapter(List<AddServiceModel> addServiceModelList, Context context) {
        this.addServiceModelList = addServiceModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AddServiceAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_add_service, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtServiceName.setText(addServiceModelList.get(position).getServiceName());
    }

    @Override
    public int getItemCount() {
        return addServiceModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtServiceName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtServiceName = itemView.findViewById(R.id.txtServiceName);
        }
    }
}
