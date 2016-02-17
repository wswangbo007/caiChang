package com.caichang.web.victual;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.caichang.model.victual.VictualModel;
import com.caichang.service.victual.VictualService;
import com.google.common.collect.Maps;

/**
 * 蔬菜控制
 * @author wangB
 */
@Controller
@RequestMapping(value="victual")
public class VictualController {
	
	@Autowired
	private VictualService victualService;
	
	/**-----------
	 * 跳转到JSP
	 * @return
	 */
	@RequestMapping(value="victualToJsp")
	public String victualToJsp() {
		return "victual/showVitual";
	}
	
	/**
	 * 蔬菜搜索页面
	 * @return
	 */
	@RequestMapping(value="showVictualListToJsp")
	public String showVictualListToJsp() {
		return "victual/showVitualList";
	}
	
	/**
	 * 获取蔬菜ID
	 * @return
	 */
	@RequestMapping(value="getVictualIdToJsp")
	public ModelAndView getVictualIdToJsp(VictualModel victualModel) {
		ModelAndView modelandView = new ModelAndView("victualDate/addVictualDate");
		try {
			victualModel.setVictualName(URLDecoder.decode(victualModel.getVictualName(),"UTF-8"));
			modelandView.addObject("victualModel", victualModel);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return modelandView;
	}
	
	/**
	 * 查询全部的蔬菜
	 * @return 
	 */
	@RequestMapping(value="queryVictualAll")
	@ResponseBody
	public Object queryVictualAll() {
		Map<String,Object> resultMap = Maps.newHashMap();
		List<VictualModel> victualList = victualService.queryVictualList();
		resultMap.put("result",victualList);
		return resultMap;
	}
	
	/**
	 * 添加蔬菜Input
	 * @param victualModel
	 * @return JSON
	 */
	@RequestMapping(value="addVictualByParams")
	@ResponseBody
	public Object addVictualByParams(VictualModel victualModel) {
		Map<String,Object> resultMap = Maps.newHashMap();
		int result = victualService.addVictualModel(victualModel);
		resultMap.put("result", result);
		return resultMap;
	}
}