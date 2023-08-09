package net.hibiznet.app.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor {
	
    private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);	
	
	public boolean preHandle(HttpServletRequest request, 
	    HttpServletResponse response,
	    Object handler) throws Exception {
	        
	    HttpSession session = request.getSession();
	        
	    if(session.getAttribute("login") != null) {
	        
	        logger.info("current user is not logined");
	        
	        //saveDest(request);
	        
	        // 로그인하지 않은 사용자일 경우 로그인 페이지로 이동
	        response.sendRedirect("/user/login");
	        return false;
	    }
	        
	    // 로그인한 사용자일 경우 Controller 호출
	    return true;
	}	

	public void postHadler (HttpServletRequest request, 
		    HttpServletResponse response,
		    Object handler,
		    ModelAndView modelAndView) throws Exception {
		        
		    HttpSession session = request.getSession();
		    ModelMap modelMap = modelAndView.getModelMap();
		    Object userVO = modelMap.get("userVO");
		        
		    if(userVO != null) {
		        
		        // 로그인 성공시 Session에 저장후, 초기 화면 이동
		        logger.info("new login success");
		        session.setAttribute("LOGIN", userVO);
		        
		        // 이전 destination 불러오기
		        // response.sendRedirect("/");        
		        Object dest = session.getAttribute("dest");
		        
		        response.sendRedirect(dest != null ? (String)dest : "/");
		    }
		}
}
