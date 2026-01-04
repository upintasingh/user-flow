package org.com.userwithjpa.paymentGateway;

public interface IpaymentGateway {
    String generatePaymentLink(Long amount, String orderId, String phoneNumber, String name, String email);
}
