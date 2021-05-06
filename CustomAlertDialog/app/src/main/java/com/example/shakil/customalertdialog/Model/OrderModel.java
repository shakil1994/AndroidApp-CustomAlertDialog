package com.example.shakil.customalertdialog.Model;

public class OrderModel {
    private String customerName;
    private int paymentAmount;
    private String orderTime;
    private String orderDate;
    private String orderId;
    private String orderStatus;

    public OrderModel() {
    }

    public OrderModel(String customerName, int paymentAmount, String orderTime, String orderDate, String orderId, String orderStatus) {
        this.customerName = customerName;
        this.paymentAmount = paymentAmount;
        this.orderTime = orderTime;
        this.orderDate = orderDate;
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
