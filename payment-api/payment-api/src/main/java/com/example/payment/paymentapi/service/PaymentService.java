package com.example.payment.paymentapi.service;

import com.example.payment.paymentapi.model.LimitModel;
import com.example.payment.paymentapi.model.PaymentRequest;
import com.example.payment.paymentapi.model.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentService {

    @Value("${limit.api.url}")
    private String limitUrl;

    @Autowired
    private RestTemplate restTemplate;

    public PaymentResponse intiatePayment(PaymentRequest request) {
        String status = "";
        Integer accountId = request.getFromAccountId();
        String url =limitUrl+"/checkLimit"+"/"+accountId;

        System.out.println(url);

        ResponseEntity<LimitModel> responseEntity = restTemplate.getForEntity(url, LimitModel.class);
        LimitModel limitResponse = responseEntity.getBody();
        if (request.getPaymentAmount() <= limitResponse.getRemainingLimit()) {
            status = "Payment Successful";
        } else {
            status = "Limit Exceeded";
        }

        PaymentResponse response = mapResponse(request, status);

        return response;

    }

    public PaymentResponse mapResponse(PaymentRequest request, String status) {
        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse.setFromAccountId(request.getFromAccountId());
        paymentResponse.setToAccountId(request.getToAccountId());
        paymentResponse.setPaymentAmount(request.getPaymentAmount());
        paymentResponse.setStatus(status);

        return paymentResponse;
    }
}
