package com.example.limit.limitapi.dto;

import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;


@Entity
@Table(name = "LimitTable")
public class LimitDTO {
    @Id
    private int accountId;

    private int dailyLimit;
    private int remainingLimit;

    public LimitDTO() {
    }

    public LimitDTO(int accountId, int dailyLimit, int remainingLimit) {
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

    public int getRemainingLimit() {
        return remainingLimit;
    }

    public void setDailyLimit(int dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public void setRemainingLimit(int remainingLimit) {
        this.remainingLimit = remainingLimit;
    }

    @Override
    public String toString() {
        return "LimitDTO{" +
                "accountId=" + accountId +
                ", dailyLimit=" + dailyLimit +
                ", remainingLimit=" + remainingLimit +
                '}';
    }
}
