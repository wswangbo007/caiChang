package com.bigdata.web.employee;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bigdata.model.employee.Employee;
import com.bigdata.model.employee.SearchModel;
import com.bigdata.service.employee.EmployeeService;
import com.google.common.collect.Maps;

@Controller
@RequestMapping(value="employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="showQueryDataToJsp")
	public ModelAndView showQueryDataToJsp(String name) {
		ModelAndView modelAndView = new ModelAndView("employee/showDataViewList");
		modelAndView.addObject("name", name);
		return modelAndView; 
	}

	/**
	 * 获取相关参数的总个数
	 * @param searchModel
	 * @return
	 */
	@RequestMapping(value="dataCount")
	@ResponseBody
	public Object getDataCount(SearchModel searchModel) {
		long startTime=System.currentTimeMillis();
		Map<String,Object> result = employeeService.getEmployeeMapByParams(searchModel);
		long endTime=System.currentTimeMillis();
		float excTime=(float)(endTime-startTime)/1000;
		result.put("time", excTime);
		return result;
	}
	
	/**
	 * 查询employee所有数据个数
	 * @return
	 */
	@RequestMapping(value="allCount")
	@ResponseBody
	public Object getAllCount() {
		Map<String,Object> result = Maps.newHashMap();
		int count = employeeService.getEmployeeAllCount();
		result.put("count",count);
		return result;
	}
	
	/**
	 * 根据ID查询
	 * @return
	 */
	@RequestMapping(value="getEmployeeById")
	public ModelAndView getEmployeeById(Employee employee) {
		ModelAndView modelAndView = new ModelAndView("employee/dataDetails");
		Employee tempEmployee = employeeService.getEmployeeById(employee);
		modelAndView.addObject("employee",tempEmployee);
		return modelAndView;
	}
}