package com.phuongnt.service;

import java.util.List;

import com.phuongnt.dto.PhoneDto;

public interface PhoneService {

	boolean create(PhoneDto PhoneDto);
	PhoneDto readOne(int id);
	List<PhoneDto> readAll();
	boolean update(PhoneDto PhoneDto);
	boolean delete(int id);
	void likeOperator(String field, String value);
	
}
