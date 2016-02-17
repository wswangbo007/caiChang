<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<title>展示所有的蔬菜</title>
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css">
<script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
</head>
<body>
	<div data-role="page">
		<script type="text/javascript"
	src="<%=request.getContextPath()%>/static/jq/common/CommonJs.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/views/victual/showVictualList.js"></script>
	<div data-role="header">
		<h1>家和菜场蔬菜采购系统</h1>
		<a href="<%=request.getContextPath()%>/views/opts/opts.jsp">返回</a>
	</div>
		<div data-role="header">
			<h1>添加蔬菜</h1>
		</div>
		<div data-role="content">
			  <ul data-role="listview" id="victualList" data-autodividers="true" data-inset="true" data-filter="true">
			  </ul>
		</div>
</div> 
</body>
</html>