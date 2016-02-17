package com.bigdata.web.employee;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bigdata.model.employee.SearchModel;
import com.bigdata.service.employee.EmployeeService;
import com.google.common.collect.Maps;

@Controller
@RequestMapping(value="employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

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
}