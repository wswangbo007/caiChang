package com.caichang.web.victualdate;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.caichang.model.victualdate.VictualDateBuyModel;
import com.caichang.model.victualdate.VictualDateModel;
import com.caichang.service.victualdate.VictualDateService;
import com.google.common.collect.Maps;

/**
 * 蔬菜时间详细
 * @author wangB
 */
@Controller
@RequestMapping(value="victualDate")
public class VictualDateController {
	
	/**蔬菜时间购买*/
	@Autowired
	private VictualDateService victualDateService;

	/**
	 * 蔬菜时间跳转
	 * @return 页面路径
	 */
	@RequestMapping(value="addVictualDateToJsp")
	public String addVictualDateToJsp() {
		return "victualDate/addVictualDate";
	}

	/**
	 * 跳转至当天蔬菜展示页面
	 * @return 
	 */
	@RequestMapping(value="getVictualToJsp")
	public ModelAndView getVictualToJsp(VictualDateBuyModel victualDateBuyModel) {
		ModelAndView modelAndView = new ModelAndView("victualDate/victualByDateList");
		modelAndView.addObject("victualDate",victualDateBuyModel.getBuyVictualDate());
		return modelAndView;
	}
	
	/**
	 * 添加蔬菜时间详细对象
	 * @return Object JSON
	 */
	@RequestMapping(value="addVictualDate")
	@ResponseBody
	public Object addVictualDate(VictualDateBuyModel victualDateBuyModel) {
		Map<String,Object> resultMap = Maps.newHashMap();
		int result = victualDateService.addVictualDate(victualDateBuyModel);
		resultMap.put("result", result);
		return resultMap;
	}
	
	/**
	 * 查询各个日期清单个数
	 * @return 页面路径
	 */
	@RequestMapping(value="queryDateVictual")
	@ResponseBody
	public Object queryDateVictual() {
		Map<String,Object> paramsMap = Maps.newHashMap();
		Map<String,Object> resultMap = Maps.newHashMap();
		List<VictualDateModel> victualDateList = victualDateService.queryVictualDateByParams(paramsMap);
		resultMap.put("result", victualDateList);
		return resultMap;
	}
	
	/**
	 * 查询当天的蔬菜列表
	 * @param victualDateBuyModel
	 * @return
	 */
	@RequestMapping(value="getVictualDataByDate")
	@ResponseBody
	public Object getVictualDataByDate(VictualDateBuyModel victualDateBuyModel) {
		Map<String,Object> paramsMap = Maps.newHashMap();
		Map<String,Object> resultMap = Maps.newHashMap();
		paramsMap.put("buyVictualDate", victualDateBuyModel.getBuyVictualDate());
		List<VictualDateBuyModel> victualDateBuyList = victualDateService.queryVictualDateListByParams(paramsMap);
		resultMap.put("result", victualDateBuyList);
		return resultMap;
	}
	
}