/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mynharcorp.beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Harold M Bonilla L
 */
@Named(value = "personaBean")
@RequestScoped
public class PersonaBean {
    
    
    private String nombre;
    private String mensaje;

    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public void saludar(){
        this.mensaje = "Hola, tu nombre es: "+ this.nombre;
    }
}
