package com.example.shakil.customalertdialog.Fragments.Profile;

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
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shakil.customalertdialog.AuthorizedPersonProfileActivity;
import com.example.shakil.customalertdialog.OrdersFilterActivity;
import com.example.shakil.customalertdialog.R;

public class ProfileFragment extends Fragment {

    private ProfileViewModel mViewModel;

    ImageView imgBack, imgFilter;
    TextView toolbarText;

    CardView cardViewAuthorized;

    public static ProfileFragment newInstance() {
        return new ProfileFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        imgBack = root.findViewById(R.id.imgBack);
        imgBack.setVisibility(View.GONE);

        toolbarText = root.findViewById(R.id.toolbarText);
        toolbarText.setText("Profile");

        imgFilter = root.findViewById(R.id.imgFilter);
        imgFilter.setVisibility(View.GONE);

        cardViewAuthorized = root.findViewById(R.id.cardViewAuthorized);
        cardViewAuthorized.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), AuthorizedPersonProfileActivity.class));
        });

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ProfileViewModel.class);
        // TODO: Use the ViewModel
    }

}