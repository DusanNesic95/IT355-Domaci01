/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sytes.codeline.domaci08;

import net.sytes.codeline.domaci08.dao.HotelDao;
import net.sytes.codeline.domaci08.dao.SobaDao;
import net.sytes.codeline.domaci08.entities.Hotel;
import net.sytes.codeline.domaci08.entities.Soba;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dusan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/DispatcherServlet-servlet.xml"})
public class HotelSobaControllerTest {
    
    @Autowired
    private SobaDao sobaDao;

    private Soba soba;
    
    @Autowired
    private HotelDao hotelDao;

    private Hotel hotel;
    
     @Before
    public void setUp() {
            soba = new Soba();
            soba.setSobaId(10);
            soba.setBrojKreveta(2);
            soba.setVelicina(30);
            soba.setKupatilo("Da");
            soba.setTv("Da");
            soba.setKlima("Ne");
            soba.setCenaPoDanu(38);
            
            hotel = new Hotel();
            hotel.setHotelId(10);
            hotel.setNaziv("Dusan's Hotel");
            hotel.setAdresa("Nis");
            hotel.setBrojZvezdica(5);
    }
    
    @Test
    @Transactional
    public void testAddSoba() {
            boolean result = sobaDao.addSoba(soba);

            assertTrue(result);
    }   
    
    @Test
    @Transactional
    public void testEditSoba() {
            boolean result = sobaDao.editSoba(soba);

            assertTrue(result);
    } 

    @Test
    @Transactional
    public void testAddHotel() {
            boolean result = hotelDao.addHotel(hotel);

            assertTrue(result);
    }
    
    @Test
    @Transactional
    public void testEditHotel() {
            boolean result = hotelDao.editHotel(hotel);

            assertTrue(result);
    } 
}
