/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.dao.vinedosDAO;
import com.mycompany.model.vinedo;
import java.util.List;
 
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.net.UnknownHostException;
/**
 *
 * @author white
 */
@Path("/vinedo")
public class vinedoServicio {
    
      @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<vinedo> getVinedo() throws UnknownHostException {
         vinedosDAO m=new vinedosDAO();
        List<vinedo> listOfCountries = m.showAll();
        
        return listOfCountries;
    }
    
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public vinedo addVinedo(vinedo emp) {
        vinedosDAO m = new vinedosDAO();
        return m.add(emp);
    }
    
    
   @DELETE
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
   public boolean deleteVinedo(vinedo emp){
   
               vinedosDAO m=new vinedosDAO();        
               boolean b= m.deleteVinedo(emp);
           
   return b;
   }
    
    
    
    
}
