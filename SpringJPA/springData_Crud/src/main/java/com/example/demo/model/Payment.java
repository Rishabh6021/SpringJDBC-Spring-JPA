package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="vdsi_payment")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment {
	
	@Id
	@GeneratedValue
	@Column(name="txnId")
	private long txnId;
	
	@Column(name="customerName")
	private String customerName;
	
	private double txnAmount;

}
