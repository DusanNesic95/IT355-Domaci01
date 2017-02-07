/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sytes.codeline.domaci08.dao;

import java.util.List;
import net.sytes.codeline.domaci08.entities.Hotel;

/**
 *
 * @author Dusan
 */
public interface HotelDao {
    public boolean addHotel(Hotel hotel);
    public boolean editHotel(Hotel hotel);
    public boolean deleteHotel(Hotel hotel);
    public Hotel getHotelById(int id);
    public List<Hotel> getHoteli();
}
