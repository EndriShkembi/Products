package com.shoppingcart.Products.repository;

import com.shoppingcart.Products.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductsRepo extends JpaRepository<Products, Long> {

}
