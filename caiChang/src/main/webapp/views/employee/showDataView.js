/**
 * ---------- 搜索数据
 */

var params = {};			// 全局参数

var myScroll;

$(function() {
	// 初始化 iScroll 4 插件
//	myscroll=new iScroll("wrapper");
	initParams();		// 初始化
	params.searchIndex.keyup(searchIndexKeyUpFun);		// 字母输入框
	//params.selectIndex.change(selectIndexChangeFun);	// 数据库下拉框
	queryAllCount();									// 初始化查询数据库中employee总数据个数
	params.dataList.on('click',queryAllData);
});


/**
 * 下拉框 改变
 */
var selectIndexChangeFun = function() {
	params.selectIndexValue = $(this).val();
	if (params.selectIndexValue < 0) {
		params.selectIndexValue = "";
	}
	queryFun();
}

/**
 * 点击数据列表跳转页面
 */
var queryAllData = function() {
//	window.name = params;
	window.location.href = getRootPath() +  "/employee/showQueryDataToJsp?name=" + params.searchIndex.val();
}

/**
 * 输入框 keyUp
 */
var searchIndexKeyUpFun = function() {
	params.searchIndexValue = $(this).val();
	queryFun();
}

/**
 * 初始化参数
 */
var initParams = function() {
	params.searchIndex = $("#searchIndex");
//	params.selectIndex = $("#selectIndex");
	params.showDataCount = $("#showDataCount");
	params.showMaxCount = $("#showMaxCount");
	params.dataList = $("#dataList");
	params.time = $("#time");
}

/**
 * 查询当前数据库中的employee所有数据个数 
 */
var queryAllCount = function() {
	postAjax(getRootPath() + "/employee/allCount", {}, "post", "json", function(data) {
		if (data) {
			params.showMaxCount.html("数据库中所有数据个数: " + data.count);
		}
	});
}

/**
 * 查询参数函数
 */
var queryFun = function() {
	var queryParams = {
			searchIndex : params.searchIndexValue,
//			selectIndex : params.selectIndexValue,
			page : 0,
			size : 20
	};
	postAjax(getRootPath() + "/employee/dataCount", queryParams, "post", "json", function(data) {
		if (data) {
			var count = data.count;
			var dataList = data.result;
			params.showDataCount.html("当前查询数据为: " + count);
			params.time.html("查询时间 : " + data.time);
			params.dataList.empty();
			for (var i = 0,tempCount = dataList.length; i < tempCount; i++) {
				var tempListHtml = liHtml(getRootPath() + "employee/getEmployeeById?id=" + dataList[i].id,dataList[i].name);
				params.dataList.append(tempListHtml);
			}
		}
	});
}