package com.demo.limitApi.model;

public class LimitModel {

    private int accountId;
    private int dailyLimit;
    private int remainingLimit;

    public LimitModel() {
    }

    public LimitModel(int accountId, int dailyLimit, int remainingLimit) {
        this.accountId = accountId;
        this.dailyLimit = dailyLimit;
        this.remainingLimit = remainingLimit;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
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
                "accountId=" + accountId +
                ", dailyLimit=" + dailyLimit +
                ", remainingLimit=" + remainingLimit +
                '}';
    }
}
