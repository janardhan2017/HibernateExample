package com.otmjpa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="my_product")
public class Product implements Serializable  {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="product_no")
private int productNo;
@Column(name="product_name")
	private String productName;

	private String description;
	private String manufacurer;
@Column(name="warranty_In_years")
	private String warrantyYears;
@Column(name="produt_price")
	private double price;
	
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacurer() {
		return manufacurer;
	}
	public void setManufacurer(String manufacurer) {
		this.manufacurer = manufacurer;
	}
	public String getWarrantyYears() {
		return warrantyYears;
	}
	public void setWarrantyYears(String warrantyYears) {
		this.warrantyYears = warrantyYears;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", description=" + description
				+ ", manufacurer=" + manufacurer + ", warrantyYears=" + warrantyYears + ", price=" + price + "]";
	}
	

}
