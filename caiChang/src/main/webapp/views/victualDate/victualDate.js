/**
 * 主页面
 */

var params = {};

/**
 * 初始化参数函数
 */
var initParams = function() {
	params.victualDateOl = $("#victualDateOl");
}

/**
 * 查询日期
 */
var queryDateVictual = function() {
	params.victualDateOl.empty();
	postAjax(getRootPath() + "/victualDate/queryDateVictual", {}, "post", "json", function(data) {
		if (data) {
			console.debug(data);
			var result = data.result;
			for (var i = 0, count = result.length; i < count; i++) {
				params.victualDateOl.append(ls(getRootPath() + "/victualDate/getVictualToJsp?buyVictualDate=" + result[i].buyVictualDate,result[i].buyVictualDate,result[i].numCount));
				params.victualDateOl.listview('refresh');
			}
		}
	});
}

$(document).ready(function() {
	initParams();			// 初始化
	queryDateVictual();		// 查询
});