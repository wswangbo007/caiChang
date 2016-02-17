package com.bigdata.service.employee.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.dao.employee.EmployeeDao;
import com.bigdata.model.employee.Employee;
import com.bigdata.model.employee.SearchModel;
import com.bigdata.service.employee.EmployeeService;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeData employeeData = null;

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public int addEmployeeList(List<Employee> employeeList) {
		employeeData = new EmployeeData(employeeList);
		Thread th = null;
		for (int i = 1, count = 3; i <= count; i++) {
			th = new Thread(employeeData);
			th.setName(String.valueOf(i));
			th.start();
			try {
				th.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		List<Employee> tempEmployeeList = employeeData.getEmployeeList();
		System.out.println(tempEmployeeList.size());
		int result = employeeDao.addEmployeeList(tempEmployeeList);
		return result;
	}

	/**
	 * 查询符合条件的个数
	 */
	@Override
	public int getEmployeeDataCountbyParams(SearchModel searchModel) {
		int result = 0;
		if (null != searchModel) {
			result = employeeDao.getEmployeeDataCountbyParams(searchModel);
		}
		return result;
	}

	/**
	 * 查询符合条件的结果集
	 */
	@Override
	public List<Employee> queryEmployeeListByParams(SearchModel searchModel) {
		List<Employee> employeeList = null;
		if (null != searchModel) {
			employeeList = Lists.newArrayList();
			employeeList = employeeDao.queryEmployeeListByParams(searchModel);
		}
		return employeeList;
	}

	/**
	 * 查询符合条件的结果集
	 */
	@Override
	public Map<String, Object> getEmployeeMapByParams(SearchModel searchModel) {
		Map<String,Object> resultMap = null;
		if (null != searchModel) {
			resultMap = Maps.newHashMap();
			List<Employee> employeeList = this.queryEmployeeListByParams(searchModel);
			int count = this.getEmployeeDataCountbyParams(searchModel);
			resultMap.put("result", employeeList);
			resultMap.put("count", count);
		}
		return resultMap;
	}
	
	@Override
	public int getEmployeeAllCount() {
		return employeeDao.getEmployeeAllCount();
	}
}