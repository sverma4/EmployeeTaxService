package com.example.demo.dto;

import java.math.BigDecimal;

public class EmployeeDTO {

	private String name;
	private String empId;
	private BigDecimal federalTaxesPaid;
	private BigDecimal stateTaxesPaid;
	private BigDecimal temporaryTaxesPaid;
	private int age;
	private String address;
	private BigDecimal amount;
	private boolean temporaryTaxFlag;
	
	public EmployeeDTO(String name, String empId, BigDecimal federalTaxesPaid, BigDecimal stateTaxesPaid,
			BigDecimal temporaryTaxesPaid, int age,BigDecimal amount,boolean temporaryTaxFlag,String address) {
		this.name = name;
		this.empId = empId;
		this.federalTaxesPaid = federalTaxesPaid;
		this.stateTaxesPaid = stateTaxesPaid;
		this.temporaryTaxesPaid = temporaryTaxesPaid;
		this.age = age;
		this.amount = amount;
		this.temporaryTaxFlag = temporaryTaxFlag;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setFederalTaxesPaid(BigDecimal federalTaxesPaid) {
		this.federalTaxesPaid = federalTaxesPaid;
	}

	public void setStateTaxesPaid(BigDecimal stateTaxesPaid) {
		this.stateTaxesPaid = stateTaxesPaid;
	}

	public void setTemporaryTaxesPaid(BigDecimal temporaryTaxesPaid) {
		this.temporaryTaxesPaid = temporaryTaxesPaid;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setTemporaryTaxFlag(boolean temporaryTaxFlag) {
		this.temporaryTaxFlag = temporaryTaxFlag;
	}

	public boolean isTemporaryTaxFlag() {
		return temporaryTaxFlag;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public String getName() {
		return name;
	}

	public String getEmpId() {
		return empId;
	}

	public BigDecimal getFederalTaxesPaid() {
		return federalTaxesPaid;
	}

	public BigDecimal getStateTaxesPaid() {
		return stateTaxesPaid;
	}

	public BigDecimal getTemporaryTaxesPaid() {
		return temporaryTaxesPaid;
	}

	public int getAge() {
		return age;
	}

}
