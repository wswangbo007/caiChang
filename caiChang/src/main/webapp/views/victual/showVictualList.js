/**
 * 蔬菜列表
 */

var params = {};		// 全局对象

$(document).ready(function(){
	queryVictualList();			// 获取全部蔬菜
});


/**
 * AJAX 获取全部蔬菜,并且生成蔬菜列表
 */
var queryVictualList = function() {
	$("#victualList").empty();		// 清空
	postAjax(getRootPath() + "/victual/queryVictualAll", {}, "post", "json", function(data){
		if (data) {
			var result = data.result;
			if (result && result.length > 0) {
				for (var i = 0, count = result.length; i < count; i++) {
					var href = getRootPath() + "/victual/getVictualIdToJsp" + "?victualId="+result[i].victualId + "&victualName=" +  encodeURI(encodeURI(result[i].victualName));
					var li = liHtml(href, result[i].victualName);
					$("#victualList").append(li);
					$("#victualList").listview('refresh');
				}
			}
		}
	});
}