/**
 * 共用JS
 */

/**
 * AJAX
 */
var postAjax = function(url,data, type, dataType, successFun) {
	$.ajax({
		url : url,
		data : data,
		type : type,
		dataType : dataType,
		success : successFun
	});
}

/**
 * div 网格
 */
var divHtml = function(paramsArray) {
	var tempDivHtml = $("<div class='ui-grid-c' name="+paramsArray[0]+" align='center'><div class='ui-block-a' align='center'><div>"+paramsArray[1]+"</div></div><div class='ui-block-b' align='center'><div>"+paramsArray[2]+"</div></div><div class='ui-block-c' align='center'><div>"+paramsArray[3]+"</div></div></div>");
	return tempDivHtml;
}

/**
 * 复选框
 */
var checkBuy = function(param) {
	var tempInput = $("<input type='checkbox' name='isBuy' value='red'>");
	tempInput.attr('checked',param);
	return tempInput;
}

/**
 * 返回LS列表
 */
var ls = function(href,params1,params2) {
	var tempLs = $("<li><a href="+href+">"+params1+"<span class='ui-li-count'>"+params2+"</span></a></li>");
	return tempLs;
}

/**
 * li html
 */
var liHtml = function(href,value) {
	if ('' == href) {
		href = "#";
	}
	var liHtml = "<li><a href="+href+">"+value+"</a></li>";
	return liHtml;
}

/**
 * option
 */
var optionHTML = function(value,valueHtml) {
	return $("<option value="+value+">"+valueHtml+"</option>");
}

/**
 * js获取项目根路径，如： http://localhost:8083/uimcardprj
 */
var getRootPath = function() {
	// 获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
	var curWwwPath = window.document.location.href;
	// 获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
	var pathName = window.document.location.pathname;
	var pos = curWwwPath.indexOf(pathName);
	// 获取主机地址，如： http://localhost:8083
	var localhostPaht = curWwwPath.substring(0, pos);
	// 获取带"/"的项目名，如：/uimcardprj
	var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
	return (localhostPaht + projectName);
}