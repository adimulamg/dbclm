package com.dbclm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbclm.model.NaceDetails;
import com.dbclm.service.NaceService;

@RestController
@RequestMapping("/dbclm")
public class DBCLController {

	@Autowired
	private NaceService service;

	@PostMapping("/order")
	public String putNaceDetails(@RequestBody NaceDetails details) {
		service.save(details);
		return "NaceDetails saved to database";
	}

	@GetMapping(value = "/{orderId}")
	public NaceDetails getNaceDetails(@PathVariable("orderId") int orderid) {
		return service.getNaceDetails(orderid);
	}
	
	@GetMapping("/getAllNaceDetails")
	public List<NaceDetails> getAllNaceDetails() {
		return service.getAllNaceDetails();
	}
	
	@GetMapping("/hello")
	public String display() {
		return "Hello World";
	}
}
