package com.example.shakil.customalertdialog.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shakil.customalertdialog.Interface.IRecyclerClickListener;
import com.example.shakil.customalertdialog.Model.PaymentHistoryModel;
import com.example.shakil.customalertdialog.PaymentHistoryDetailsActivity;
import com.example.shakil.customalertdialog.R;

import java.util.List;

public class PaymentHistoryAdapter extends RecyclerView.Adapter<PaymentHistoryAdapter.MyViewHolder> {

    List<PaymentHistoryModel> paymentHistoryModelList;
    Context context;

    public PaymentHistoryAdapter(List<PaymentHistoryModel> paymentHistoryModelList, Context context) {
        this.paymentHistoryModelList = paymentHistoryModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_payment_history, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtPaymentId.setText(paymentHistoryModelList.get(position).getPaymentId());
        holder.txtPaymentDate.setText(paymentHistoryModelList.get(position).getPaymentDate());
        holder.txtAmount.setText(new StringBuilder().append("$ ").append(paymentHistoryModelList.get(position).getPaymentAmount()).toString());

        holder.setListener((view, pos) -> {
            Intent intent = new Intent(context, PaymentHistoryDetailsActivity.class);
            intent.putExtra("PAYMENT_ID", paymentHistoryModelList.get(position).getPaymentId());
            intent.putExtra("PAYMENT_DATE", paymentHistoryModelList.get(position).getPaymentDate());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return paymentHistoryModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView txtAmount, txtPaymentDate, txtPaymentId;

        IRecyclerClickListener listener;

        public void setListener(IRecyclerClickListener listener) {
            this.listener = listener;
        }

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtPaymentId = itemView.findViewById(R.id.txtPaymentId);
            txtPaymentDate = itemView.findViewById(R.id.txtPaymentDate);
            txtAmount = itemView.findViewById(R.id.txtAmount);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onItemClickListener(v, getAdapterPosition());
        }
    }
}
