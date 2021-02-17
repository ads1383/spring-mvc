package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.model.Details;
import web.service.CarsService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@Autowired
	private CarsService carsService;

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.3.2 version by 2021 ");
		model.addAttribute("messages", messages);
		model.addAttribute("details", new Details());
		return "index";
	}

	@RequestMapping(value = "/cars", method = {RequestMethod.GET, RequestMethod.POST})
	public String printCars(@ModelAttribute("details") Details details, ModelMap model) {
		Integer count = details.getCount();
		model.addAttribute("cars", carsService.getCars(count));
		return "cars";
	}
	
}