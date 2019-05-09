/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;


import com.mycompany.dao.loteEntranteDAO;
import com.mycompany.model.loteEntrante;
import java.net.UnknownHostException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author brown
 */
@Path("/loteEntrante")
public class loteEntranteService {
    
     @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<loteEntrante> getAllLoteEntrante() throws UnknownHostException {
         loteEntranteDAO m=new loteEntranteDAO();
        List<loteEntrante> list = m.getAllLoteEntrante();
        
        return list;
    }
    
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public loteEntrante addloteEntrante(loteEntrante emp) {
        
       loteEntranteDAO m = new loteEntranteDAO();
        return m.addLoteEntrante(emp);
    }
}
