package blackpink.blink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	

	@RequestMapping("/hello") public ModelAndView hello() {
		ModelAndView mv = new ModelAndView("hello"); 
		return mv; 
		}
	
	@RequestMapping("/blackpink") public ModelAndView blackpink() {
		ModelAndView mv = new ModelAndView("blackpink"); 
		return mv; 
		}
	 
}
