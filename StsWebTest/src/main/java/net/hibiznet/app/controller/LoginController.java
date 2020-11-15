package net.hibiznet.app.controller;

import java.util.HashMap;
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

@Controller
@RequestMapping("/login/*")
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	/**
	 * 
	 * @param req
	 * @param res
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest req, HttpServletResponse res, Locale locale, Model model) {
		logger.info(">>> login view <<<");

		return "jsp/login/login";
	}
	/**
	 * 
	 * @param req
	 * @param res
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public String loginProcess(HttpServletRequest req, HttpServletResponse res, HttpSession session, Locale locale, Model model) {
		
		logger.info(">>> login process <<<");
		
		String sId = req.getParameter("id") !=null ? (String)req.getParameter("id") : "";
		String sPassword = req.getParameter("password") !=null ? (String)req.getParameter("password") : "";
		
		session.setAttribute("userId", sId);
		session.setAttribute("userPassword", sPassword);
		session.setAttribute("userName", "LeeDongGil");
		//session.setAttribute("userName", "KimHongSu");
		session.setMaxInactiveInterval(30*60); // 30 min

		model.addAttribute("id", sId);
		model.addAttribute("password", sPassword);
		model.addAttribute("name", "LeeDongGil");
		//model.addAttribute("name", "KimHongSu");

		res.setHeader("P3P","CP='CAO PSA CONi OTR OUR DEM ONL'");
		
		return "main";
	}
	/**
	 * 
	 * @param req
	 * @param res
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest req, HttpServletResponse res, Locale locale, Model model) {
		logger.info(">>> logout view <<<");

		return "jsp/login/logout";
	}
	/**
	 * 
	 * @param req
	 * @param res
	 * @param session
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/logoutProcess", method = RequestMethod.POST)
	public String logoutProcess(HttpServletRequest req, HttpServletResponse res, HttpSession session, Locale locale, Model model) {
		
		logger.info(">>> logout process <<<");
		
		if(session !=null) {
			session.invalidate();
		}
		
		return "jsp/login/login";
	}	
	
}
