/**
 * 当天蔬菜.js
 */

var params = {};

/**
 * 初始化
 */
var initParams = function() {
	params.bigDiv = $("#bigDiv");
	params.victualDate = $("#victualDate");
}

/**
 * 读取蔬菜列表根据时间
 */
var queryVictualList = function() {
	params.bigDiv.empty();			// 清空
	console.debug(params.victualDate.val());
	postAjax(getRootPath() + "/victualDate/getVictualDataByDate", {buyVictualDate : params.victualDate.val()}, "post", "json", function(data) {
		if (data) {
			var result = data.result;
			if (result && result.length > 0) {
				for (var i = 0, count = result.length; i < count; i++) {
					var paramsArray = new Array(
						result[i].buyVictualDateId,
						result[i].victualName,
						result[i].buyVictualWeight,
						result[i].dictValue
					);
					var tempDivHtml = divHtml(paramsArray);
					params.bigDiv.append(tempDivHtml);
				}
			}
		}
	});
}

/**
 * 预加载
 */
$(document).ready(function() {
	initParams();				// 初始化  参数
	queryVictualList();			// 初始化 动态列表
});