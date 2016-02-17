<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<title>搜索数据</title>
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css">
<script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/victuiallist/victualByDateList.css">
<script
	src="<%=request.getContextPath()%>/static/jq/common/CommonJs.js"></script>
<script
	src="<%=request.getContextPath()%>/views/employee/showDataView.js"></script>
</head>
<body>
	<div data-role="page">
		<div data-role="header">
		    <h1>搜索数据</h1>
		 </div>
		<div data-role="content">
			<h2>搜索26个字母</h2>
			<div data-role="content">
  				<input type="text" id="searchIndex" placeholder="搜索单个字母">
				<select id="selectIndex">
					<option value="-1">全部</option>
					<option value="10000">10000</option>
					<option value="10010">10010</option>
					<option value="10020">10020</option>
				</select>
				<span id="showDataCount"></span>
				<span id="time"></span>
			</div>
			<div>
				<span id="showMaxCount"></span>
			</div>
			<div class="ui-grid-c" align="center">
<!-- 				<div class="ui-block-a"> -->
<!-- 					<div class="ui-bar ui-bar-b h10">UUID</div> -->
<!-- 				</div> -->
				<div class="ui-block-b">
					<div class="ui-bar ui-bar-b h10">索引</div>
				</div>
				<div class="ui-block-c">
					<div class="ui-bar ui-bar-b h10">标识</div>
				</div>
			</div>
			<div id="dataList">
			</div>
		</div>
	</div>
</body>
</html>