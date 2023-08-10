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
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	
	@RequestMapping(value = "/user/userView", method = RequestMethod.GET)
	public String userView(HttpServletRequest req, HttpServletResponse res, Locale locale, Model model) {
		logger.debug(">>> user view <<<");

		return "user/userView";
	}
	
	@RequestMapping(value = "/user/userList", method = RequestMethod.POST)
	public String userList(HttpServletRequest req, HttpServletResponse res, Locale locale, Model model) {
		logger.debug(">>> user list <<<");

		return "user/userList";
	}	
	
	
}
