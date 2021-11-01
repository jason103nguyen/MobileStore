package com.phuongnt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.phuongnt.dto.PhoneDto;
import com.phuongnt.service.PhoneServiceImpl;

@Controller
public class PhoneController {

	private PhoneServiceImpl phoneService = new PhoneServiceImpl();

	@RequestMapping(value = {"/add-phone"}, method = RequestMethod.POST)
	public ModelAndView addPhone(HttpServletRequest request, HttpServletResponse response) {

		String name = request.getParameter("productName");
		int unitPrice = Integer.parseInt(request.getParameter("unitPrice"));
		double unitInStock = Double.parseDouble(request.getParameter("unitInStock"));
		String description = request.getParameter("description");
		String manufacturer = request.getParameter("manufacturer");
		String category = request.getParameter("category");
		String condition = request.getParameter("condition");
//		String image = request.getParameter("image");

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
		mv.setViewName("addPhone.jsp");

		return mv;
	}

	@RequestMapping(value = {"/show-phone"}, method = RequestMethod.GET)
	public ModelAndView showPhone(HttpServletRequest request, HttpServletResponse response) {

		List<PhoneDto> listPhone = new ArrayList<>();
		listPhone = phoneService.readAll();

		ModelAndView mv = new ModelAndView();
		mv.setViewName("showPhone.jsp");
		mv.addObject("listPhone", listPhone);

		Integer numberPhone = listPhone.size();
		mv.addObject("numberPhone", numberPhone);

		return mv;
	}
}