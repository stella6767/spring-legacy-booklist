package com.example.kang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kang.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;


@RequiredArgsConstructor
@Service
public class ProductService {

	private final ProductRepository productRepository;
	
	
//	public void save() {
//		productRepository.save(null);
//		
//	}
	
	

}
