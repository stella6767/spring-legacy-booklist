package com.example.kang.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.kang.domain.book.Book;
import com.example.kang.repository.BookRepository;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BookServiceUnitTest {

	@Autowired
	private BookService bookService;

	@Autowired
	private BookRepository bookRepository;
	
	@Test
	public void testExist() {

		log.info(bookService);
		assertNotNull(bookService);
	}
	
	
	@Test
	public void pageTest() {
		
		Page<Book> books = bookService.pageTest();
		
		log.info(books);
	}
	
	@Test
	public void selectAllPaging() {
	    int perPage = 10;
	    // 몇 페이지에 대한 조회인지 설정 후 조회
	    PageHelper.startPage(1, perPage);
	    Page<Book> p = bookRepository.pageTest();
	    //log.info("1 page: {}", p);
	    log.info("1page: " + p);
	    
	    PageHelper.startPage(2, perPage);
	    p =  bookRepository.pageTest();
	    //log.info("2 page: {}", p);
	    log.info("2page: " + p);
	    
	    
	    PageHelper.startPage(10, perPage);
	    p =  bookRepository.pageTest();
	    log.info("10page: " + p);
	    
	    PageHelper.startPage(11, perPage);
	    p =  bookRepository.pageTest();
	    log.info("11page: " + p);   
	   
//	    
//	    PageInfo<Book> books = new PageInfo<Book>(p);
//	    log.info("pageInfo: "+books);
	}
	
	@Test
	public void pageInfoTest() {
		
	    int perPage = 10;
		
	    PageHelper.startPage(11, perPage);

	    List<Book> books = bookRepository.findAll();
	    PageInfo<Book> pageBooks = new PageInfo<Book>(books);
	    
	    log.info(pageBooks.isIsLastPage()); 
	    
	    log.info("pageInfo" + pageBooks);
	}
	
	
}