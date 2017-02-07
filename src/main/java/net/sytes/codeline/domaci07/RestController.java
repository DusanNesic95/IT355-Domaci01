/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sytes.codeline.domaci07;

import java.util.List;
import net.sytes.codeline.domaci08.dao.HotelDao;
import net.sytes.codeline.domaci08.dao.SobaDao;
import net.sytes.codeline.domaci08.entities.Hotel;
import net.sytes.codeline.domaci08.entities.Soba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Dusan
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private SobaDao sobaDao;
    
    @Autowired
    private HotelDao hotelDao;
    
    @RequestMapping(value = "/sobe", method = RequestMethod.GET)
    public ResponseEntity<List<Soba>> getSobe() {
        System.out.println("Fetching products");
        List<Soba> sobe = sobaDao.getSobe();
        if (sobe.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(sobe, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/soba/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Soba> getSoba(@PathVariable("id") int id) {
        System.out.println("Fetching product with id " + id);
        Soba soba = sobaDao.getSobaById(id);
        if (soba == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(soba, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/addsoba/", method = RequestMethod.POST)
    public ResponseEntity<Void> addSoba(@RequestBody Soba soba) {
        sobaDao.addSoba(soba);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/soba/{id}", method =  RequestMethod.PUT)
    public ResponseEntity<Soba> updateSoba(@PathVariable("id") int id, @RequestBody Soba soba) {
        soba.setSobaId(id);
        sobaDao.editSoba(soba);
        return new ResponseEntity<>(soba, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/soba/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Soba> deleteSoba(@PathVariable("id") int id) {
        Soba soba = sobaDao.getSobaById(id);
        if (soba == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        sobaDao.deleteSoba(soba);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/hoteli", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Hotel>> getHoteli() {
        List<Hotel> hoteli = hotelDao.getHoteli();
        if (hoteli.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(hoteli, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/hotel/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Hotel> getHotel(@PathVariable("id") int id) {
        Hotel hotel = hotelDao.getHotelById(id);
        if (hotel == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(hotel, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/addhotel/", method = RequestMethod.POST)
    public ResponseEntity<Void> addHotel(@RequestBody Hotel hotel) {
        hotelDao.addHotel(hotel);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/hotel/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Hotel> updateHotel(@PathVariable("id") int id, @RequestBody Hotel hotel) {
        hotel.setHotelId(id);
        hotelDao.editHotel(hotel);
        return new ResponseEntity<>(hotel, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/hotel/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Hotel> deleteHotel(@PathVariable("id") int id) {
        Hotel hotel = hotelDao.getHotelById(id);
        if (hotel == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        hotelDao.deleteHotel(hotel);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
