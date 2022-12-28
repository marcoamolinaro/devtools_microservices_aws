package com.scm.sringcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scm.sringcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
