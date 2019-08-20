package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Payment;
import com.example.demo.repos.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository repo;
	
	
	public Payment save(Payment entity) {
		return repo.save(entity);
	}
	
	
	
	public Iterable<Payment> findAll(){
		return repo.findAll();
	}
	

}
