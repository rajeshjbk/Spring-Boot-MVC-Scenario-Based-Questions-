package com.raj.service;

import java.util.List;

import com.raj.entity.Product;
import com.raj.exception.ProductException;

public interface ProductService {

	public String saveProduct(Product product) throws ProductException;
	
	public List<Product> findAllProducts() throws ProductException;
	
	public Product findByProductId(Integer id) throws ProductException;
	
	public void deleteById(Integer id) throws ProductException;
}
