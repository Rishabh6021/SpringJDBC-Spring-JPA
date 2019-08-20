package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long> {

}
