package com.ust.springangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.springangular.entities.Product;

public interface ProductJPARepo extends JpaRepository<Product, Integer> {

}
