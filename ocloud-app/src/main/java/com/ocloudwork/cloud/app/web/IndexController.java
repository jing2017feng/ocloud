package com.ocloudwork.cloud.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/index")
public class IndexController {
	@RequestMapping(value={"","/"})
	public String toIndex(ModelMap map){
		map.addAttribute("path", "/v1/ocloud-app");
		return "/index";
	}
}
