package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.Taxes;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/empTaxes")
public class EmployeeTaxController {

	@Autowired
	private Taxes tax;

	@Autowired
	@Qualifier("empService")
	private EmployeeService service;

	@GetMapping("/getTaxes/{empId}")
	public EmployeeDTO getEmployeeTax(@PathVariable String empId) {
		EmployeeDTO empDTO = service.getEmployee(empId);
		empDTO = tax.calculateTax(empDTO);	
		return empDTO;

	}
}
