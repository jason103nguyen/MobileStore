package com.phuongnt.main;

import com.phuongnt.dto.PhoneDto;
import com.phuongnt.service.PhoneServiceImpl;

public class Main {

	public static void main(String[] args) {
		PhoneDto phoneDto = new PhoneDto();
		phoneDto.setName("IPHONE XS MAX");
		
		PhoneServiceImpl ps = new PhoneServiceImpl();
		ps.create(phoneDto);
		
		PhoneDto phoneDtoOut = ps.readOne(1);
		System.out.println(phoneDtoOut.toString());
	}
}
