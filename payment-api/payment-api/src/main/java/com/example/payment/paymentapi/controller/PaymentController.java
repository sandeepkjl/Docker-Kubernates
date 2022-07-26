package com.example.payment.paymentapi.controller;

import com.example.payment.paymentapi.model.PaymentRequest;
import com.example.payment.paymentapi.model.PaymentResponse;
import com.example.payment.paymentapi.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("doPayment")
    public ResponseEntity<PaymentResponse> doPayment(@RequestBody PaymentRequest request){
        return new ResponseEntity<PaymentResponse>(service.intiatePayment(request), HttpStatus.OK);

        //return new ResponseEntity<PaymentResponse>(new PaymentResponse(12345,54321,50000,"success"), HttpStatus.OK);
    }

}
