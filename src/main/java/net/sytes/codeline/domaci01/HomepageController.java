package net.sytes.codeline.domaci01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomepageController {

	@RequestMapping(method = RequestMethod.GET)
	public String showHomepage(ModelMap model) {
		model.addAttribute("indeks", "2325");
		
		return "homepage";
	}
	
}
