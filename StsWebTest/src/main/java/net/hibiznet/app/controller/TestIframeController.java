package net.hibiznet.app.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.hibiznet.app.HomeController;

@Controller
@RequestMapping("/test/iframe/*")
public class TestIframeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view(HttpServletRequest req, HttpServletResponse res, Locale locale, Model model) {
		logger.info(">>> view <<<");
		
		return "jsp/iframe/testIframe";
	}
	
	
	@RequestMapping(value = "/process", method = RequestMethod.GET)
	public String process(HttpServletRequest req, HttpServletResponse res, HttpSession session, Locale locale, Model model) {
		logger.info(">>> return process <<<");

		String userId = new String();
		String userName = new String();
		
		if(session != null) {
			userId = session.getAttribute("userId") !=null ? (String) session.getAttribute("userId") : "";
			userName = session.getAttribute("userName") !=null ? (String) session.getAttribute("userName") : "";
		}
		
		model.addAttribute("userId", userId);
		model.addAttribute("userName", userName);
		
		return "jsp/iframe/view";
	}	

}
