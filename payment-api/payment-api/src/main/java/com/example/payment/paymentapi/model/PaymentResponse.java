package com.example.payment.paymentapi.model;

public class PaymentResponse {
    private int toAccountId;
    private int fromAccountId;
    private int paymentAmount;
    private String status;

    public PaymentResponse() {
    }

    public PaymentResponse(int toAccountId, int fromAccountId, int paymentAmount, String status) {
        this.toAccountId = toAccountId;
        this.fromAccountId = fromAccountId;
        this.paymentAmount = paymentAmount;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PaymentResponse{" +
                "toAccountId=" + toAccountId +
                ", fromAccountId=" + fromAccountId +
                ", paymentAmount=" + paymentAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
