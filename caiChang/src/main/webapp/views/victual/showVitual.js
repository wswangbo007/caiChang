/**
 * 蔬菜添加以及查询
 */
var params = {};

/**
 * 初始化当前页面的参数
 */
var initQueryParams = function() {
	params.addVictualBtn = $("#addVictualBtn");
	params.victualKey = $("#victualKey");
	params.victualName = $("#victualName");
	params.olVitualList = $("#olVitualList");
}

/**
 * 查询所有的蔬菜
 */
var queryVictualList = function() {
	params.olVitualList.empty();
	 postAjax(getRootPath() + "/victual/queryVictualAll",{},"post","json",function(data){
			if (data) {
				var result = data.result;
				if (result.length > 0) {
					for (var i = 0,count = result.length; i < count; i++) {
						var tmepLiHtml = liHtml('#', result[i].victualName);
						params.olVitualList.append(tmepLiHtml);
						params.olVitualList.listview('refresh');
					}
				}
			}
		});
}

/**
 * 预加载
 */
$(document).ready(function(){
	initQueryParams();				// 初始化
	// 查询所有的蔬菜数据
	queryVictualList();
	// 添加
	 $("#addVictualBtn").on('tap',addVictualFun);
});

/**
 * 添加蔬菜
 */
var addVictualFun = function(){
	 var requestParams = {
			 victualKey : params.victualKey.val(),
			 victualName : params.victualName.val()
	 };
	 postAjax(getRootPath() + "/victual/addVictualByParams",requestParams,"post","json",function(data){
			if (data) {
				var result = data.result;
				if (result == 1) {
					alert("保存成功!");
				} else {
					alert("保存失败!");
				}
			}
		});
 }