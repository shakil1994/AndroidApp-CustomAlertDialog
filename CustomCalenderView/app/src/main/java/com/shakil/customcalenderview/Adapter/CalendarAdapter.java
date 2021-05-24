package com.shakil.customcalenderview.Adapter;

import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shakil.customcalenderview.R;

import java.util.ArrayList;

public class CalendarAdapter extends RecyclerView.Adapter<CalendarAdapter.MyViewHolder> {

    private final ArrayList<String> daysOfMonth;
    private final onItemListener onItemListener;

    public CalendarAdapter(ArrayList<String> daysOfMonth, CalendarAdapter.onItemListener onItemListener) {
        this.daysOfMonth = daysOfMonth;
        this.onItemListener = onItemListener;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.calender_cell, parent, false);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (parent.getHeight() * 0.08);
        return new MyViewHolder(view, onItemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.dayOfMonth.setText(daysOfMonth.get(position));
        holder.dayOfMonth.setOnClickListener(view -> {
            holder.dayOfMonth.setTextColor(Color.parseColor("#FFFFFF"));
            holder.dayOfMonth.setBackgroundResource(R.drawable.circle);
            holder.dayOfMonth.setGravity(Gravity.CENTER);
        });
    }

    @Override
    public int getItemCount() {
        return daysOfMonth.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView dayOfMonth;
        CalendarAdapter.onItemListener onItemListener;

        public MyViewHolder(@NonNull View itemView, CalendarAdapter.onItemListener onItemListener) {
            super(itemView);

            dayOfMonth = itemView.findViewById(R.id.monthOfDay);
            this.onItemListener = onItemListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onItemListener.onItemClick(getAdapterPosition(), (String) dayOfMonth.getText());
        }
    }

    public interface onItemListener{
        void onItemClick(int position, String dayText);
    }
}
