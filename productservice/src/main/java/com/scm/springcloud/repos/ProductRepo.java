package com.scm.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scm.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
