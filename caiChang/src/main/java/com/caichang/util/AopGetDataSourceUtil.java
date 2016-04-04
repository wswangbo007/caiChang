package com.caichang.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 动态得到切入的包名
 * @author wangB
 */
@Component
@Aspect
public class AopGetDataSourceUtil {
	
	@Pointcut("execution(* com.caichang.service.*.impl.*.*(..))")
	private void aspectCaiChang(){}
	
	@Pointcut("execution(* com.bigdata.service.*.impl.*.*(..))")
	private void aspectMyCat(){}

	/**
	 * 获得包名切换数据源
	 * @param joinpoint
	 * @throws Throwable 
	 */
	@Before("aspectCaiChang() || aspectMyCat()")
	public void getPageName(JoinPoint point) throws Throwable {
		Object obj = point.getTarget();
		String pageName = obj.getClass().getPackage().toString();
		System.err.println(pageName);
		if (pageName.contains("caichang")) {
			DbContextHolder.setDbType(DataSourceTypeName.CAICHANG);
		} else if (pageName.contains("bigdata")) {
			DbContextHolder.setDbType(DataSourceTypeName.MYCAT);
		}
	}
}