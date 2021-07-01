package com.example.kang.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.kang.domain.Product;

@Mapper
public interface ProductRepository {
	public void save(Product product); 
	public void deleteById(int id);
	public void update(Product product);
	public List<Product> findAll();
	public Product findById(int id);	
	
}
