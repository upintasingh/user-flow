package org.com.userwithjpa.service;

import org.com.userwithjpa.paymentGateway.IpaymentGateway;
import org.com.userwithjpa.paymentGateway.PaymentGatewayStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentGatewayStrategy paymentGatewayStrategy;

    public String getPaymentLink(Long amount, String orderId, String phoneNumber, String name, String email)
    {
        IpaymentGateway ipaymentGateway = paymentGatewayStrategy.getPaymentGateway();
        return ipaymentGateway.generatePaymentLink(amount, orderId, phoneNumber, name, email);
    }
}
