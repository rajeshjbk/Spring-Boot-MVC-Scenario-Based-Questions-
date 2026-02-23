package com.raj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.raj.entity.Product;
import com.raj.exception.ProductException;
import com.raj.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	// Add Product Page
    @GetMapping("/add")
    public String addPage(Model model){
        model.addAttribute("product", new Product());
        return "product";
    }
    
    // Save Product
    @PostMapping("/save")
    public String save(Product product) throws ProductException{
    	String saveProduct = productService.saveProduct(product);
     
    	System.out.println(saveProduct);
    	
    	return "redirect:/view";
    }
    
    // View All Products
    @GetMapping("/view")
    public String view(Model model) throws ProductException{
        
    	model.addAttribute("list", productService.findAllProducts());
       
        return "view_product";
    }

    // Edit Product
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) throws ProductException{
       
    	model.addAttribute("product", productService.findByProductId(id));
     
        return "update";
    }

    // Update Product
    @PostMapping("/update")
    public String update(Product product) throws ProductException{
    	productService.saveProduct(product);
      
    	return "update_success";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id) throws ProductException {
    	productService.deleteById(id);
        return "redirect:/view";
    }
}
