package com.mwlee.ioc.containeroverview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Bservice {
	
	private Aservice aService;
	
	@Autowired
	public Bservice(Aservice aService) {
		this.aService = aService;
	}
	
}
