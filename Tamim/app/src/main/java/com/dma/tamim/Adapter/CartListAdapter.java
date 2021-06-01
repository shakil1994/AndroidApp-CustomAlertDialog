package com.dma.tamim.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dma.tamim.Model.Item;
import com.dma.tamim.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CartListAdapter extends RecyclerView.Adapter<CartListAdapter.MyViewHolder> {

    Context context;
    List<Item> itemList;

    public CartListAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cart_item_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(itemList.get(position).getName());
        holder.description.setText(itemList.get(position).getDescription());
        holder.price.setText(itemList.get(position).getPrice());
        Picasso.get().load(itemList.get(position).getThumbnail()).into(holder.thumbnail);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public void removeItem(int position){
        itemList.remove(position);
        notifyItemRemoved(position);
    }

    public void restoreItem(Item item, int position){
        itemList.add(position, item);
        notifyItemInserted(position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView price, description, name;
        ImageView thumbnail;
        RelativeLayout viewBackground, viewForeground;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);
            price = itemView.findViewById(R.id.price);
            thumbnail = itemView.findViewById(R.id.thumbnail);
            viewBackground = itemView.findViewById(R.id.view_background);
            viewForeground = itemView.findViewById(R.id.view_foreground);
        }
    }
}
