package org.com.userwithjpa.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequestDTO {
    Long amount;
    String orderId;
    String phoneNumber;
    String name;
    String email;
}
