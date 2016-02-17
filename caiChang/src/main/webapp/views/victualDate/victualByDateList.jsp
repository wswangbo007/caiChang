<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/victuiallist/victualByDateList.css">
</head>
<body>
	<div data-role="page">
		<script type="text/javascript"
			src="<%=request.getContextPath()%>/static/jq/common/CommonJs.js"></script>
		<script type="text/javascript"
			src="<%=request.getContextPath()%>/views/victualDate/victualByDateList.js"></script>
		<div data-role="header">
			<h1>家和菜场蔬菜采购系统</h1>
			<a href="<%=request.getContextPath()%>/views/victualDate/showVictualDate.jsp">返回</a>
		</div>
		<input type="hidden" id="victualDate" value="${victualDate}">
		<div class="ui-grid-c" align="center">
			<div class="ui-block-a">
				<div class="ui-bar ui-bar-b h10">名称</div>
			</div>
			<div class="ui-block-b">
				<div class="ui-bar ui-bar-b h10">数量</div>
			</div>
			<div class="ui-block-c">
				<div class="ui-bar ui-bar-b h10">单位</div>
			</div>
		</div>
		<div id="bigDiv">
		
		</div>
	</div>
</body>
</html>