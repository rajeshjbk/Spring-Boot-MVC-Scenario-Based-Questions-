package com.raj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
