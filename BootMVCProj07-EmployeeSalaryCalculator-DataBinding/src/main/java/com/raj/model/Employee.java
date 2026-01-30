package com.raj.model;

import lombok.Data;

@Data
public class Employee {

	private String name;
	private Double basicSalary;
	private Double hra;
	private Double taxPercentage;

}
