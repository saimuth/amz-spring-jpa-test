package amz.gdpr.test.HerokuJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import amz.gdpr.test.HerokuJPA.service.HerokujpaTestService;
@Controller
public class HerokuJpaTestController {
	@Autowired
	private HerokujpaTestService herokujpaTestService;
	
	@RequestMapping(value = "/home")
	public ModelAndView homePage() {
		ModelAndView modelAndView = new ModelAndView();
		try {
		herokujpaTestService.updaateBulkData();
		
		modelAndView.setViewName("home");
		System.out.println("End of the call");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return modelAndView;
	}

}
