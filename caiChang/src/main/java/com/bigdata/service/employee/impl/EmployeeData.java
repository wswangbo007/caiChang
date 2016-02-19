package com.bigdata.service.employee.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bigdata.model.employee.Employee;
import com.caichang.util.UUIDUtil;

/**
 * 填充数据
 * @author wangB
 */
@Component
public class EmployeeData implements Runnable, Serializable {

	private static final long serialVersionUID = 1L;

	private List<Employee> employeeList;

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public EmployeeData() {};

	public EmployeeData(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	@Override
	public void run() {
		int i = 1;
		System.out.println(Thread.currentThread().getName());
		while (i <= 17000) {
			i++;
			int flag = Integer.valueOf(Thread.currentThread().getName());
			Employee employee = getEmployeeByFlag(flag);
			pullData(employee);
		}
	}
	
	/**
	 * synchronized Thread
	 * @param employee
	 */
	private synchronized void pullData(Employee employee) {
		this.employeeList.add(employee);
	}

	/**
	 * Employee
	 * 
	 * @param flag
	 * @return Employee
	 */
	private Employee getEmployeeByFlag(int flag) {
		Employee employee = new Employee();
		employee.setId(UUIDUtil.getUUID());
		employee.setName(mathValue());
		switch (flag) {
		case 1:
			employee.setShardingId(10000);
			break;
		case 2:
			employee.setShardingId(10010);
			break;
		case 3:
			employee.setShardingId(10020);
			break;
		default:
			employee.setShardingId(10000);
			break;
		}
		return employee;
	}

	/**
	 * 获取12位随机数 format : abcdse123456
	 * 
	 * @return
	 */
	private String mathValue() {
		StringBuilder sb = new StringBuilder();
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String random = String.valueOf((int) ((Math.random() * 9 + 1) * 100000));
		return sb.append(chars.charAt((int) (Math.random() * 26))).append(chars.charAt((int) (Math.random() * 26)))
				.append(chars.charAt((int) (Math.random() * 26))).append(chars.charAt((int) (Math.random() * 26)))
				.append(chars.charAt((int) (Math.random() * 26))).append(chars.charAt((int) (Math.random() * 26)))
				.append(random).toString();
	}
}