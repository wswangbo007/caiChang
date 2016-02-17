package com.caichang.dao.victual;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.caichang.model.victual.VictualModel;

/**
 * 蔬菜
 * @author wangB
 */
@Repository
public interface VictualDao {
	
	/**
	 * 添加蔬菜
	 * @param victualModel
	 * @return -1 : Param Exception 0 : error 1 : success
	 */
	int addVictualModel(VictualModel victualModel);

	/**
	 * 更改蔬菜
	 * @param victualModel
	 * @return -1 : Param Exception 0 : error 1 : success
	 */
	int updateVictualModel(VictualModel victualModel);
	
	/**
	 * 查询所以的蔬菜
	 * @return List<VitualModel>
	 */
	List<VictualModel> queryVictualList();
	
	/**
	 * 获取单个对象
	 * @param victualModel : {@link VictualModel}
	 * @return VictualModel : return {@link VictualModel}
	 */
	VictualModel getVictual(VictualModel victualModel);
}
