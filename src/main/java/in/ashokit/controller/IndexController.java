package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@GetMapping("/")
	public ModelAndView getIndexMsg()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("Index");
		return mav;
	}

}
