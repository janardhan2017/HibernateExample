package com.otmmjpa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="contract_work")

public class ContractWork implements Serializable{

	@Id
	@Column(name="contract_no")
	private int contractNo;
	@Column(name="contract_Name")
	private String contractName;
	@Column(name="contract_date")
	private Date contractDate;
	@Column(name="duration")
	private String duration;
	
	@OneToMany
	@MapKeyColumn(name="procurement_no")
	@JoinColumn(name="contract_no")
	private Map<String,Material> materials;

	public int getContractNo() {
		return contractNo;
	}

	public void setContractNo(int contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public Date getContractDate() {
		return contractDate;
	}

	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Map<String, Material> getMaterials() {
		return materials;
	}

	public void setMaterials(Map<String, Material> materials) {
		this.materials = materials;
	}

	@Override
	public String toString() {
		return "ContractWork [contractNo=" + contractNo + ", contractName=" + contractName + ", contractDate="
				+ contractDate + ", duration=" + duration + ", materials=" + materials + "]";
	}



}
