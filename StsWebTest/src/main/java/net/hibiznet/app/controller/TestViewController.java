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
@RequestMapping("/test/view/*")
public class TestViewController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestViewController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view(HttpServletRequest req, HttpServletResponse res, Locale locale, Model model) {
		logger.info(">>> view <<<");
		
		return "jsp/view/testView";
	}
	
	
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String process(HttpServletRequest req, HttpServletResponse res, HttpSession session, Locale locale, Model model) {
		logger.info(">>> return result <<<");

		String lang = req.getParameter("lang") !=null ? (String) req.getParameter("lang") : "";
		String timeZone = req.getParameter("timeZone") !=null ? (String) req.getParameter("timeZone") : "";
		String userId = req.getParameter("userId") !=null ? (String) req.getParameter("userId") : "";
		
		model.addAttribute("userId", userId);
		model.addAttribute("lang", lang);
		model.addAttribute("timeZone", timeZone);
		
		return "jsp/view/testResultView";
	}	

}
