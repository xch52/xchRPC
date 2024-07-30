package com.xch.service;

import org.springframework.stereotype.Service;

import com.xch.model.User;

@Service
public class TestService {
	public void test(User user){
		System.out.println("调用了TestService.test");
	}
}
