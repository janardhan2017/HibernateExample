package com.otmmjpa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="my_material")
public class Material  implements Serializable{
@Id
@Column(name="materail_no")
@GeneratedValue(strategy=GenerationType.AUTO)
	private int materialNo;
@Column(name="material_name")

	private String materialName;

	private double cost;
	
	
	private double quantity;


	public int getMaterialNo() {
		return materialNo;
	}


	public void setMaterialNo(int materialNo) {
		this.materialNo = materialNo;
	}


	public String getMaterialName() {
		return materialName;
	}


	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public double getQuantity() {
		return quantity;
	}


	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Material [materialNo=" + materialNo + ", materialName=" + materialName + ", cost=" + cost
				+ ", quantity=" + quantity + "]";
	}
	
}

