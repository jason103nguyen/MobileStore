package com.phuongnt.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.phuongnt.entity.Phone;

public class PhoneDto {

	private int id;
	private String name;
	private double unitPrice;
	private double unitInStock;
	private String description;
	private String manufacturer;
	private String category;
	private String condition;
	private String image;
	
	public PhoneDto() {}
	
	public PhoneDto(String name, double unitPrice, double unitInStock, String description, String manufacturer,
			String category, String condition, String image) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
		this.description = description;
		this.manufacturer = manufacturer;
		this.category = category;
		this.condition = condition;
		this.image = image;
	}
	
	public PhoneDto(Phone phone) {
		super();
		this.name = phone.getName();
		this.unitPrice = phone.getUnitPrice();
		this.unitInStock = phone.getUnitInStock();
		this.description = phone.getDescription();
		this.manufacturer = phone.getManufacturer();
		this.category = phone.getCategory();
		this.condition = phone.getCondition();
		this.image = phone.getImage();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(double unitInStock) {
		this.unitInStock = unitInStock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "PhoneDto [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + ", unitInStock=" + unitInStock
				+ ", description=" + description + ", manufacturer=" + manufacturer + ", category=" + category
				+ ", condition=" + condition + ", image=" + image + "]";
	}
	
}
