package com.example.shakil.customalertdialog.Interface;

import com.example.shakil.customalertdialog.Model.OrderModel;

import java.util.List;

public interface IOrdersCallbackListener {
    void onOrderLoadSuccess(List<OrderModel> orderLists);

    void onOrderLoadFailed(String message);
}
