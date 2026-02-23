package com.raj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

	Admin findByUsernameAndPassword(String u,String p);
}
