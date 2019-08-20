package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Payment;
import com.example.demo.repos.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	@Qualifier("paymentRepository") //Allows us to specify out of 2 which repository to be used.
	private CrudRepository<Payment,Long> repo;
	
	public Iterable<Payment> findAll()
	{
		return repo.findAll();
	}
	
	public List<Payment> searchByCustomerName(String name)
	{
		PaymentRepository paymentRepo =(PaymentRepository)repo;
		
		return paymentRepo.findByCustomerName(name);
		
	}
	
	public List<Payment> searchByNameAndAmount(String name,double amount)
	{
		PaymentRepository paymentRepo=(PaymentRepository)repo;
		return paymentRepo.findByCustomerNameAndTxnAmount(name, amount);
	}

	
}
