package com.simplilearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.model.Product;

public interface ProductRepsitory extends JpaRepository<Product, Long> {

	List<Product> findAllByCategory_Id(int id);

}
