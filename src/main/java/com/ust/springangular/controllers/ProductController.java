package com.ust.springangular.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.springangular.entities.Product;
import com.ust.springangular.services.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@GetMapping("/")
	public List<Product> fetchAllEmployee(){
		return productService.fetchAllProducts();
	}
	
	@PostMapping("/")
	public ResponseEntity<Void> addProduct(@RequestBody Product prod){
		productService.addProduct(prod);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id){
		ResponseEntity<String> re = null;
		try{
			productService.deleteEmployee(id);
			re = ResponseEntity.ok().body("product has been deleted successfully.");
		}
		catch(EmptyResultDataAccessException e){
			re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	return re;
}

}