package shop.cofin.oracle.common;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("contextPath")
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(
			HttpSession session, 
			HttpServletRequest request) {
		String contextPath = request.getContextPath();
		session.setAttribute("contextPath", contextPath);
		return "index";
	}
	@RequestMapping("/move/{dir}/{jsp}")
	public String join(@PathVariable String dir, @PathVariable String jsp) {
		if(dir.contentEquals("home")) {return "redirect:/";}
		return dir+"/"+jsp;
	}
	/*customer*/
	
	@RequestMapping(value = "/user/regist", method = RequestMethod.GET)
	public String register() {		
		return "/user/Register";
	}
	
	@RequestMapping(value = "/user/login", method = RequestMethod.GET)
	public String login() {
		return "/user/Login";
	}
	@RequestMapping(value = "/user/update", method = RequestMethod.GET)
	public String update() {
		return "/user/Update";
	}
	@RequestMapping(value = "/user/detail", method = RequestMethod.GET)
	public String detail() {
		return "/user/Detail";
	}
	
	/* books */
	@RequestMapping(value = "/books/regist", method = RequestMethod.GET)
	public String bookRegist() {
		return "/book/Register";
	}
	@RequestMapping(value = "/books/update", method = RequestMethod.GET)
	public String bookUpdate() {
		return "/book/Update";
	}
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String bookDetail() {
		return "/book/Detail";
	}
	
	/*order*/
	@RequestMapping(value = "/orders/regist", method = RequestMethod.GET)
	public String orderRegist() {
		return "/order/Register";
	}
	@RequestMapping(value = "/orders/update", method = RequestMethod.GET)
	public String orderUpdate() {
		return "/order/Update";
	}
	@RequestMapping(value = "/orders/detail", method = RequestMethod.GET)
	public String orderDetail() {
		return "/order/Detail";
	}
	
	/*publisher*/
	@RequestMapping(value = "/publishers/regist", method = RequestMethod.GET)
	public String publisherRegist() {
		return "/publisher/Register";
	}
	@RequestMapping(value = "/publishers/detail", method = RequestMethod.GET)
	public String publisherDetail() {
		return "/publisher/Detail";
	}
	@RequestMapping(value = "/publishers/update", method = RequestMethod.GET)
	public String publisherUpdate() {
		return "/publisher/Update";
	}
	
}

