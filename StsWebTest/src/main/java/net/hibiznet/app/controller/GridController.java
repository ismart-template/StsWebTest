package net.hibiznet.app.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GridController {
	
	private static final Logger logger = LoggerFactory.getLogger(GridController.class);

	@RequestMapping(value = "/grid/view", method = RequestMethod.GET)
	public String gridView(HttpServletRequest req, HttpServletResponse res, Locale locale, Model model) {
	
		logger.debug("### gridView ###");
		
		return "jsp/grid/gridList";
	}
}
