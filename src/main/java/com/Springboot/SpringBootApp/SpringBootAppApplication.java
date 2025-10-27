package com.Springboot.SpringBootApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

private final PaymentService paymentService;

   public SpringBootAppApplication(PaymentService paymentService){
	   this.paymentService = paymentService;
   }

	@Override
	public void run(String... args) throws Exception {
      String payment = paymentService.pay();
	  System.out.println("Payment done: " + payment);
	}
}






