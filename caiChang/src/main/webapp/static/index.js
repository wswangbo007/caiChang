/**
 * 主页js
 */
$(document).ready(function(){
	postAjax(getRootPath()+"/dict/getDictByKey",{key:1},"post","json",function(data){
		console.debug(data);
		var result = data.result;
		if (result) {
			for (var i = 0,count = result.length; i < count; i++) {
				var value = result[i].dictId;
				var valueHtml = result[i].dictValue;
				var option = optionHTML(value,valueHtml);
				$("#dictId").append(option);
				$("#dictId").selectmenu("refresh");
			}
		}
	});
});