package com.raj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.entity.Product;
import com.raj.exception.ProductException;
import com.raj.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public String saveProduct(Product product) throws ProductException {
		
		if(product==null) {
			
			throw new ProductException("Product can't be Null");
		}
		
		Product prod = productRepo.save(product);
		return "ID: "+prod.getProductId()+" Product is added";
	}

	@Override
	public List<Product> findAllProducts() throws ProductException {
		
		List<Product> allProducts = productRepo.findAll();
		
		if(allProducts.isEmpty()) {
			
			throw new ProductException("Products Not Found");
		}
		return allProducts;
	}

	@Override
	public Product findByProductId(Integer id) throws ProductException {
		
		Product existingProduct = productRepo.findById(id)
				.orElseThrow(()-> new ProductException("Product Id Not Found"));
	
		return existingProduct;
	}

	@Override
	public void deleteById(Integer id) throws ProductException{
		
		productRepo.findById(id)
				.orElseThrow(()-> new ProductException("Product Id Not Found"));
		
		productRepo.deleteById(id);
	}
}
