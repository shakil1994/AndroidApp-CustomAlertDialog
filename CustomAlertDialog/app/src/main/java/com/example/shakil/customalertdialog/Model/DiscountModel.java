package com.example.shakil.customalertdialog.Model;

public class DiscountModel {
    private String discountCouponName;
    private String dateTime;
    private int discountAmount;

    public DiscountModel() {
    }

    public DiscountModel(String discountCouponName, String dateTime, int discountAmount) {
        this.discountCouponName = discountCouponName;
        this.dateTime = dateTime;
        this.discountAmount = discountAmount;
    }

    public String getDiscountCouponName() {
        return discountCouponName;
    }

    public void setDiscountCouponName(String discountCouponName) {
        this.discountCouponName = discountCouponName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }
}
