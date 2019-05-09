/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller;

import java.util.List;
 
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
import com.mycompany.taller.Paciente;
import com.mycompany.taller.PacienteDAO;
import java.net.UnknownHostException;
/**
 *
 * @author white
 */
@Path("/pacientes")
public class PacienteService {
    
      @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Paciente> getEmployees_JSON() throws UnknownHostException {
         HelloMongo m=new HelloMongo();
        List<Paciente> listOfCountries = m.show();
        
        return listOfCountries;
    }
    
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Paciente addPaciente(Paciente emp) {
        
        HelloMongo m = new HelloMongo();
        return m.add(emp);
    }
    
}
