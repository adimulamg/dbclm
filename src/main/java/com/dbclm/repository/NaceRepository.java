package com.dbclm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbclm.model.NaceDetails;

@Repository
public interface NaceRepository extends JpaRepository<NaceDetails, Integer>{

	public NaceDetails findByOrderId(int OrderId);

}
