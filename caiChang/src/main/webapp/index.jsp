<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>蔬菜采购系统</title>
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css">
<script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
<script src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
</head>
<body>
	<div data-role="page">
		<div data-role="header">
			<h1>家和菜场蔬菜采购系统</h1>
		</div>
		<script type="text/javascript"
			src="<%=request.getContextPath()%>/static/jq/common/CommonJs.js"></script>
		<script type="text/javascript"
			src="<%=request.getContextPath()%>/static/index.js"></script>
		<div data-role="content">
			<form action="<%=request.getContextPath()%>/user/loginUser"
				method="post">
				<div data-role="fieldcontain">
					<label for="fname" class="ui-hidden-accessible">选择职能：</label>
					<select name="dictId" id="dictId">
					</select>
				</div>
				<div data-role="fieldcontain">
					<label for="fname" class="ui-hidden-accessible">登录</label>
					<input type="submit" value="登录" id="loginBtn" />
					</select>
				</div>
			</form>
		</div>
	</div>
</body>
</html>