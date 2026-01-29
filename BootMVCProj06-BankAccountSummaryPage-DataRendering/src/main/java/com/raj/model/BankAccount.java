package com.raj.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BankAccount {

	private Long accountNumber;
	private String holderName;
	private String accountType;
	private String branch;
	private Double balance;
	
}
