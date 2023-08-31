package com.psja.CheckConstructorInjection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.psja.CheckConstructorInjection.service.ApplicationService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class ApplicationController {
	
	private ApplicationService applicationService;
	
	ApplicationController( ApplicationService applicationService ){
		this.applicationService = applicationService;
	}
	
	@RequestMapping( value = "/api/data", method = RequestMethod.GET )
	public String getData() {
		applicationService.getServiceCheck();
		return "Hi I am here";
	}
}
