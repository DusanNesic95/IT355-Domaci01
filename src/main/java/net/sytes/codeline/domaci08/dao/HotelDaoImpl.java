/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sytes.codeline.domaci08.dao;

import java.util.List;
import javax.transaction.Transactional;
import net.sytes.codeline.domaci08.entities.Hotel;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dusan
 */
@Repository
public class HotelDaoImpl implements HotelDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public HotelDaoImpl() {}
    
    public HotelDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public boolean addHotel(Hotel hotel) {
        sessionFactory.getCurrentSession().save(hotel);
        return true;
    }

    @Override
    @Transactional
    public boolean editHotel(Hotel hotel) {
        sessionFactory.getCurrentSession().saveOrUpdate(hotel);
        return true;
    }

    @Override
    @Transactional
    public boolean deleteHotel(Hotel hotel) {
        sessionFactory.getCurrentSession().delete(hotel);
        return true;
    }
    
    @Override
    @Transactional
    public Hotel getHotelById(int id) {
        Hotel hotel = (Hotel) sessionFactory.getCurrentSession().createCriteria(Hotel.class).add(Restrictions.eq("hotelId", id)).uniqueResult();
        return hotel;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<Hotel> getHoteli() {
        List<Hotel> results = (List<Hotel>) sessionFactory.getCurrentSession().createCriteria(Hotel.class).list();
        return results;
    }
}

