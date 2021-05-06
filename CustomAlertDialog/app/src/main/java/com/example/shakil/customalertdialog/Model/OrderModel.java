package com.example.shakil.customalertdialog.Model;

public class OrderModel {
    private String customerName;
    private int paymentAmount;
    private String paymentTime;
    private String paymentDate;
    private String orderId;
    private String orderStatus;

    public OrderModel() {
    }

    public OrderModel(String customerName, int paymentAmount, String paymentTime, String paymentDate, String orderId, String orderStatus) {
        this.customerName = customerName;
        this.paymentAmount = paymentAmount;
        this.paymentTime = paymentTime;
        this.paymentDate = paymentDate;
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

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
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
