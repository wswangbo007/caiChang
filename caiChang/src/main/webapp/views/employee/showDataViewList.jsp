<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<title>show Data</title>
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/static/css/iScroll/iScroll.css">
<script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
<script
	src="<%=request.getContextPath()%>/static/jq/iScroll/iscroll.js"></script>
<script src="<%=request.getContextPath()%>/static/jq/common/CommonJs.js"></script>
<script
	src="<%=request.getContextPath()%>/views/employee/showDataViewList.js"></script>
</head>
<body>
	<input type="hidden" id="name" name="name" value="${name}"/>
	<div id="wrapper">
				<div id="scroller">
					<div id="pullDown">
						<span class="pullDownIcon"></span><span class="pullDownLabel">上啦刷新...</span>
					</div>
					<ul id="theList">
					</ul>
					<div id="pullUp">
						<span class="pullUpIcon"></span><span class="pullUpLabel">下拉加载更多...</span>
					</div>
				</div>
			</div>
</body>
</html>