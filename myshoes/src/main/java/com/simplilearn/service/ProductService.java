package com.simplilearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.model.Product;
import com.simplilearn.repository.ProductRepsitory;

@Service
public class ProductService {

	@Autowired
	ProductRepsitory productRepsitory;
	
	public List<Product> getAllProducts(){
		return productRepsitory.findAll();
		
	}
	public void addProduct(Product product) {
		productRepsitory.save(product);
	}
	
	public void removeProductById(long id) {
		productRepsitory.deleteById(id);
	}
	
	public Optional<Product> getProductById(long id){
		return productRepsitory.findById(id);
	}
	public List<Product> getAllProductByCategoryId(int id){
		return productRepsitory.findAllByCategory_Id(id);
			
		}
	
}
