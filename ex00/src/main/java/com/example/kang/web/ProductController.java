package com.example.kang.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kang.domain.Product;
import com.example.kang.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ProductController {
	
	private final ProductRepository productRepository;
	
	@PostMapping("/product")
	public String save(@RequestBody Product product) {
		productRepository.save(product);
		return "ok";
	}
	
	
	
}
