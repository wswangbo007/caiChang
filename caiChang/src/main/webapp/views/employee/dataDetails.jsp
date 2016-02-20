<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据详情</title>
</head>
<body>
	<div>
		<table>
			<tr>
				<td>ID&nbsp;&nbsp;&nbsp;:</td>
				<td>${employee.id}</td>
			</tr>
			<tr>
				<td>索引 :</td>
				<td>${employee.name}</td>
			</tr>
			<tr>
				<td>标识 :</td>
				<td>${employee.shardingId}</td>
			</tr>
		</table>
	</div>
</body>
</html>