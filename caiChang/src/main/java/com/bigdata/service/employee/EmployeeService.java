package com.bigdata.service.employee;

import java.util.List;
import java.util.Map;

import com.bigdata.model.employee.Employee;
import com.bigdata.model.employee.SearchModel;

/**
 * 测试
 * @author wangB
 */
public interface EmployeeService {

	/**
	 * 批量插入
	 * @param employeeList
	 * @return 
	 */
	int addEmployeeList(List<Employee> employeeList);
	
	/**
	 * 查询符合条件的个数
	 * @param searchModel
	 * @return Integer
	 */
	int getEmployeeDataCountbyParams(SearchModel searchModel);
	
	/**
	 * 查询符合条件的结果集
	 * @param searchModel
	 * @return 结果集  List<Employee>
	 */
	List<Employee> queryEmployeeListByParams(SearchModel searchModel);
	
	/**
	 * 查询符合条件的结果集
	 * @param searchModel
	 * @return Map
	 */
	Map<String,Object> getEmployeeMapByParams(SearchModel searchModel);
	
	/**
	 * 获取数据库中的所有数据个数
	 * @return
	 */
	int getEmployeeAllCount();
}