package com.example.shakil.customalertdialog.Model;

public class PaymentHistoryModel {
    private String paymentId;
    private String paymentDate;
    private int paymentAmount;

    public PaymentHistoryModel() {
    }

    public PaymentHistoryModel(String paymentId, String paymentDate, int paymentAmount) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
