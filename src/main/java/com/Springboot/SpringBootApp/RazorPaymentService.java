package com.Springboot.SpringBootApp;

import org.springframework.stereotype.Component;

//@Component
public class RazorPaymentService implements PaymentService{

    @Override
    public String pay() {
        String payment = "Razorpay Payment";
          System.out.println("Payment from: " + payment);
        return payment;

    }
}
