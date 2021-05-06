package com.example.shakil.customalertdialog.Fragments.Orders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shakil.customalertdialog.Adapter.OrderAdapter;
import com.example.shakil.customalertdialog.Model.OrderModel;
import com.example.shakil.customalertdialog.OrdersFilterActivity;
import com.example.shakil.customalertdialog.R;

public class OrdersFragment extends Fragment {

    private OrdersViewModel mViewModel;
    RecyclerView recyclerOrders;
    OrderAdapter adapter;

    ImageView imgBack, imgFilter;
    TextView toolbarText;


    public static OrdersFragment newInstance() {
        return new OrdersFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        mViewModel = new ViewModelProvider(this).get(OrdersViewModel.class);

        View root = inflater.inflate(R.layout.orders_fragment, container, false);

        imgBack = root.findViewById(R.id.imgBack);
        imgBack.setVisibility(View.GONE);

        toolbarText = root.findViewById(R.id.toolbarText);
        toolbarText.setText("Orders");

        imgFilter = root.findViewById(R.id.imgFilter);
        imgFilter.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), OrdersFilterActivity.class));
        });

        recyclerOrders = root.findViewById(R.id.recyclerOrders);

        mViewModel.getOrderListMutable().observe(getViewLifecycleOwner(), orderModelList -> {
            recyclerOrders.setLayoutManager(new LinearLayoutManager(getContext()));
            adapter = new OrderAdapter(orderModelList, getContext());
            recyclerOrders.setHasFixedSize(true);
            recyclerOrders.setAdapter(adapter);
        });

        return root;
    }

}