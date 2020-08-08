package com.otmjpa.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "my_category")
public class Category implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_No")
	private int categoryNo;

	@Column(name = "category_name")

	private String categoryName;
	
	@Column(name = "description")
	private String description;
@OneToMany
@JoinColumn(name="category_no")
	private Set<Product> products;
public int getCategoryNo() {
	return categoryNo;
}
public void setCategoryNo(int categoryNo) {
	this.categoryNo = categoryNo;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Set<Product> getProducts() {
	return products;
}
public void setProducts(Set<Product> products) {
	this.products = products;
}
@Override
public String toString() {
	return "Category [categoryNo=" + categoryNo + ", categoryName=" + categoryName + ", description=" + description
			+ ", products=" + products + "]";
}
	
}
