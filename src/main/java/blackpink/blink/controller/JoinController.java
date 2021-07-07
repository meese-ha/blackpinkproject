package blackpink.blink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JoinController {
	
	@RequestMapping("/together/join") public ModelAndView join() {
		ModelAndView mv = new ModelAndView("together/join"); 
		return mv; 
		}
	
	@RequestMapping("/together/login") public ModelAndView login() {
		ModelAndView mv = new ModelAndView("together/login"); 
		return mv; 
		}

}
