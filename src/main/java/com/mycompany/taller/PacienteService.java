package com.mycompany.taller;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/paciente")
public class PacienteService {

    // URI:
    // /contextPath/servletPath/employees
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String getPaciente_JSON() throws UnknownHostException {
        // List<Paciente> listOfCountries = PacienteDAO.getAllPacientes();
        HelloMongo m = new HelloMongo();
        DBCollection a = m.setUp();
        DBCursor cursor = a.find();
        try {
            while (cursor.hasNext()) {
                DBObject object = cursor.next();
                System.out.println(object);
            }
        } finally {
            cursor.close();
        }
        return "";
    }



// URI:
// /contextPath/servletPath/employees/{empNo}
@GET
        @Path("/{paciNo}")
        @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
        public Paciente getPaciente(@PathParam("paciNo") String name) {
        return PacienteDAO.getPaciente(name);
    }

    // URI:
    // /contextPath/servletPath/employees
    @POST
        @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
        public Paciente addPaciente(Paciente emp) {
        return PacienteDAO.addPaciente(emp);
    }

    // URI:
    // /contextPath/servletPath/employees
}
