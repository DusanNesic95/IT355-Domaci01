/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sytes.codeline.domaci08.dao;

import java.util.List;
import net.sytes.codeline.domaci08.entities.Soba;

/**
 *
 * @author Dusan
 */
public interface SobaDao {
     
    public boolean addSoba(Soba soba);
    public boolean editSoba(Soba soba);
    public boolean deleteSoba(Soba soba);
    public Soba getSobaById(int id);
    public List<Soba> getSobe();
}
