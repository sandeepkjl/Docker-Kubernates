package com.demo.limitApi.service;

import com.demo.limitApi.model.LimitModel;
import org.springframework.stereotype.Service;

@Service
public class LimitService {

    public LimitModel getLimit(int accountId){
        return new LimitModel(12345,40000,20000);
    }
}
