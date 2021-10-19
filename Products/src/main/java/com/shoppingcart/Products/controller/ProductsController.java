package com.shoppingcart.Products.controller;

import com.shoppingcart.Products.repository.ProductsRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductsController {

	ProductsRepo productRepo;

	public ProductsController(ProductsRepo productRepo) {
		super();
		this.productRepo = productRepo;
	}
	@GetMapping("/products")
	public String getAllProducts(Model model) {
		model.addAttribute("products", productRepo.findAll());
		return "products";
	}
}
