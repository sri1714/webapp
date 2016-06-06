package com.mkyong.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OUR_JAVA {

	private static int counter = 0;
	private static final String VIEW_INDEX = "index1";
	private static final String VIEW_INDEX2 = "sample";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(OUR_JAVA.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		
		model.addAttribute("message", "Welcome Polarite");
		model.addAttribute("counter", ++counter);
		logger.debug("[welcome] counter : {}", counter);

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_INDEX2;

	}

	@RequestMapping(value = "/{name1}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name1, ModelMap model) {

		model.addAttribute("message", "Welcome Polarite " + name1);
		model.addAttribute("counter", ++counter);
		logger.debug("[welcomeName] counter : {}", counter);
		return VIEW_INDEX;

	}

}