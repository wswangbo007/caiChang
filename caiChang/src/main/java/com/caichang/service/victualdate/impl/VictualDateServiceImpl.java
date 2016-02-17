package com.caichang.service.victualdate.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.caichang.dao.victualdate.VictualDateDao;
import com.caichang.model.victualdate.VictualDateBuyModel;
import com.caichang.model.victualdate.VictualDateModel;
import com.caichang.service.victualdate.VictualDateService;
import com.caichang.util.DateUtil;
import com.caichang.util.UUIDUtil;
import com.google.common.collect.Lists;

/**
 * 蔬菜时间购买服务
 * @author wangB
 *
 */
@Service
public class VictualDateServiceImpl implements VictualDateService {
	
	/**蔬菜时间服务*/
	@Autowired
	private VictualDateDao victualDateDao;

	/**
	 * 添加蔬菜时间对象
	 */
	@Override
	public int addVictualDate(VictualDateModel victualDateMode) {
		int result = 0;
		if (null != victualDateMode) {
			victualDateMode.setBuy(false);
			victualDateMode.setBuyVictualDateId(UUIDUtil.getUUID());
			victualDateMode.setBuyVictualDateKey(DateUtil.getTimeStamp());
			victualDateMode.setBuyVictualDate(DateUtil.getDateFormat(new Date()));
			victualDateMode.setCreateDate(DateUtil.getDateFormat(new Date()));
			victualDateMode.setUpdateDate("");
			victualDateMode.setState(true);
			result = victualDateDao.addVictualDate(victualDateMode);
		} else {
			result = -1;
		}
		return result;
	}

	/**
	 * 删除蔬菜时间,支持多个删除
	 */
	@Override
	public int deleteVictualDate(VictualDateModel victualDateMode) {
		int result = -1;
		if (null != victualDateMode) {
			String victualDateId = victualDateMode.getBuyVictualDateId();
			if (!StringUtils.isEmpty(victualDateId)) {
				String [] victualDateIdArray = victualDateId.split(",");
				List<String> victualDateIdList = Arrays.asList(victualDateIdArray);
				result = victualDateDao.deleteVictualDate(victualDateIdList);
			}
		}
		return result;
	}

	/**
	 * 更改
	 */
	@Override
	public int updateVictualDate(VictualDateModel victualDateMode) {
		int result = -1;
		if (null != victualDateMode) {
			victualDateMode.setUpdateDate(DateUtil.getDateFormat(new Date()));
			result = victualDateDao.updateVictualDate(victualDateMode);
		}
		return result;
	}

	/**
	 * 查询所有的蔬菜时间集合
	 */
	@Override
	public List<VictualDateModel> queryVictualDateByParams(Map<String, Object> paramsMap) {
		List<VictualDateModel> victualDateList = Lists.newArrayList();
		if (null != paramsMap) {
			victualDateList = victualDateDao.queryVictualDateByParams(paramsMap);
		}
		return victualDateList;
	}

	/**
	 * 根据参数查询当天的蔬菜列表
	 */
	@Override
	public List<VictualDateBuyModel> queryVictualDateListByParams(Map<String, Object> paramsMap) {
		List<VictualDateBuyModel> victualDateBuyList = Lists.newArrayList();
		if (null != paramsMap) {
			victualDateBuyList = victualDateDao.queryVictualDateListByParams(paramsMap);
		}
		return victualDateBuyList;
	}

}