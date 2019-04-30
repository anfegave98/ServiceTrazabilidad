/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "paciente")
@XmlAccessorType(XmlAccessType.FIELD)

public class Paciente {
  
    private String name;
    private String address;
    private String telephone;
    private String date;
    private String contacto;
    
    public Paciente() {
    }

    public Paciente(String name, String address, String telephone, String date, String contacto) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.date = date;
        this.contacto = contacto;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

   
    
}
