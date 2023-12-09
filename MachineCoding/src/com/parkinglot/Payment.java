package com.parkinglot;

import com.parkinglot.constants.PaymentMode;
import com.parkinglot.constants.PaymentStatus;

public class Payment extends BaseModel{
    private Bill bill;
    private PaymentMode mode;
    private PaymentStatus paymentStatus;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
