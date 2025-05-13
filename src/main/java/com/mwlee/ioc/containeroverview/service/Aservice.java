package com.mwlee.ioc.containeroverview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 빈은 디폴트 이름은 보통 클래스 이름인데, 클래스의 첫글자가 소문자로 됨.
public class Aservice {
	
	private Bservice bService;
	
	@Autowired
	public Aservice(Bservice bService) {
		this.bService = bService;
	}
	
	@Autowired
	public void setbService(Bservice bService) {
		this.bService = bService;
	}
	
}
