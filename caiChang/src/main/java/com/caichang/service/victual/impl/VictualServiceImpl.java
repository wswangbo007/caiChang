package com.caichang.service.victual.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caichang.dao.victual.VictualDao;
import com.caichang.model.victual.VictualModel;
import com.caichang.service.victual.VictualService;
import com.caichang.util.DateUtil;
import com.caichang.util.UUIDUtil;

/**
 * 蔬菜
 * @author wangB
 */
@Service
public class VictualServiceImpl implements VictualService {
	
	@Autowired
	private VictualDao victualDao;

	/**
	 * 添加蔬菜
	 */
	public int addVictualModel(VictualModel victualModel) {
		int result = -1;
		if (null != victualModel) {
			victualModel.setVictualId(UUIDUtil.getUUID());
			String createDate = DateUtil.getDateFormat(new Date());
			victualModel.setCreateDate(createDate);
			victualModel.setState("1");
			result = victualDao.addVictualModel(victualModel);
		} else {
			result = -1;
		}
		return result;
	}
	
	/**
	 * 更改蔬菜
	 */
	public int updateVictualModel(VictualModel victualModel) {
		int result = 0;
		if (null != victualModel) {
			result = victualDao.updateVictualModel(victualModel);
		} else {
			result = -1;
		}
		return result;
	}

	/**
	 * 查询所有的蔬菜
	 */
	public List<VictualModel> queryVictualList() {
		List<VictualModel> victualList = victualDao.queryVictualList();
		return victualList;
	}

	/**
	 * 获取单个对象
	 */
	public VictualModel getVictual(VictualModel victualModel) {
		VictualModel tempVictualModel = null;
		if (null != victualModel) {
			tempVictualModel = victualDao.getVictual(victualModel);
		}
		return tempVictualModel;
	}

}
