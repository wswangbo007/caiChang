package com.caichang.service.dict;

import java.util.List;
import java.util.Map;

import com.caichang.model.dict.DictModel;

/**
 * 字典
 * @author wangB
 */
public interface DictService {
	
	/**
	 * 根据字典key获取当前字典对象
	 * @param paramMap : key : {key : 字典字段}
	 * @return List<DictModel>
	 */
	List<DictModel> getDictList(Map<String,String> paramMap);
	
	/**
	 * 添加单位
	 * @param dictModel
	 * @return -1 : 参数异常 0:插入失败 1: 插入成功
	 */
	int addDict(DictModel dictModel);
}
