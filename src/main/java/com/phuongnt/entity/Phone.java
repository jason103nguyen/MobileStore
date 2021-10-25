package com.phuongnt.entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.phuongnt.dto.PhoneDto;

@Entity
@Table(name = "phone")
public class Phone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "phone_id")
	private int id;
	
	@Column(name = "phone_name")
	private String name;
	
	@Column(name = "phone_unit_price")
	private double unitPrice;
	
	@Column(name = "phone_unit_in_stock")
	private double unitInStock;
	
	@Column(name = "phone_description")
	private String description;
	
	@Column(name = "phone_manufacturer")
	private String manufacturer;
	
	@Column(name = "phone_category")
	private String category;
	
	@Column(name = "phone_condition")
	private String condition;
	
	@Column(name = "phone_image")
	private String image;
	
	public Phone() {}

	public Phone(String name, double unitPrice, double unitInStock, String description, String manufacturer,
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
	
	public Phone(PhoneDto phoneDto) {
		super();
		this.name = phoneDto.getName();
		this.unitPrice = phoneDto.getUnitPrice();
		this.unitInStock = phoneDto.getUnitInStock();
		this.description = phoneDto.getDescription();
		this.manufacturer = phoneDto.getManufacturer();
		this.category = phoneDto.getCategory();
		this.condition = phoneDto.getCondition();
		this.image = phoneDto.getImage();
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
		return "Phone [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + ", unitInStock=" + unitInStock
				+ ", description=" + description + ", manufacturer=" + manufacturer + ", category=" + category
				+ ", condition=" + condition + ", image=" + image + "]";
	}
	
}
