package com.example.kang.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.example.kang.handler.customException.MyNullException;
import com.example.kang.utils.Script;

@RestController //데이터를 리턴하기 위해서 //xml 설정이니 scan 해줘야겠지. 귀찮네..
@ControllerAdvice //모든 익셉션을 낚아챔.
public class GlobalExceptionHandler {

	private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	
	@ExceptionHandler(value = MyNullException.class)
	public String myNullException(MyNullException e){
		
		log.info("뭐야 왜 안 들어옴??");
		
		return Script.back("찾을려는 데이터가 없습니다.");
	}
	
	
}