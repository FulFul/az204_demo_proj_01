package com.fula.springexamplerest.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ( value = "/products" )
public class HelloController {

	@GetMapping ( "/{product_id}" )
	@ResponseStatus ( HttpStatus.CREATED )
	public String createHotel( @PathVariable ( name = "product_id" ) String productId, HttpServletRequest request, HttpServletResponse response ) {
		return "This is a product number " + productId;
	}

	@GetMapping ( "/test" )
	@ResponseStatus ( HttpStatus.CREATED )
	public String test( HttpServletRequest request, HttpServletResponse response ) {
		return "Test SUCCESSFUL";
	}
}
