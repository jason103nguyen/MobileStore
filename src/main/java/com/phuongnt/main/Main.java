package com.phuongnt.main;

import com.phuongnt.dto.PhoneDto;
import com.phuongnt.service.PhoneService;

public class Main {

	public static void main(String[] args) {
		PhoneDto phoneDto = new PhoneDto();
		phoneDto.setName("IPHONE XS MAX");
		
		PhoneService ps = new PhoneService();
		ps.create(phoneDto);
		
		PhoneDto phoneDtoOut = ps.readOne(1);
		System.out.println(phoneDtoOut.toString());
	}
}
