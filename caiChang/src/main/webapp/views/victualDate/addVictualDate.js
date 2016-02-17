/**
 * 主页面
 */

var params = {};

/**
 * 初始化参数函数
 */
var initParams = function() {
	params.victualId = $("#tempVictualId");		// 蔬菜ID
	params.buyVictualWeight = $("#buyVictualWeight");		// 数量
	params.dictId = $("#dictId");			// 单位
	params.submitBtn = $("#submitBtn");			// 提交form按钮
	params.victualForm = $("#victualForm");		// form
}

/**
 * 查询字典表中的 单位list
 */
var queryDictList = function() {
	postAjax(getRootPath() + "/dict/getDictByKey", {key : 2}, "post", "json", function(data) {
		console.debug(data);
		if (data) {
			var result = data.result;
			if (result && result.length > 0) {
				for (var i = 0, count = result.length; i < count; i++) {
					var options = optionHTML(result[i].dictId, result[i].dictValue);
					$("#dictId").append(options);
					console.debug(11111);
					$("#dictId").selectmenu("refresh");
				}
//				params.dictId.selectmenu('refresh');
			}
		}
	});
}

/**
 * 提交form
 */
var submitForm = function() {
	var requestParams = {
			victualId : $("#victualId").val(),
			buyVictualWeight : $("#buyVictualWeight").val(),
			dictId : $("#dictId").val()
	};
	if (checkParams(requestParams)) {
		postAjax(getRootPath() + "/victualDate/addVictualDate", requestParams, "post", "json", function(data) {
			if (data) {
				var result = data.result;
				if (result == 0) {
					alert("提交失败!");
				} else if (result == 1) {
					alert("提交成功!");
					// 清空value
					$("#victualId").val("");
					$("#tempVictualId").val("点击搜索蔬菜");
				}
			}
		});
	}
};

/**
 * 验证
 */
var checkParams = function(params) {
	var result = true;
	if (params) {
		if (!params.victualId) {
			alert("请点击蔬菜输入框,选择需要的蔬菜!");
			result = false;
		} else if (!params.buyVictualWeight) {
			alert("重量不能为空!");
			result = false;;
		}
	}
	return result;
}

/**
 * 跳转至蔬菜搜索页面
 */
var tapShowVictualList = function() {
	window.location.href = getRootPath() + "/victual/showVictualListToJsp";
};

/**
 * 初始化
 */
$(document).ready(function() {
	initParams();			// 初始化
	params.victualId.on('tap',tapShowVictualList);			// 参数列表
	params.submitBtn.on('tap',submitForm);					// 提交按钮
	queryDictList();		// 查询字典
});