package in.ashokit.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/Welcome")
	public ModelAndView getWelcomeMsg()
	{
		ModelAndView mav=new ModelAndView();
		 mav.addObject("msg","WELCOME TO Spring Boot and microservices");
		 mav.setViewName("Welcome");
		return mav;
	}

	@GetMapping("/Greet")
	public ModelAndView getGreetMsg()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Good Morning...!!");
		mav.setViewName("Greet");
		return mav;
	}
}
