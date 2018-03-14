package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.api.Taxes;
import com.example.demo.constant.Constants;
import com.example.demo.dto.EmployeeDTO;

@Service
public class CalculateEmployeeTax extends Taxes {

	@Override
	public EmployeeDTO calculateFederalTax(EmployeeDTO empDTO) {
		// TODO Auto-generated method stub
		empDTO.setFederalTaxesPaid(empDTO.getAmount().multiply(Constants.FEDERAL_TAX_RATE));
		return empDTO;
	}

	@Override
	public EmployeeDTO calculateStateTax(EmployeeDTO empDTO) {
		// TODO Auto-generated method stub
		empDTO.setStateTaxesPaid(empDTO.getAmount().multiply(EmployeeService.mapState.get(empDTO.getAddress())));
		return empDTO;
	}

	@Override
	public EmployeeDTO calculateTemporaryTaxes(EmployeeDTO empDTO) {
		// TODO Auto-generated method stub
		empDTO.setTemporaryTaxesPaid(empDTO.getAmount().multiply(Constants.TEMPORARY_TAX_RATE));
		return empDTO;
	}

}
