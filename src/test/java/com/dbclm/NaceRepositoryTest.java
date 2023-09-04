package com.dbclm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.dbclm.model.NaceDetails;
import com.dbclm.repository.NaceRepository;

@DataJpaTest
public class NaceRepositoryTest {

	@Autowired
	NaceRepository repo;

	NaceDetails data;

	@BeforeEach
	void setup() {
		data = new NaceDetails(11, 11, 111, "111");
	}

	@AfterEach
	void tearDown() {
		data = null;
		repo.deleteAll();
	}
}