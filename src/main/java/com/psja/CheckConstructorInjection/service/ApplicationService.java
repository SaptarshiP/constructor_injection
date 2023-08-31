package com.psja.CheckConstructorInjection.service;

import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

	public void getServiceCheck() {
		System.out.println( "Hey service check" );
	}
	
}
