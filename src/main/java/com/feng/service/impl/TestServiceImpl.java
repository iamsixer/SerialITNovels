package com.feng.service.impl;

import com.feng.service.TestService;

public class TestServiceImpl implements TestService{

	@Override
	public String sayHello(String name) {
		
		return "hello" + name;
	}

}
