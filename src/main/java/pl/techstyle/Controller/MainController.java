package pl.techstyle.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pl.techstyle.Service.PersonService;

@Controller
public class MainController {
	
	@Autowired
	PersonService service;
	
	@GetMapping("/")
	public ModelAndView index(){
		ModelAndView m = new ModelAndView();
		m.setViewName("index");
		return m;
	}
	
	
	@GetMapping(value="/allFemale")
	public ModelAndView getAllFemale() {
		ModelAndView m= new ModelAndView();
		m.addObject("persons",service.getAllFemale());
		m.setViewName("table");
		return m;
	}
	@GetMapping(value="/searchCity")
	public ModelAndView getCities(@RequestParam(value="city") String name) {
		ModelAndView m= new ModelAndView();
		m.addObject("persons",service.getCities(name));
		m.setViewName("table");
		return m;
	}
}
