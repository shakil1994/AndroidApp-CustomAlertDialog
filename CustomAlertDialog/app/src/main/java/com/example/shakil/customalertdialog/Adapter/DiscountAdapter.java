package com.example.shakil.customalertdialog.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shakil.customalertdialog.Model.DiscountModel;
import com.example.shakil.customalertdialog.R;

import java.util.List;

public class DiscountAdapter extends RecyclerView.Adapter<DiscountAdapter.MyViewHolder> {

    List<DiscountModel> discountModelList;
    Context context;

    public DiscountAdapter(List<DiscountModel> discountModelList, Context context) {
        this.discountModelList = discountModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_discount_coupon, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtCouponName.setText(discountModelList.get(position).getDiscountCouponName());
        holder.txtCouponExpairDate.setText(discountModelList.get(position).getDateTime());
        holder.txtDiscountAmount.setText(discountModelList.get(position).getDiscountAmount() + " %");
    }

    @Override
    public int getItemCount() {
        return discountModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtCouponName, txtCouponExpairDate, txtDiscountAmount;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtCouponName = itemView.findViewById(R.id.txtCouponName);
            txtCouponExpairDate = itemView.findViewById(R.id.txtCouponExpairDate);
            txtDiscountAmount = itemView.findViewById(R.id.txtDiscountAmount);
        }
    }
}
