//package com.mycat.test;
//
//import java.util.ArrayList;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.bigdata.model.employee.Employee;
//import com.caichang.service.employee.EmployeeServiceImpl;
//
//
//public class MyCatConection {
//	
//	@SuppressWarnings("resource")
//	public static void main(String [] args) {
//		ApplicationContext app = new ClassPathXmlApplicationContext("app-config/app_context.xml");
//		EmployeeServiceImpl employeeServiceImpl = (EmployeeServiceImpl)app.getBean("employeeServiceImpl");
//		employeeServiceImpl.addEmployeeList(new ArrayList<Employee>());
//	}
//}
