/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sytes.codeline.domaci08;

import javax.servlet.http.HttpServletRequest;
import net.sytes.codeline.domaci08.dao.HotelDao;
import net.sytes.codeline.domaci08.dao.SobaDao;
import net.sytes.codeline.domaci08.entities.Hotel;
import net.sytes.codeline.domaci08.entities.Soba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dusan
 */
@Controller
@RequestMapping("/")
public class HotelSobaController {
    
    @Autowired
    private SobaDao sobaDao;
    
    @Autowired
    private HotelDao hotelDao;
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showIndex(ModelMap model) {
        return "index";
    }
    
    @RequestMapping(value = "/addSoba", method = RequestMethod.GET)
    public String addSoba(Model model) {
        model.addAttribute("soba", new Soba());
        return "addSoba";
    }
    
    @RequestMapping(value = "/editsoba/{id}", method = RequestMethod.GET)
    public String addSoba(@PathVariable("id") int id, Model model) {
        Soba soba = sobaDao.getSobaById(id);
        model.addAttribute("soba",soba);
        return "addSoba";
    }
    
    @RequestMapping(value = "/addSoba", method = RequestMethod.POST)
    public ModelAndView addSoba(@ModelAttribute("soba") Soba soba, ModelAndView model) {
        boolean added = sobaDao.addSoba(soba);
        model.addObject("successMsg", "Soba je dodata");
        model.addObject("soba",soba);
        return model;
    }
    
    @RequestMapping(value = "/seeSoba", method = RequestMethod.GET)
    public ModelAndView getSobe(ModelAndView model) {
        model.addObject("sobe",sobaDao.getSobe());
        model.addObject("soba", new Soba());
        return model;
    }
    
    @RequestMapping(value = "/deletesoba/{id}", method =
    RequestMethod.GET)
    public String deleteSoba(@PathVariable("id") int id, HttpServletRequest request) {
        Soba soba = sobaDao.getSobaById(id);
        if (soba == null) {
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }
        sobaDao.deleteSoba(soba);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
    
    @RequestMapping(value = "/addHotel", method = RequestMethod.GET)
    public String addHotel(Model model) {
        model.addAttribute("hotel", new Hotel());
        return "addHotel";
    }
    
    @RequestMapping(value = "/edithotel/{id}", method = RequestMethod.GET)
    public String addHotel(@PathVariable("id") int id, Model model) {
        Hotel hotel = hotelDao.getHotelById(id);
        model.addAttribute("hotel",hotel);
        return "addHotel";
    }
    
    @RequestMapping(value = "/addHotel", method = RequestMethod.POST)
    public ModelAndView addGost(@ModelAttribute("hotel") Hotel hotel, ModelAndView model) {
        boolean added = hotelDao.addHotel(hotel);
        model.addObject("successMsg", "Hotel je dodat");
        model.addObject("hotel",hotel);
        return model;
    }
    
    @RequestMapping(value = "/seeHotel", method = RequestMethod.GET)
    public ModelAndView getHoteli(ModelAndView model) {
        model.addObject("hoteli",hotelDao.getHoteli());
        model.addObject("hotel", new Hotel());
        return model;
    }
    
    @RequestMapping(value = "/deletehotel/{id}", method = RequestMethod.GET)
    public String deleteHotek(@PathVariable("id") int id, HttpServletRequest request) {
        Hotel hotel = hotelDao.getHotelById(id);
        if (hotel == null) {
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }
        hotelDao.deleteHotel(hotel);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
}
