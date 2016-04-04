package com.caichang.service.dict.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.caichang.dao.dict.DictDao;
import com.caichang.model.dict.DictModel;
import com.caichang.service.dict.DictService;
import com.google.common.collect.Lists;

/**
 * 字典
 * @author wangB
 */
@Service("dictService")
public class DictServiceImpl implements DictService {
	
	@Resource(name="dictDao")
	private DictDao dictDao;
	
	public List<DictModel> getDictList(Map<String, String> paramMap) {
		System.err.println("SERVICE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		List<DictModel> dictList = Lists.newArrayList();
		if (null != paramMap && !paramMap.isEmpty()) {
			dictList = dictDao.getDictList(paramMap);
		}
		return dictList;
	}

	@Override
	public int addDict(DictModel dictModel) {
		int result = 0;
		if (null != dictModel) {
			result = dictDao.addDict(dictModel);
		}
		return result;
	}
}