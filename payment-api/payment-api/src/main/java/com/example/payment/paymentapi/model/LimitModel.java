package com.example.payment.paymentapi.model;

public class LimitModel {
    private int dailyLimit;
    private int remainingLimit;

    public LimitModel(int dailyLimit, int remainingLimit) {
        this.dailyLimit = dailyLimit;
        this.remainingLimit = remainingLimit;
    }

    public LimitModel() {
    }

    public int getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(int dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public int getRemainingLimit() {
        return remainingLimit;
    }

    public void setRemainingLimit(int remainingLimit) {
        this.remainingLimit = remainingLimit;
    }


    @Override
    public String toString() {
        return "LimitModel{" +
                "dailyLimit=" + dailyLimit +
                ", remainingLimit=" + remainingLimit +
                '}';
    }
}
