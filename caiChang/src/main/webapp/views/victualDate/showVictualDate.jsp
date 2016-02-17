<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<title>采购蔬菜记录</title>
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css">
<script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
</head>
<body>
	<div data-role="page">
		<script type="text/javascript" src="<%=request.getContextPath()%>/static/jq/common/CommonJs.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/views/victualDate/victualDate.js"></script>
		<div data-role="header">
		    <h1>家和菜场蔬菜采购系统</h1>
		    <a href="<%=request.getContextPath()%>/views/victualDate/showVictualDate.jsp">返回</a>
		 </div>
		<div>
			<a href="<%=request.getContextPath()%>/opts/optsForJsp" data-role="button">设置</a>
			<a href="<%=request.getContextPath()%>/victualDate/addVictualDateToJsp" data-role="button">添加当天所购买的蔬菜</a>
		</div>
		<div data-role="content">
			<h2>采购时间列表</h2>
			<ul data-role="listview" id="victualDateOl">
			</ul>
		</div>
	</div>
</body>
</html>