<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<script type="text/javascript" src="<%=request.getContextPath()%>/views/victualDate/addVictualDate.js"></script>
		<div data-role="header">
		    <h1>家和菜场蔬菜采购系统</h1>
		    <a href="<%=request.getContextPath()%>/views/victualDate/showVictualDate.jsp" data-role="button" data-icon="back">返回</a>
		 </div>
		<div data-role="content">
			<input type="hidden" value="${victualModel.victualName}" id="victualName">
			<form method="post" action="<%=request.getContextPath()%>/victualDate/addVictualDate" id="victualForm" class="validate">
				<div data-role="fieldcontain">
					<label for="fname" class="ui-hidden-accessible">选择蔬菜：</label>
					<input type="text" id="tempVictualId" value="${victualModel.victualName}" placeholder="点击搜索蔬菜" class="validate">
					<input type="hidden" name="victualId" id="victualId" value="${victualModel.victualId}" class="validate">
			    </div>
				<div data-role="fieldcontain">
				    <label for="points">数量:</label>
    				<input type="range" name="buyVictualWeight" id="buyVictualWeight" value="50" min="0" max="100" class="validate">
				</div>
				<div data-role="fieldcontain">
					<select name="dictId" id="dictId">
        			</select>
			    </div>
			    <br>
			    <br>
			    <br>
			    <br>
			    <div align="center" data-role="fieldcontain">
			    	<label for="points"></label>
			    	<input type="button" id="submitBtn" value="提交给采购员!">
			    </div>
			</form>
		</div>
	</div>
</body>
</html>