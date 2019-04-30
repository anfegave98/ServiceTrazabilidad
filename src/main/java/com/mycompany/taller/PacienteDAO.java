package com.mycompany.taller;
 
import com.mycompany.taller.Paciente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
 
public class PacienteDAO {
 
    private static final Map<String, Paciente> empMap = new HashMap<String, Paciente>();
 
 
      static {
        initEmps();
    }
 
    private static void initEmps() {
        Paciente emp1 = new Paciente("Andres","Cra","1515612","13/01/98","mama");
   
 
        empMap.put(emp1.getName(), emp1);
        
    }
    
    public static Paciente getPaciente(String name) {
        return empMap.get(name);
    }
 
    public static Paciente addPaciente(Paciente emp) {
        empMap.put(emp.getName(), emp);
        return emp;
    }
 
    public static List<Paciente> getAllPacientes() {
        Collection<Paciente> c = empMap.values();
        List<Paciente> list = new ArrayList<Paciente>();
        list.addAll(c);
        return list;
    }
     
    List<Paciente> list;
 
}