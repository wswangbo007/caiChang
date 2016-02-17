<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<title>设置</title>
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css">
<script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
</head>
<body>
	<div data-role="page">
		<div data-role="header">
		    <h1>家和菜场蔬菜采购系统</h1>
		    <a href="<%=request.getContextPath()%>/views/victualDate/showVictualDate.jsp">返回</a>
		 </div>
		<div data-role="content">
			<div data-role="content">
				<h2>设置</h2>
				<ol data-role="listview">
					 <li><a href="<%=request.getContextPath()%>/victual/victualToJsp">设置蔬菜</a></li>
				     <li><a href="<%=request.getContextPath()%>/unit/unitToJsp"">设置单位</a></li>
				</ol>
			</div>
		</div>
	</div>
</body>
</html>