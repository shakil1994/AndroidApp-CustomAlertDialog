package com.example.shakil.customalertdialog.Fragments.Orders;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.shakil.customalertdialog.Interface.IOrdersCallbackListener;
import com.example.shakil.customalertdialog.Model.DiscountModel;
import com.example.shakil.customalertdialog.Model.OrderModel;

import java.util.Arrays;
import java.util.List;

public class OrdersViewModel extends ViewModel implements IOrdersCallbackListener {

    private MutableLiveData<List<OrderModel>> orderListMutable;
    private MutableLiveData<String> messageError = new MutableLiveData<>();
    private IOrdersCallbackListener ordersCallbackListener;

    public OrdersViewModel() {
        ordersCallbackListener = this;
    }

    public MutableLiveData<List<OrderModel>> getOrderListMutable() {
        if (orderListMutable == null) {
            orderListMutable = new MutableLiveData<>();
            messageError = new MutableLiveData<>();
            loadOrders();
        }
        return orderListMutable;
    }

    private void loadOrders() {
        OrderModel[] orderModels = new OrderModel[]{
                new OrderModel("Adison Dokidis", 200, "11.00 AM", "May 6, 2021", "#123645789", "Pending"),
                new OrderModel("Ashlynn Bergson", 100, "11.30 AM", "April 6, 2021", "#021548796", "Cancelled"),
                new OrderModel("Ann Colzoni", 200, "10.25 PM", "April 20, 2021", "#265987415", "Showed up"),
                new OrderModel("Davis Dokidis", 500, "11.00 AM", "May 6, 2021", "#021548796", "Cancelled"),
                new OrderModel("Carla Vetrovs", 200, "10.25 PM", "April 6, 2021", "#123645789", "Pending"),
                new OrderModel("Adison Dokidis", 800, "11.30 AM", "April 20, 2021", "#265987415", "Showed up"),
                new OrderModel("Ashlynn Bergson", 300, "11.00 AM", "May 6, 2021", "#265987415", "Cancelled"),
                new OrderModel("Ann Colzoni", 200, "10.25 PM", "April 20, 2021", "#265987415", "Pending"),
                new OrderModel("Davis Dokidis", 100, "11.30 AM", "May 6, 2021", "#021548796", "Showed up"),
                new OrderModel("Carla Vetrovs", 200, "11.00 AM", "April 6, 2021", "#123645789", "Pending"),
                new OrderModel("Adison Dokidis", 523, "10.25 PM", "April 20, 2021", "#265987415", "Cancelled"),
                new OrderModel("Ashlynn Bergson", 203, "11.30 AM", "May 6, 2021", "#021548796", "Pending"),
                new OrderModel("Ann Colzoni", 200, "10.25 PM", "April 6, 2021", "#123645789", "Showed up"),
                new OrderModel("Davis Dokidis", 456, "11.00 AM", "May 6, 2021", "#265987415", "Cancelled"),
                new OrderModel("Carla Vetrovs", 200, "11.30 AM", "April 20, 2021", "#021548796", "Pending"),
        };

        ordersCallbackListener.onOrderLoadSuccess(Arrays.asList(orderModels));

    }

    public MutableLiveData<String> getMessageError() {
        return messageError;
    }

    @Override
    public void onOrderLoadSuccess(List<OrderModel> districtLists) {
        orderListMutable.setValue(districtLists);
    }

    @Override
    public void onOrderLoadFailed(String message) {
        messageError.setValue(message);
    }


}