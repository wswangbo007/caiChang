package com.caichang.web.dict;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caichang.model.dict.DictModel;
import com.caichang.service.dict.DictService;
import com.google.common.collect.Maps;

/**
 * 字典control
 * @author wangB
 */
@Controller
@RequestMapping(value="dict")
public class DictController {
	
	@Resource(name="dictService")
	private DictService dictService;

	/**
	 * 根据字典key获取当前字典对象
	 * @param key
	 * @return
	 */
	@RequestMapping(value="getDictByKey")
	@ResponseBody
	public Object getDictByKey(@RequestParam("key")String key) {
		Map<String,String> paramMap = Maps.newHashMap();
		Map<String,Object> resultMap = Maps.newHashMap();
		paramMap.put("key", key);
		List<DictModel> dictList = dictService.getDictList(paramMap);
		resultMap.put("result", dictList);
		return resultMap;
	}	
}