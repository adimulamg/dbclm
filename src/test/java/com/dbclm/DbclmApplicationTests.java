package com.dbclm;

import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.dbclm.model.NaceDetails;
import com.dbclm.repository.NaceRepository;
import com.dbclm.service.NaceService;

@SpringBootTest
class DbclmApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	NaceService service;

	@MockBean
	private NaceRepository repo;

	@Test
	public void getAllNaceDetails() {
		when(repo.findAll()).thenReturn(Stream.of(new NaceDetails(11, 11, 11, "11"), new NaceDetails(22, 22, 22, "22")).collect(Collectors.toList()));
		assertEquals(2,service.getAllNaceDetails().size());
	}
	
	@Test
	public void saveNaceDetails() {
		NaceDetails data = new NaceDetails(11, 11, 11, "11");
		when(repo.save(data)).thenReturn(data);
		assertEquals(data, service.save(data));
	}

}
