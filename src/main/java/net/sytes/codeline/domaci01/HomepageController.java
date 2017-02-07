package net.sytes.codeline.domaci01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomepageController {

	@RequestMapping(method = RequestMethod.GET)
	public String showHomepage(ModelMap model) {
		model.addAttribute("indeks", "2325");
		
		return "login";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logout(@RequestParam(value = "error", required = false) String error, 
    		@RequestParam(value = "logout", required = false) String logout) {
		
        ModelAndView loginPage = new ModelAndView();
        if (error != null) {
            loginPage.addObject("error", "Podaci koje ste uneli nisu ispravni!");
        }
        if (logout != null) {
            loginPage.addObject("msg", "Odjava uspesna!");
        }
        loginPage.setViewName("login");
        
        return loginPage;
    }
	
}
