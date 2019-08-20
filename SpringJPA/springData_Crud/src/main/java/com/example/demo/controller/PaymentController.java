package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.services.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	private PaymentService service;
	
	@GetMapping("/getAll")
	public  Iterable<Payment> findAll()
	{
		return this.service.findAll();
	}
	
	@GetMapping("/search/{name}")
	public List<Payment> searchByCustomerName(@PathVariable("name") String name)
	{
		return this.service.searchByCustomerName(name);
	}
	
	@GetMapping("/searchByNameAndAmount/{name}/{amount}")
	public List<Payment> searchByNameAndAmount(@PathVariable("name") String name,@PathVariable("amount") double amount)
	{
		return this.service.searchByNameAndAmount(name,amount);
	}
	
	@GetMapping("/getAsView")
	public String showInView(Model model)
	{ 
		Iterable<Payment> list =this.service.findAll();
		model.addAttribute("list",list);
		return "show";
	}

}
