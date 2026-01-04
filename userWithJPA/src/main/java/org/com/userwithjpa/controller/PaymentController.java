package org.com.userwithjpa.controller;

import org.com.userwithjpa.dto.PaymentRequestDTO;
import org.com.userwithjpa.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String initiatePayment(@RequestBody PaymentRequestDTO paymentRequestDTO) {
        return paymentService.getPaymentLink(paymentRequestDTO.getAmount(),
                paymentRequestDTO.getOrderId(),
                paymentRequestDTO.getPhoneNumber(),
                paymentRequestDTO.getName(),
                paymentRequestDTO.getEmail());
    }
}
