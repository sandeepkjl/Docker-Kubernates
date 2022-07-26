package com.example.payment.paymentapi.model;

public class PaymentRequest {
    private int toAccountId;
    private int fromAccountId;
    private int paymentAmount;

    public PaymentRequest() {
    }

    public PaymentRequest(int toAccountId, int fromAccountId, int paymentAmount) {
        this.toAccountId = toAccountId;
        this.fromAccountId = fromAccountId;
        this.paymentAmount = paymentAmount;
    }

    public int getToAccountId() {
        return toAccountId;
    }

    public void setToAccountId(int toAccountId) {
        this.toAccountId = toAccountId;
    }

    public int getFromAccountId() {
        return fromAccountId;
    }

    public void setFromAccountId(int fromAccountId) {
        this.fromAccountId = fromAccountId;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "toAccountId=" + toAccountId +
                ", fromAccountId=" + fromAccountId +
                ", paymentAmount=" + paymentAmount +
                '}';
    }
}
