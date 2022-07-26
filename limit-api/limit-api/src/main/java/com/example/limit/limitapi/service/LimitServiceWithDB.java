package com.example.limit.limitapi.service;


import com.example.limit.limitapi.dto.LimitDTO;
import com.example.limit.limitapi.model.LimitModel;
import com.example.limit.limitapi.repository.LimitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LimitServiceWithDB {
    @Autowired
    private LimitRepository repository;


    public LimitModel getLimitWithDB(Integer accountId){
        LimitDTO dto = repository.findByAccountId(accountId).get();
        LimitModel model = new LimitModel(dto.getAccountId(),dto.getDailyLimit(), dto.getRemainingLimit());

        return model;
    }

    public LimitDTO createLimitInDB(LimitDTO limitDTO){
        LimitDTO dto = repository.save(limitDTO);

        return  dto;

    }
}
