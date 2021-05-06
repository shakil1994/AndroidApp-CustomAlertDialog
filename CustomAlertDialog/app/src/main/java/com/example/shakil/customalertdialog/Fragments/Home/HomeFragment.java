package com.example.shakil.customalertdialog.Fragments.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shakil.customalertdialog.DiscountActivity;
import com.example.shakil.customalertdialog.PaymentHistoryActivity;
import com.example.shakil.customalertdialog.R;
import com.example.shakil.customalertdialog.ServicesActivity;

public class HomeFragment extends Fragment {

    private HomeViewModel mViewModel;
    CardView cardViewServices, cardViewDiscount, cardViewPayment;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        cardViewServices = root.findViewById(R.id.cardViewServices);
        cardViewServices.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), ServicesActivity.class));
        });

        cardViewDiscount = root.findViewById(R.id.cardViewDiscount);
        cardViewDiscount.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), DiscountActivity.class));
        });

        cardViewPayment = root.findViewById(R.id.cardViewPayment);
        cardViewPayment.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), PaymentHistoryActivity.class));
        });

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        // TODO: Use the ViewModel
    }

}