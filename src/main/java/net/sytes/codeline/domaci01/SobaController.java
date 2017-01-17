package net.sytes.codeline.domaci01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.sytes.codeline.domaci02.Soba;
import net.sytes.codeline.domaci03.SobaDao;

@Controller
@RequestMapping("/soba")
public class SobaController {
	
	@SuppressWarnings("unused")
	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private SobaDao sobaDao;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("dodajSobu", "command", new Soba());
	}
	
	@RequestMapping(value = "/dodajSobu", method = RequestMethod.POST)
	public String dodajSobu(@ModelAttribute Soba soba, ModelMap model) {
		model.addAttribute("brojKreveta", soba.getBrojKreveta());
		model.addAttribute("velicina", soba.getVelicina());
		model.addAttribute("kupatilo", soba.isKupatilo());
		model.addAttribute("tv", soba.isTv());
		model.addAttribute("klima", soba.isKlima());
		model.addAttribute("cenaPoDanu", soba.getCenaPoDanu());
		sobaDao.addSoba();
		
		return "prikaziSobu";
	}
	
}
