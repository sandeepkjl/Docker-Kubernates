package com.demo.limitApi.controller;

import com.demo.limitApi.model.LimitModel;
import com.demo.limitApi.service.LimitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private LimitService service;


    @GetMapping("/checkLimit/{accountId}")
    public ResponseEntity<LimitModel> checkLimitWithDB(@PathVariable("accountId") Integer accountId) {
        LimitModel modelResult = service.getLimit(accountId);

        return new ResponseEntity<LimitModel>(modelResult, HttpStatus.OK);
    }
}
