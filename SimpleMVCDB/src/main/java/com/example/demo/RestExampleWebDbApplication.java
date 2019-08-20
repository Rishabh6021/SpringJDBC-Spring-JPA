package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Payment;
import com.example.demo.services.PaymentService;

@SpringBootApplication
public class RestExampleWebDbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(RestExampleWebDbApplication.class, args);
		
		PaymentService service = ctx.getBean(PaymentService.class);
		Payment pmt = ctx.getBean(Payment.class);
		
		pmt.setCustomerName("Ramesh");
		pmt.setTxnAmount(4500.00);
		pmt.setTxnId(1020);
		
		service.save(pmt);
	}

}
