package com.caichang.dao.dict;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.caichang.model.dict.DictModel;

/**
 * 字典Dao
 * @author Administrator
 *
 */
@Repository("dictDao")
public interface DictDao {

	/**
	 * 字典字段
	 * @param paramMap : key : {key key字段}
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
