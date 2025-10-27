package com.Springboot.SpringBootApp;

import org.springframework.stereotype.Component;

@Component
public class stripePaymentService implements PaymentService{
    @Override
    public String pay() {
        String payment = "Stripe Payment";
        System.out.println("Paying from..."+payment);
        return payment;
    }
}
