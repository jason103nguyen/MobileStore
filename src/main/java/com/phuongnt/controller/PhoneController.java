package com.phuongnt.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.phuongnt.dto.PhoneDto;
import com.phuongnt.service.PhoneService;

@Controller
public class PhoneController {

	@RequestMapping("/add-phone")
	public ModelAndView addPhone(HttpServletRequest request, HttpServletResponse response) {
		
		String name = request.getParameter("productName");
		int unitPrice = Integer.parseInt(request.getParameter("unitPrice"));
		double unitInStock = Double.parseDouble(request.getParameter("unitInStock"));
		String description = request.getParameter("description");
		String manufacturer = request.getParameter("manufacturer");
		String category = request.getParameter("category");
		String condition = request.getParameter("condition");
//		String image = request.getParameter("image");
		
		PhoneService phoneService = new PhoneService();
		PhoneDto phone = new PhoneDto();
		phone.setName(name);
		phone.setUnitPrice(unitPrice);
		phone.setUnitInStock(unitInStock);
		phone.setDescription(description);
		phone.setManufacturer(manufacturer);
		phone.setCategory(category);
		phone.setCondition(condition);
		
		
		phoneService.create(phone);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addPhone");
		
		return mv;
		
	}
}
