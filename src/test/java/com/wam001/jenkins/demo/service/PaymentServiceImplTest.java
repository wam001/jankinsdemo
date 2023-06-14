package com.wam001.jenkins.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceImplTest {
    PaymentService paymentService = new PaymentServiceImpl();
    @Test
    void calculateRate() {
        Double amountToPay = paymentService.sendPayment(100.00);
        assertEquals(105.0, amountToPay);
    }

    @Test
    void calculateRateWithBadData(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Double amountToPay = paymentService.sendPayment(0.0);
        });
    }

    @Test
    void calculateWithNullValue(){
        Exception exception = assertThrows(NullPointerException.class, () -> {
            Double varRate = paymentService.sendPayment(null);
        });
    }
}