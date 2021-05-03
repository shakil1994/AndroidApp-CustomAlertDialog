package com.example.shakil.customalertdialog.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shakil.customalertdialog.Model.PaymentHistoryDetailsModel;
import com.example.shakil.customalertdialog.R;

import java.util.List;

public class PaymentHistoryDetailsAdapter extends RecyclerView.Adapter<PaymentHistoryDetailsAdapter.MyViewHolder> {

    List<PaymentHistoryDetailsModel> paymentHistoryDetailsModelList;
    Context context;

    public PaymentHistoryDetailsAdapter(List<PaymentHistoryDetailsModel> paymentHistoryDetailsModelList, Context context) {
        this.paymentHistoryDetailsModelList = paymentHistoryDetailsModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_payment_history_details, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtPaymentId.setText(paymentHistoryDetailsModelList.get(position).getPaymentId());
        holder.txtAmount.setText(new StringBuilder().append("$ ").append(paymentHistoryDetailsModelList.get(position).getPaymentAmount()).toString());
    }

    @Override
    public int getItemCount() {
        return paymentHistoryDetailsModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtPaymentId, txtAmount;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtPaymentId = itemView.findViewById(R.id.txtPaymentId);
            txtAmount = itemView.findViewById(R.id.txtAmount);
        }
    }
}
