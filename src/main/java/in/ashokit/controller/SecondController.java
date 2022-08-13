package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
	
	@GetMapping("/Wish")
	public ModelAndView getWishMsg()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","All The Best");
		mav.setViewName("Wish");
		return mav;
		
	}

}
