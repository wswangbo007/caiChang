package com.caichang.util;

import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.bigdata.model.employee.Employee;
import com.bigdata.service.employee.EmployeeService;

/**
 * 填充Employee Job
 * @author wangB
 */
public class InsertEmployeeData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private EmployeeService employeeService;
	
	public void InsertData() {
		int result = employeeService.addEmployeeList(new ArrayList<Employee>());
		System.out.println(result);
	}
	
}
