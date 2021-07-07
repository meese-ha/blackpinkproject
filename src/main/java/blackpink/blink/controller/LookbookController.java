package blackpink.blink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LookbookController {
	
	@RequestMapping("/lookbook/lookbookmain") public ModelAndView lookbookmain() {
		ModelAndView mv = new ModelAndView("lookbook/lookbookmain"); 
		return mv; 
		}
	
	
	
	
}
