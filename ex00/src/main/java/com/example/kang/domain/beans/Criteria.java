package com.example.kang.domain.beans;

import lombok.Data;

@Data
public class Criteria { //필요없을듯..

	private int pageNum;
	private int amount=20;
	
//	public Criteria(int pageNum, int amount) {
//		this.pageNum = pageNum;
//		this.amount = amount;
//	}
//	
	public Criteria(int amount) {
		this.amount = amount;
	}
		
	
}
