package com.example.kang.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.kang.domain.book.Book;
import com.github.pagehelper.Page;

@Repository
@Mapper
public interface BookRepository {

	public Book save(Book book); 
	public void deleteById(int id);
	public List<Book> findAll();
	public Book findById(int id);
	public Page<Book> findByPage();
	
}
