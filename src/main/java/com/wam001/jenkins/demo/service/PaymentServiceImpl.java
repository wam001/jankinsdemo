package com.wam001.jenkins.demo.service;

/**
 * @author Hamza Amentag (ham)
 * @since 6/14/2023
 */
public class PaymentServiceImpl implements PaymentService {
    @Override
    public Double sendPayment(Double amount) {
        if(amount == 0.0)
            throw new IllegalArgumentException("Input must be superior to zero");
        Double paymentFee = 1.05;
        return amount * paymentFee;
    }
}
