package com.example.kang.domain.book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Book {

	private int id;
	
	@JsonProperty("author")
	private String author = null; //귀찮으니 그냥 하나만 받자. 
	@JsonProperty("contents")
	private String contents;
	@JsonProperty("datetime")
	private String datetime;
	@JsonProperty("isbn")
	private String isbn;
	@JsonProperty("price")
	private Integer price;
	@JsonProperty("publisher")
	private String publisher;
	@JsonProperty("sale_price")
	private Integer salePrice;
	@JsonProperty("status")
	private String status;
	@JsonProperty("thumbnail")
	private String thumbnail;
	@JsonProperty("title")
	private String title;
	@JsonProperty("translator")
	private String translator = null;
	@JsonProperty("url")
	private String url;
	
	private List<String> test;

}