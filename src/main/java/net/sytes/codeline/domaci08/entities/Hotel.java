/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sytes.codeline.domaci08.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Dusan
 */
@Entity
@Table(name="hotel")
public class Hotel {
    private int hotelId;
    private String naziv;
    private String adresa;
    private int brojZvezdica;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "hotel_id")
    public int getHotelId() {
        return hotelId;
    }
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }
    
    @Column(name = "naziv")
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    @Column(name = "adresa")
    public String getAdresa() {
        return adresa;
    }
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    
    @Column(name = "broj_zvezdica")
    public int getBrojZvezdica() {
        return brojZvezdica;
    }
    public void setBrojZvezdica(int brojZvezdica) {
        this.brojZvezdica = brojZvezdica;
    }

    @Override
    public String toString() {
        return "Hotel{" + "hotelId=" + hotelId + ", naziv=" + naziv + ", adresa=" + adresa + ", brojZvezdica=" + brojZvezdica + '}';
    }
}
