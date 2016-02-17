package com.bigdata.dao.employee;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bigdata.model.employee.Employee;
import com.bigdata.model.employee.SearchModel;

@Repository
public interface EmployeeDao {

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
	 * 获取数据库中的所有数据个数
	 * @return
	 */
	int getEmployeeAllCount();
}
