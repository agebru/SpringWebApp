package edu.mum.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.mum.model.Product;
import edu.mum.model.repo.ProductStore;

@Controller
public class ProductController {
	
	
	@RequestMapping("/products")
	@ResponseBody
	public List<Product> getProducts(){
		System.out.println("Printing list of products...");
		return ProductStore.loadProducts();
	}

	@RequestMapping("/hi")
	public String hi() {
		System.out.println("Hi");
		return "hello";
	}
}
