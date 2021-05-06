package com.example.shakil.customalertdialog.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shakil.customalertdialog.Interface.IRecyclerClickListener;
import com.example.shakil.customalertdialog.Model.OrderModel;
import com.example.shakil.customalertdialog.OrderDetailsActivity;
import com.example.shakil.customalertdialog.PaymentHistoryDetailsActivity;
import com.example.shakil.customalertdialog.R;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.MyViewHolder> {

    List<OrderModel> orderModelList;
    Context context;

    public OrderAdapter(List<OrderModel> orderModelList, Context context) {
        this.orderModelList = orderModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_orders, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtCustomerName.setText(orderModelList.get(position).getCustomerName());
        holder.txtPaymentAmount.setText(new StringBuilder().append("$ ").append(orderModelList.get(position).getPaymentAmount()).toString());
        holder.txtTime.setText(orderModelList.get(position).getPaymentTime());
        holder.txtDate.setText(orderModelList.get(position).getPaymentDate());
        holder.txtOrderId.setText(orderModelList.get(position).getOrderId());
        holder.txtOrderStatus.setText(orderModelList.get(position).getOrderStatus());

        holder.setListener((view, pos) -> {
            Intent intent = new Intent(context, OrderDetailsActivity.class);
            /*intent.putExtra("PAYMENT_ID", paymentHistoryModelList.get(position).getPaymentId());
            intent.putExtra("PAYMENT_DATE", paymentHistoryModelList.get(position).getPaymentDate());*/
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return orderModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtCustomerName, txtPaymentAmount, txtTime, txtDate, txtOrderId, txtOrderStatus;

        IRecyclerClickListener listener;

        public void setListener(IRecyclerClickListener listener) {
            this.listener = listener;
        }

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtCustomerName = itemView.findViewById(R.id.txtCustomerName);
            txtPaymentAmount = itemView.findViewById(R.id.txtPaymentAmount);
            txtTime = itemView.findViewById(R.id.txtTime);
            txtDate = itemView.findViewById(R.id.txtDate);
            txtOrderId = itemView.findViewById(R.id.txtOrderId);
            txtOrderStatus = itemView.findViewById(R.id.txtOrderStatus);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onItemClickListener(v, getAdapterPosition());
        }
    }
}
