package com.caichang.web.opts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 设置控制器
 * @author wangB
 */
@Controller
@RequestMapping(value="opts")
public class OptsController {
	
	/**
	 * OPTS
	 * @return
	 */
	@RequestMapping(value="optsForJsp")
	public String optsForJsp() {
		return "opts/opts";
	}
	
}
