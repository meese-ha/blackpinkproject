package blackpink.blink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MeminfoController {
	
	@RequestMapping("/meminfo/jennie") public ModelAndView jennie() {
		ModelAndView mv = new ModelAndView("meminfo/jennie"); 
		return mv; 
		}
	
	@RequestMapping("/meminfo/rose") public ModelAndView rose() {
		ModelAndView mv = new ModelAndView("meminfo/rose"); 
		return mv; 
		}
	
	@RequestMapping("/meminfo/lisa") public ModelAndView lisa() {
		ModelAndView mv = new ModelAndView("meminfo/lisa"); 
		return mv; 
		}
	
	@RequestMapping("/meminfo/jisoo") public ModelAndView jisoo() {
		ModelAndView mv = new ModelAndView("meminfo/jisoo"); 
		return mv; 
		}
	
	
	
	
}
