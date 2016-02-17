package com.caichang.dao.victualdate;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.caichang.model.victualdate.VictualDateBuyModel;
import com.caichang.model.victualdate.VictualDateModel;

/**
 * 蔬菜时间购买DAO
 * @author wangB
 */
@Repository
public interface VictualDateDao {

	/**
	 * 添加蔬菜时间购买对象
	 * @param victualDateMode : 蔬菜时间购买对象
	 * @return -1 : params is {@link Exception} <br>
	 * 0 : error <br>
	 * 1 : success
	 */
	int addVictualDate(VictualDateModel victualDateMode);
	
	/**
	 * 删除蔬菜时间购买对象
	 * @param victualDateMode : 蔬菜时间购买对象
	 * @return -1 : params is {@link Exception} <br>
	 * 0 : error <br>
	 * 1 : success
	 */
	int deleteVictualDate(List<String> paramList);
	
	/**
	 * 更改蔬菜时间购买对象
	 * @param victualDateMode : 蔬菜时间购买对象
	 * @return -1 : params is {@link Exception} <br>
	 * 0 : error <br>
	 * 1 : success
	 */
	int updateVictualDate(VictualDateModel victualDateMode);
	
	/**
	 * 查询蔬菜时间购买集合
	 * @param victualDateMode : 蔬菜时间购买对象
	 * @return 蔬菜时间购买集合
	 */
	List<VictualDateModel> queryVictualDateByParams(Map<String,Object> paramsMap);
	
	/**
	 * 根据参数查询当天的蔬菜列表
	 * @param victualDateMode
	 * @return 蔬菜时间购买对象
	 */
	List<VictualDateBuyModel> queryVictualDateListByParams(Map<String,Object> paramsMap);
}