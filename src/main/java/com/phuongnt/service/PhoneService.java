package com.phuongnt.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.phuongnt.dao.PhoneDao;
import com.phuongnt.dto.PhoneDto;
import com.phuongnt.entity.Phone;

public class PhoneService {

    private PhoneDao PhoneDao;
    
    public PhoneService() {
    	this.PhoneDao = new PhoneDao();
    }

    public boolean create(PhoneDto PhoneDto) {
        try {
            Phone Phone = new Phone(PhoneDto);
            Phone.setId(0);
            int newId = (int) PhoneDao.create(Phone);
            PhoneDto.setId(newId);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public PhoneDto readOne(int id) {
        PhoneDto PhoneDto = null;
        try {
            Phone Phone = PhoneDao.readOne(id);
            if (Phone != null) {
                PhoneDto = new PhoneDto(Phone);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return PhoneDto;
    }

    public List<PhoneDto> readAll() {
        List<Phone> PhoneList = PhoneDao.readAll();
        List<PhoneDto> PhoneDtoList = new ArrayList<>();
        for (Phone Phone : PhoneList) {
            PhoneDtoList.add(new PhoneDto(Phone));
        }
        
        for (PhoneDto PhoneDto : PhoneDtoList) {
        	System.out.println(PhoneDto.toString());
        }
        
        return PhoneDtoList;
    }

    public boolean update(PhoneDto PhoneDto) {
        try {
            Phone Phone = new Phone(PhoneDto);
            PhoneDao.update(Phone);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean delete(int id) {
        try {
            PhoneDao.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public void likeOperator(String field, String value) {
    	
    	List<Phone> PhoneList = PhoneDao.likeOperator(field, value);
    	List<PhoneDto> PhoneDtoList = new ArrayList<>();
    	
    	if (PhoneList.isEmpty()) {
    		System.out.println(String.format("The Phone with %s: %s doesn't exist!",field, value));
    		return;
    	}
    	
    	for (Phone Phone : PhoneList) {
    		PhoneDtoList.add(new PhoneDto(Phone));
		}
    	
    	System.out.println(String.format("Info of Phones with %s: %s is: ", field, value));
		for (PhoneDto PhoneDto : PhoneDtoList) {
			System.out.println(PhoneDto.toString());
		}
    }

}