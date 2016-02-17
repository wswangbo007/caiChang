/**
 * 单位
 */

var params = {};

/**
 * 初始化参数
 */
var initParams = function() {
	params.addUnitBtn = $("#addUnitBtn");
	params.ilUnitList = $("#ilUnitList");
	params.unitName = $("#unitName").val();
}

/**
 * 点击事件
 * 添加单位
 */
var topUnitBtn = function() {
	// 查询参数
	var queryParams = {
			dictName : 2,
			dictValue : $("#unitValue").val()
	};
	if (!queryParams.dictValue) {
		alert("请输入单位!");
	}
	postAjax(getRootPath()+"/unit/addUnit", queryParams, "post", "json", function(data){
		if (data) {
			try {
				var tempResult = data.result;
				if (tempResult == 0) {
					alert("保存失败!");
				} else if (tempResult == 1){
					alert("保存成功!");
					queryUnitList();		// 从新刷新ListView
				}
			} catch (e) {
				console.debug(e);
			}
		}
	});
};

/**
 * 查询所有的单位信息
 */
var queryUnitList = function() {
	params.ilUnitList.empty();		// 清空
	postAjax(getRootPath()+"/dict/getDictByKey", {key:2}, "post", "json", function(data){
		if (data) {
			if (data.result && data.result.length > 0 ) {
				var tempResult = data.result;
				for (var i = 0,count = tempResult.length; i < count;i++) {
					var tempLiHtml = liHtml("",tempResult[i].dictValue);
					params.ilUnitList.append(tempLiHtml);
					params.ilUnitList.listview('refresh');
				}
			}
		}
	});
};

$(document).ready(function(){
	initParams();			//初始化单位参数
	// 绑定事件 tap
	$("#addUnitBtn").on('tap',topUnitBtn);
	// 查询所有的单位列表
	queryUnitList();
});