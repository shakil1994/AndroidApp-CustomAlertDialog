package com.example.shakil.customalertdialog.Model;

public class PaymentHistoryDetailsModel {
    private String paymentId;
    private int paymentAmount;

    public PaymentHistoryDetailsModel() {
    }

    public PaymentHistoryDetailsModel(String paymentId, int paymentAmount) {
        this.paymentId = paymentId;
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
