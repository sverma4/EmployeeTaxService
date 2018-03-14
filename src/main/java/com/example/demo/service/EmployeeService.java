/**
 * 
 */
package com.example.demo.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.constant.Constants;
import com.example.demo.dto.EmployeeDTO;

/**
 * @author hp
 *
 */
@Service("empService")
public class EmployeeService {

	public static Map<String, EmployeeDTO> mapEmp = new HashMap<>();
	public static Map<String, BigDecimal> mapState = new HashMap<>();

	static {

		mapEmp.put("1", new EmployeeDTO("John", "1", null, null, null, 23,new BigDecimal(1000),false,"California"));
		mapEmp.put("2", new EmployeeDTO("Ron", "2", null, null, null, 24,new BigDecimal(2000),false,"Florida"));
		mapEmp.put("3", new EmployeeDTO("Sanjay", "3", null, null, null, 25,new BigDecimal(3000),true,"Texas"));
		mapEmp.put("4", new EmployeeDTO("Malik", "4", null, null, null, 26,new BigDecimal(4000),false,"California"));
		mapEmp.put("5", new EmployeeDTO("Sam", "5", null, null, null, 27,new BigDecimal(5000),true,"Texas"));
		mapEmp.put("6", new EmployeeDTO("Rod", "6", null, null, null, 28,new BigDecimal(6000),false,"Florida"));		
		mapState.put("California", Constants.CALIFORNIA_TAX_RATE);
		mapState.put("Florida", Constants.FLORIDA_TAX_RATE);
		mapState.put("Texas", Constants.TEXAS_TAX_RATE);
		
	}

	public EmployeeDTO getEmployee(String empId) {
		return mapEmp.get(empId);
	}
}
