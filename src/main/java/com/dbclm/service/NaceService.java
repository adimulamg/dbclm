package com.dbclm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbclm.model.NaceDetails;
import com.dbclm.repository.NaceRepository;

@Service
public class NaceService {
	
	@Autowired
	private NaceRepository repo;
	
	public NaceDetails getNaceDetails(int orderId) {
		return repo.findByOrderId(orderId);
	}
	
	public List<NaceDetails> getAllNaceDetails() {
		return repo.findAll();
	}
	
	public NaceDetails save(NaceDetails details) {
		return repo.save(details);
	}

}
