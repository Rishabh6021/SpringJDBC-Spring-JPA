package com.example.demo.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment,Long> {
	
	public List<Payment> findByCustomerName(String custName);
	
	public List<Payment> findByCustomerNameAndTxnAmount(String custName,double amount);

}
