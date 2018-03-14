/**
 * 
 */
package com.example.demo.api;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDTO;

/**
 * @author hp
 *
 */
@Service
public abstract class Taxes {

	public final EmployeeDTO calculateTax(EmployeeDTO empDTO) {
		empDTO = calculateFederalTax(empDTO);
		empDTO = calculateStateTax(empDTO);
		if (empDTO.isTemporaryTaxFlag())
			empDTO = calculateTemporaryTaxes(empDTO);
		else
			empDTO.setTemporaryTaxesPaid(new BigDecimal(0));
		return empDTO;
	}

	public abstract EmployeeDTO calculateFederalTax(EmployeeDTO empDTO);

	public abstract EmployeeDTO calculateStateTax(EmployeeDTO empDTO);

	public abstract EmployeeDTO calculateTemporaryTaxes(EmployeeDTO empDTO);

}
