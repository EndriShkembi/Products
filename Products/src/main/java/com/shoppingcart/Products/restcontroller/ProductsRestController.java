package com.shoppingcart.Products.restcontroller;

import java.util.List;

import com.shoppingcart.Products.model.Products;
import com.shoppingcart.Products.repository.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsRestController {
	@Autowired
	ProductsRepo productsRepo;
	
	@GetMapping("/rest/products")
	public List<Products> getProducts(){
		return productsRepo.findAll();
	}
}
