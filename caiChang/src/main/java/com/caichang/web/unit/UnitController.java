package com.caichang.web.unit;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caichang.model.dict.DictModel;
import com.caichang.service.dict.DictService;
import com.google.common.collect.Maps;

/**
 * 设置单位
 * @author wangB
 */
@Controller
@RequestMapping(value="unit")
public class UnitController {
	
	/**字典SERVICE*/
	@Autowired
	private DictService dictService;

	/**
	 * 跳转至单位
	 * @return 页面路径
	 */
	@RequestMapping(value="unitToJsp")
	public String unitToJsp() {
		return "unit/unit";
	}
	
	/**
	 * 添加单位
	 * @return Object JSON
	 */
	@RequestMapping(value="addUnit")
	@ResponseBody
	public Object addUnit(DictModel dictModel) {
		Map<String,Object> resultMap = Maps.newHashMap();
		int result = dictService.addDict(dictModel);
		resultMap.put("result",result);
		return resultMap;
	}
}
