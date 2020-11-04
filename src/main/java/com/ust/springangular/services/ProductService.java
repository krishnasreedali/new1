package com.ust.springangular.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.springangular.entities.Product;
import com.ust.springangular.repository.ProductJPARepo;

@Service
public class ProductService {

	@Autowired
	ProductJPARepo productRepository;
	
	public List<Product> fetchAllProducts() {
		return productRepository.findAll();
	}
	
	public void addProduct(Product prod) {
		productRepository.save(prod);
	}
	public void deleteEmployee(int id) {
		productRepository.deleteById(id);;
	}
}
