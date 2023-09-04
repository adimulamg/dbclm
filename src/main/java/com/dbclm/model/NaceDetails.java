package com.dbclm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "NaceDetails")
public class NaceDetails {

	@Id
	@GeneratedValue
	int id;
	int orderId;
	int level;
	int code;
	String description;
	
	public NaceDetails(int orderId, int level, int code, String description) {
		super();
		this.orderId = orderId;
		this.level = level;
		this.code = code;
		this.description = description;
	}
	
}
