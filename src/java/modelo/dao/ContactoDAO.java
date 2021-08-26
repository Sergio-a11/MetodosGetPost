/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.ContactoDTO;

/**
 *
 * @author Sergio Cruz
 */
public class ContactoDAO {
    private static final List<ContactoDTO> lista = new ArrayList<>();

    public ContactoDAO() {
    }
    
    public boolean crear (ContactoDTO c)
    {
        if(c!=null)
        {
            lista.add(c);
            return true;
        }
        return false;
    }
    
    public List<ContactoDTO> readAll()
    {
        List<ContactoDTO> objL = null;
        objL = ContactoDAO.lista;
        return objL;
    }
    
    
}
