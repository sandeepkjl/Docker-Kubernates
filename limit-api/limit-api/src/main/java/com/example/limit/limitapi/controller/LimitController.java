package com.example.limit.limitapi.controller;

import com.example.limit.limitapi.dto.LimitDTO;
import com.example.limit.limitapi.model.LimitModel;
import com.example.limit.limitapi.service.LimitServiceWithDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LimitController {

    @Autowired
    private LimitServiceWithDB limitServiceWithDB;


    @GetMapping("/checkLimit/{accountId}")
    public ResponseEntity<LimitModel> checkLimitWithDB(@PathVariable("accountId") Integer accountId) {
        LimitModel modelResult = limitServiceWithDB.getLimitWithDB(accountId);

        return new ResponseEntity<LimitModel>(modelResult, HttpStatus.OK);
    }

    @PostMapping("/createLimit")
    public ResponseEntity<LimitDTO> createLimit(@RequestBody LimitDTO limitDTO){
        LimitDTO dtoResult = limitServiceWithDB.createLimitInDB(limitDTO);

        return new ResponseEntity<LimitDTO>(dtoResult, HttpStatus.OK);
    }

}
