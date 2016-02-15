/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skillsassessment.model;

import javax.ejb.Stateless;

/**
 *
 * @author alej0
 */
@Stateless
public class UserBean {

    private String mail;
    private String name;
    private int idRole;
    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRol() {
        return idRole;
    }

    public void setRol(int rol) {
        this.idRole = rol;
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
