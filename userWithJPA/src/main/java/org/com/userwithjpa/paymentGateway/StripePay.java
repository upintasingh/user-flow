package org.com.userwithjpa.paymentGateway;

import org.springframework.stereotype.Component;

@Component
public class StripePay implements IpaymentGateway {
    @Override
    public String generatePaymentLink(Long amount, String orderId, String phoneNumber, String name, String email) {
        return "";
    }
}
